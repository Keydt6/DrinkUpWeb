/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "MArca")
public class Marca implements Serializable {

    /**
	 * atributo generado para identificar la clase al momento
	 * que es serializado para ser enviado o recivido.
	 */
	private static final long serialVersionUID = 9051001888482941234L;
	
	//----------atributos----------

	@Id
    @Column(name = "id_mar")
    private String id_mar;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descrip")
    private String descrip;
    
	@ManyToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY)
	@JoinTable(name="articulo-marca", joinColumns={@JoinColumn(name="marca", referencedColumnName="id_mar")}, inverseJoinColumns={@JoinColumn(name="articulo", referencedColumnName="id_art")})
	private Set<Articulo> articulos = new HashSet<Articulo>();

    @Column(name = "estatus")
    private boolean estatus;
    
  //----------construntores y toString--------

    
    
    public Marca() {
    }

    public Marca(String id_mar, String nombre, String descrip, Set<Articulo> articulos, boolean estatus) {
	super();
	this.id_mar = id_mar;
	this.nombre = nombre;
	this.descrip = descrip;
	this.articulos = articulos;
	this.estatus = estatus;
}

	@Override
    public String toString() {
        return "Marca{" + "id_mar=" + id_mar + ", nombre=" + nombre + ", descrip=" + descrip + '}';
    }

  //-----------setter y getter-----------
    
    public String getId_mar() {
        return id_mar;
    }

    public void setId_mar(String id_mar) {
        this.id_mar = id_mar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

	public void setArticulos(Set<Articulo> art) {
		this.articulos = art;
	}
    
    public Set<Articulo> getArticulos() {
		return articulos;
	}

	public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

}
