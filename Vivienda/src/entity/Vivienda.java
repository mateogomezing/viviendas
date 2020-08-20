package entity;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vivienda
 *
 */
@Entity

public class Vivienda implements Serializable {

	   
	@Id
	private Integer id;
	private static final long serialVersionUID = 1L;

	public Vivienda() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
   
}
