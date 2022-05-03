package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.IUniversidadDAO;
import pe.edu.upc.entities.Universidad;

public class UniversidadImpl implements IUniversidadDAO {
	@PersistenceContext(unitName = "FullHouse")
	private EntityManager em;

	@Transactional
	public void insert(Universidad u) {

		try {

			em.persist(u);

		} catch (Exception e) {

			System.out.println("Error al insertar Universidad en el DAO");

		}

	}

	@SuppressWarnings("unchecked")
	public List<Universidad> list() {
		List<Universidad> listaUniversidades = new ArrayList<Universidad>();
		try {
			Query jpql = em.createQuery("from Universidad u");
			listaUniversidades = (List<Universidad>) jpql.getResultList();

		} catch (Exception e) {
			System.out.println("Error al listar Universidad en DAO");
		}

		return listaUniversidades;
	}


	@Transactional
	@Override
	public void update(Universidad u) {
		try {
			em.merge(u);
		} catch (Exception e) {
			System.out.println("Error al actualizar universidad");
		}
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Universidad> findByNameUniversidad(Universidad u) {
		List<Universidad> lista=new ArrayList<Universidad>();
		try {
			Query q=em.createQuery("from Universidad u where u.fullNameUniversidad like ?1");
			q.setParameter(1,"%"+u.getFullNameUniversidad()+"%");
			lista=(List<Universidad>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar en el dao de universidad");
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		try {
			Universidad uni = em.find(Universidad.class, id);
			em.remove(uni);
		} catch (Exception e) {
			System.out.println("Error al eliminar en el DAO");
		}

	}

}
