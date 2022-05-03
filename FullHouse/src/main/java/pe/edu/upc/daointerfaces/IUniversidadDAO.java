package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Universidad;

public interface IUniversidadDAO {

	public void insert(Universidad u);
	public List<Universidad> list();
	public void update(Universidad u);
	public List<Universidad> findByNameUniversidad(Universidad u);
	public void delete(int id);
	
}
