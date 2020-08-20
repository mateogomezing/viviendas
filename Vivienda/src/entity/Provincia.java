package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Provincia
 *
 */
@Entity

public class Provincia implements Serializable {

	   
	@Id
	private Integer Id;
	private String Nombre;
	private static final long serialVersionUID = 1L;

	public Provincia() {
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
   
}
