package pe.edu.upc.impls;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pe.edu.upc.entities.Student;
import pe.edu.upc.intfaces.IStudentDao;

public class StudentImpl implements IStudentDao{

	@PersistenceContext(unitName = "FullHouse")
	private EntityManager em;
	
	public void insert(Student s) {
		try {
			em.persist(s);
		} catch (Exception e) {
			System.out.println("Error al insertar estudiante en el DAO");
		}	
	}

	@SuppressWarnings("unchecked")
	public List<Student> list() {
		List<Student> listaEstudiantes = new ArrayList<Student>();
		try {
			Query jpql = em.createQuery("from Student e");
			listaEstudiantes = (List<Student>) jpql.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar estudiante en DAO");
		}
		return listaEstudiantes;
	}
	
	
}
