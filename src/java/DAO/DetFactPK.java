package DTO;

import java.io.Serializable;

public class DetFactPK implements Serializable{

	/**
	 * atributo generado para identificar la clase al momento
	 * que es serializado para ser enviado o recivido.
	 */
	private static final long serialVersionUID = -1664153206284090484L;
	
	//----------atributos----------
	
	private String id_fact;
	
	private String id_art;
	
	//-----------setter y getter-----------

	public String getId_fact() {
		return id_fact;
	}

	public void setId_fact(String id_fact) {
		this.id_fact = id_fact;
	}

	public String getId_art() {
		return id_art;
	}

	public void setId_art(String id_art) {
		this.id_art = id_art;
	}

}
