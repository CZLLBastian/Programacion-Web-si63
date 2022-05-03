package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Universidad")
public class Universidad {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUniversidad;

	@Column(name = "fullNameUniversidad", nullable = false, length = 47)
	private String fullNameUniversidad;

	public Universidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Universidad(int idUniversidad, String fullNameUniversidad) {
		super();
		this.idUniversidad = idUniversidad;
		this.fullNameUniversidad = fullNameUniversidad;

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

	@Override
	public int hashCode() {
		return Objects.hash(idUniversidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Universidad other = (Universidad) obj;
		return idUniversidad == other.idUniversidad;
	}

	
}
