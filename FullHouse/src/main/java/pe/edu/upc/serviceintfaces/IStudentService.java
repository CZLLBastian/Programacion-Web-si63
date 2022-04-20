package pe.edu.upc.serviceintfaces;

import java.util.List;

import pe.edu.upc.entities.Student;

public interface IStudentService {

	public void insert(Student e);
	public List<Student> list();
}
