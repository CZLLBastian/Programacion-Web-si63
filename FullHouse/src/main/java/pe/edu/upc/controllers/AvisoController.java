package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Aviso;
import pe.edu.upc.entities.Room;
import pe.edu.upc.serviceinterfaces.AvisoService;
import pe.edu.upc.serviceinterfaces.IRoomService;

@Named
@RequestScoped
public class AvisoController {
	@Inject
	private AvisoService Avservice;
	@Inject
	private IRoomService rService;

	// atributos
	private Aviso av;
	List<Aviso> listaAviso;
	List<Room> listahabitacion;

	// inicializar
	@PostConstruct
	public void init() {
		this.av=new Aviso();
		this.listahabitacion = new ArrayList<Room>();
		this.listaAviso = new ArrayList<Aviso>();
		this.list();
		this.listRooms();
	}

	// metodos a atender por peticiones

	public String newAviso() {
		this.setAv(new Aviso());
		return "Aviso.xhtml";
	}

	public void insertA() {
		try {
			Avservice.insertA(av);
		} catch (Exception e) {
			System.out.println("Error al insertar en el controlador");
		}
	}

	public void list() {
		try {
			listaAviso = Avservice.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controlador");
		}

	}
	
	public void listRooms() {
		try {
			listahabitacion = rService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en controller habitacion");
		}
	}

	// delete

	public void delete(Aviso ave) {
		try {
			Avservice.deleteA(ave.getIdAviso());
			this.list();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controlador");
		}
	}
	// modificar

	public String preUpdate(Aviso av) {
		this.setAv(av);
		return "modificarA.xhtml";
	}
	
	public void UpdateA() {
		try {
			Avservice.updateA(this.av);
		} catch (Exception e) {
			System.out.println("Error al modificar en el controlador");
		}
		
	}

	public Aviso getAv() {
		return av;
	}

	public void setAv(Aviso av) {
		this.av = av;
	}

	public List<Aviso> getListaAviso() {
		return listaAviso;
	}

	public void setListaAviso(List<Aviso> listaAviso) {
		this.listaAviso = listaAviso;
	}

	public List<Room> getListahabitacion() {
		return listahabitacion;
	}

	public void setListahabitacion(List<Room> listahabitacion) {
		this.listahabitacion = listahabitacion;
	}

	
	
	

}
