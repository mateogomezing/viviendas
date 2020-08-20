package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vivienda
 *
 */
@Entity

public class Vivienda implements Serializable {

	@Id
	private Integer Id;

	private Integer Numerocatastral;
	private String Direccion;
	private Integer Metroscuadrados;
	private Integer DNI;
	private static final long serialVersionUID = 1L;

	public Vivienda() {
		super();
	}

	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}

	public Integer getNumerocatastral() {
		return this.Numerocatastral;
	}

	public void setNumerocatastral(Integer Numerocatastral) {
		this.Numerocatastral = Numerocatastral;
	}

	public String getDireccion() {
		return this.Direccion;
	}

	public void setDireccion(String Direccion) {
		this.Direccion = Direccion;
	}

	public Integer getMetroscuadrados() {
		return this.Metroscuadrados;
	}

	public void setMetroscuadrados(Integer Metroscuadrados) {
		this.Metroscuadrados = Metroscuadrados;
	}

	public Integer getDNI() {
		return this.DNI;
	}

	public void setDNI(Integer DNI) {
		this.DNI = DNI;
	}

}
