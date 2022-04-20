package pe.edu.upc.intfaces;

import java.util.List;

import pe.edu.upc.entities.Universidad;

public interface IUniversidadDAO {

	public void insert(Universidad u);
	public List<Universidad> list();
}
