package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Arrendador;

public interface ArrendadorInterfaces {

	public void insert(Arrendador ar);

	public List<Arrendador> list();
	
	public void delete(int id);
	
	public void update(Arrendador ar);
	
	public List<Arrendador> findByNameArrend(Arrendador ar);

}
