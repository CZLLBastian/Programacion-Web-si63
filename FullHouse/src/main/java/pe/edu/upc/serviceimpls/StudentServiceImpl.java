package pe.edu.upc.serviceimpls;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Student;
import pe.edu.upc.intfaces.IStudentDao;
import pe.edu.upc.serviceintfaces.IStudentService;

@Named
public class StudentServiceImpl implements IStudentService{
	@Inject
	private IStudentDao sDao;

	public List<Student> list() {
		return sDao.list();
	}
	@Override
	public void insert(Student e) {
		sDao.insert(e);		
	}
	

}
