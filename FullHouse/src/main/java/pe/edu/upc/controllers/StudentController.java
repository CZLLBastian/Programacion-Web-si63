package pe.edu.upc.controllers;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Student;
import pe.edu.upc.serviceintfaces.IStudentService;

@Named
@RequestScoped
public class StudentController {

	@Inject
	private IStudentService sService;
	
	//Atributos
	private Student e;
	private List<Student> listaEstudiantes;
	
	//Inicializar
	@PostConstruct
	public void init() {
		this.listaEstudiantes = new ArrayList<Student>();
		this.e = new Student();
		this.list();
	}
	
	public String newStudent() {
		this.setE(new Student());
		return "estudiante.xhtml";
	}
	
	public void insert() {
		try {
			sService.insert(e);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller"+e.getStackTrace());
		}
	}
	
	public void list() {
		try {
			listaEstudiantes = sService.list();
		} catch (Exception e) {
			System.out.println("Error al insertar en el controller");
		}
	}

	public Student getE() {
		return e;
	}

	public void setE(Student e) {
		this.e = e;
	}

	public List<Student> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(List<Student> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}
	
	
}
