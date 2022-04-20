package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.entities.Universidad;
import pe.edu.upc.intfaces.IUniversidadDAO;
import pe.edu.upc.serviceintfaces.IUniversidadService;


@Named
public class UniversidadServiceImpl implements IUniversidadService {
@Inject
	private IUniversidadDAO uDao;
	

	public void insert(Universidad u) {
		uDao.insert(u);
		
	}

	public List<Universidad> list() {
		// TODO Auto-generated method stub
		return uDao.list();
	}
	

}
