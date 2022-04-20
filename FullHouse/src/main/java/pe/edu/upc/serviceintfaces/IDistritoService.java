package pe.edu.upc.serviceintfaces;

import java.util.List;

import pe.edu.upc.entities.Distrito;

public interface IDistritoService {
	public void insert(Distrito d);

	public List<Distrito> list();

}
