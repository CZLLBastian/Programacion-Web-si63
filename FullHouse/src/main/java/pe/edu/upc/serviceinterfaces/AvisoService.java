package pe.edu.upc.serviceinterfaces;

import java.util.List;

import pe.edu.upc.entities.Aviso;

public interface AvisoService {
	
	public void insertA (Aviso av);
	
	public List<Aviso> list();
	
	public void deleteA (int idAviso);
	
	public void updateA (Aviso av);
}
