package DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categoria")
public class Categoria implements Serializable {

    /**
	 * atributo generado para identificar la clase al momento
	 * que es serializado para ser enviado o recivido.
	 */
	private static final long serialVersionUID = 4320346416516332875L;
	
	//----------atributos----------

	@Id
    @Column(name = "id_cat")
    private Integer id_cat;

    @Column(name = "tipo_cat")
    private Integer tipo_cat;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descrip")
    private String descrip;

    @Column(name = "estatus")
    private boolean estatus;
    
  //----------construntores y toString--------

    public Categoria() {
    }

    public Categoria(Integer id_cat, Integer tipo_cat, String nombre, String descrip, boolean estatus) {
        this.id_cat = id_cat;
        this.tipo_cat = tipo_cat;
        this.nombre = nombre;
        this.descrip = descrip;
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id_cat=" + id_cat + ", tipo_cat=" + tipo_cat + ", nombre=" + nombre + ", descrip=" + descrip + '}';
    }

  //-----------setter y getter-----------
    
    public Integer getId_cat() {
        return id_cat;
    }

    public void setId_cat(Integer id_cat) {
        this.id_cat = id_cat;
    }

    public Integer getTipo_cat() {
        return tipo_cat;
    }

    public void setTipo_cat(Integer tipo_cat) {
        this.tipo_cat = tipo_cat;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

}
