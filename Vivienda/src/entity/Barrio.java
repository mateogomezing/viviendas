package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Barrio
 *
 */
@Entity

public class Barrio implements Serializable {

	   
	@Id
	private Integer Id;
	private String Nombre;
	private Integer Municipio;
	private static final long serialVersionUID = 1L;

	public Barrio() {
		super();
	}   
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public Integer getMunicipio() {
		return this.Municipio;
	}

	public void setMunicipio(Integer Municipio) {
		this.Municipio = Municipio;
	}
   
}
