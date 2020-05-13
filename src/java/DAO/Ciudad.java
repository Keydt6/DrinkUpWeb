package DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Ciudad")
public class Ciudad implements Serializable {

    /**
	 *  atributo generado para identificar la clase al momento
	 * que es serializado para ser enviado o recivido.
	 */
	private static final long serialVersionUID = -4102290773362706029L;
	
	//----------atributos----------

	@Id
    @Column(name = "id_c")
    private String id_c;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estatus")
    private boolean estatus;
    
  //----------construntores y toString--------

    public Ciudad() {
    }

    public Ciudad(String id_c, String nombre, boolean estatus) {
        this.id_c = id_c;
        this.nombre = nombre;
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id_c=" + id_c + ", nombre=" + nombre + '}';
    }
    
  //-----------setter y getter-----------

    public String getId_c() {
        return id_c;
    }

    public void setId_c(String id_c) {
        this.id_c = id_c;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
