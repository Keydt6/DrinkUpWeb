package DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Parroquia")
public class Parroquia implements Serializable {

    /**
	 * atributo generado para identificar la clase al momento
	 * que es serializado para ser enviado o recivido.
	 */
	private static final long serialVersionUID = 845898571239780493L;
	
	//----------atributos----------

	@Id
    @Column(name = "id_parr")
    private String id_parr;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estatus")
    private boolean estatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ciudad")
    private Ciudad ciudad;
    

  //----------construntores y toString--------

    public Parroquia() {
    }

    public Parroquia(String id_p, String nombre, boolean estatus, Ciudad ciudad) {
        this.id_parr = id_p;
        this.nombre = nombre;
        this.estatus = estatus;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Parroquia{" + "id_p=" + id_parr + ", nombre=" + nombre + ", ciudad=" + ciudad + '}';
    }
    
  //-----------setter y getter-----------

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public String getId_p() {
        return id_parr;
    }

    public void setId_p(String id) {
        this.id_parr = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

}
