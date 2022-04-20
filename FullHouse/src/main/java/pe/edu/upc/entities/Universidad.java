package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="universidad")
public class Universidad {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUniversidad;
	
	@Column(name ="nomUniversidad", nullable= false,length=47)
	private String fullNameUniversidad;
	
	@Column(name = "adressUniversidad", nullable =false , length = 40)
	private String adressUniversidad;
	
	public Universidad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Universidad(int idUniversidad, String fullNameUniversidad, String adressUniversidad) {
		super();
		this.idUniversidad = idUniversidad;
		this.fullNameUniversidad = fullNameUniversidad;
		this.adressUniversidad = adressUniversidad;
	}
	public int getIdUniversidad() {
		return idUniversidad;
	}
	public void setIdUniversidad(int idUniversidad) {
		this.idUniversidad = idUniversidad;
	}
	public String getFullNameUniversidad() {
		return fullNameUniversidad;
	}
	public void setFullNameUniversidad(String fullNameUniversidad) {
		this.fullNameUniversidad = fullNameUniversidad;
	}
	public String getAdressUniversidad() {
		return adressUniversidad;
	}
	public void setAdressUniversidad(String adressUniversidad) {
		this.adressUniversidad = adressUniversidad;
	}
	
	
	
}
