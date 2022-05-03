package pe.edu.upc.serviceimpls;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerfaces.AvisoInterfaces;
import pe.edu.upc.entities.Aviso;
import pe.edu.upc.serviceinterfaces.AvisoService;

public class AvisoServiceImpls implements AvisoService{
	
	@Inject
	private AvisoInterfaces AvInt;

	public void insertA(Aviso av) {
		AvInt.insertA(av);

	}

	public List<Aviso> list() {
		// TODO Auto-generated method stub
		return AvInt.list();
	}

	
	@Override
	public void deleteA(int idAviso) {
		// TODO Auto-generated method stub
		AvInt.deleteA(idAviso);
	}

	@Override
	public void updateA(Aviso av) {
		// TODO Auto-generated method stub
		AvInt.updateA(av);
	
	}
}
