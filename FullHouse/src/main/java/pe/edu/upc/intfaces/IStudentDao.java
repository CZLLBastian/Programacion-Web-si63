package pe.edu.upc.intfaces;

import java.util.List;

import pe.edu.upc.entities.Student;

public interface IStudentDao {

	public void insert(Student p);
	public List<Student> list();
	
}
