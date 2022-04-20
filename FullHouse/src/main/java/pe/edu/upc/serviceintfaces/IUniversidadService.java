package pe.edu.upc.serviceintfaces;

import java.util.List;

import pe.edu.upc.entities.Universidad;

public interface IUniversidadService {
	
	public void insert(Universidad u);
	public List<Universidad> list();

}
