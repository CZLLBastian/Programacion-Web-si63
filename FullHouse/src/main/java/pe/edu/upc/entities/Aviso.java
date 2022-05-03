package pe.edu.upc.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Aviso")
public class Aviso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAviso;
	
	@Column(name = "preHabitacion", length=60, nullable=false)
	private double preHabitacion;
	
	@Column(name = "rangoPrecio")
	private String rangoPrecio;
	
	@Column(name = "fechaPublicacion", nullable=false)
	private Date fechaPublicacion;
	
	@ManyToOne
	@JoinColumn(name = "idHabitacion")
	private Room idHabitacion;
	
	public Aviso() {
		super();
	}

	

	public Aviso(int idAviso, double preHabitacion, String rangoPrecio, Date fechaPublicacion, Room idHabitacion) {
		super();
		this.idAviso = idAviso;
		this.preHabitacion = preHabitacion;
		this.rangoPrecio = rangoPrecio;
		this.fechaPublicacion = fechaPublicacion;
		this.idHabitacion = idHabitacion;
	}



	public int getIdAviso() {
		return idAviso;
	}

	public void setIdAviso(int idAviso) {
		this.idAviso = idAviso;
	}

	public double getPreHabitacion() {
		return preHabitacion;
	}

	public void setPreHabitacion(double preHabitacion) {
		this.preHabitacion = preHabitacion;
	}

	public String getRangoPrecio() {
		return rangoPrecio;
	}

	public void setRangoPrecio(String rangoPrecio) {
		this.rangoPrecio = rangoPrecio;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Room getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(Room idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idAviso, idHabitacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aviso other = (Aviso) obj;
		return idAviso == other.idAviso && Objects.equals(idHabitacion, other.idHabitacion);
	}

	
}
