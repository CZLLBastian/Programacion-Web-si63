package pe.edu.upc.daoimpls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerfaces.AvisoInterfaces;
import pe.edu.upc.entities.Aviso;

public class AvisoImpls implements AvisoInterfaces{

	@PersistenceContext(unitName = "FullHouse")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertA (Aviso av) {
		try {
			em.persist(av);
		} catch (Exception e) {
			System.out.println("Error al insertar habitacion");
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Aviso> list(){
		List<Aviso> listahabitacion = new ArrayList<Aviso>();
		try {
			Query jpql = em.createQuery("from Aviso av");
			listahabitacion = (List<Aviso>) jpql.getResultList();
		}
			catch (Exception e) {
				System.out.println("Error al listar habitacion");
			}
			return listahabitacion;
		
	}
	
	@Transactional
	@Override
	public void deleteA (int idAviso) {
		try {
			Aviso av = em.find(Aviso.class, idAviso);
			em.remove(av);
		} catch (Exception e) {

			System.out.println("Error al eliminar en el dao");
		}
	}
	@Transactional
	@Override
	public void updateA (Aviso av) {
		try {
			em.merge(av);
		}catch(Exception e) {
			System.out.println("Error al modificar la habitacion en el implements");
		}
	}

}
