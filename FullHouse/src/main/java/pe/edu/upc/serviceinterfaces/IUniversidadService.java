package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Universidad;

public interface IUniversidadService {
	
	public void insert(Universidad u);
	public List<Universidad> list();
	public void update(Universidad s);
	public void delete(int id);
	public List<Universidad> findByNameUniversidad(Universidad u);
}
