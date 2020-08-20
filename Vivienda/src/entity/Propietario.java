package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Propietario
 *
 */
@Entity

public class Propietario implements Serializable {

	   
	@Id
	private Integer Id;
	private Integer DNI;
	private String Nombrecompleto;
	private String Telefono;
	private String Correo;
	private static final long serialVersionUID = 1L;

	public Propietario() {
		super();
	}   
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}   
	public Integer getDNI() {
		return this.DNI;
	}

	public void setDNI(Integer DNI) {
		this.DNI = DNI;
	}   
	public String getNombrecompleto() {
		return this.Nombrecompleto;
	}

	public void setNombrecompleto(String Nombrecompleto) {
		this.Nombrecompleto = Nombrecompleto;
	}   
	public String getTelefono() {
		return this.Telefono;
	}

	public void setTelefono(String Telefono) {
		this.Telefono = Telefono;
	}   
	public String getCorreo() {
		return this.Correo;
	}

	public void setCorreo(String Correo) {
		this.Correo = Correo;
	}
   
}
