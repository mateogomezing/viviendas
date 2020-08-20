package entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Municipio
 *
 */
@Entity

public class Municipio implements Serializable {

	   
	@Id
	private Integer Id;
	private Integer Codigoregional;
	private String Nombre;
	private Integer Area;
	private Integer Perimetro;
	private Integer Provincia;
	private static final long serialVersionUID = 1L;

	public Municipio() {
		super();
	}   
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}   
	public Integer getCodigoregional() {
		return this.Codigoregional;
	}

	public void setCodigoregional(Integer Codigoregional) {
		this.Codigoregional = Codigoregional;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public Integer getArea() {
		return this.Area;
	}

	public void setArea(Integer Area) {
		this.Area = Area;
	}   
	public Integer getPerimetro() {
		return this.Perimetro;
	}

	public void setPerimetro(Integer Perimetro) {
		this.Perimetro = Perimetro;
	}   
	public Integer getProvincia() {
		return this.Provincia;
	}

	public void setProvincia(Integer Provincia) {
		this.Provincia = Provincia;
	}
   
}
