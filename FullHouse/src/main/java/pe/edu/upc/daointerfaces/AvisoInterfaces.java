package pe.edu.upc.daointerfaces;

import java.util.List;

import pe.edu.upc.entities.Aviso;


public interface AvisoInterfaces {

	public void insertA (Aviso av);
	
	public List<Aviso> list();
	
	public void deleteA (int idAviso);
	
	public void updateA (Aviso av);

}
