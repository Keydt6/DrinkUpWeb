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
@Table(name = "Articulo")
public class Articulo implements Serializable {

	/**
	 * atributo generado para identificar la clase al momento
	 * que es serializado para ser enviado o recivido.
	 */
	private static final long serialVersionUID = -5078713997184521314L;
	
	//----------atributos----------

	@Id
    @Column(name = "id_art")
    private String id_art;

    @Column(name = "descrip")
    private String descrip;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio", length = 10, precision = 3)
    private Double precio;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "estatus")
    private Boolean estatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cat")
    private Categoria categoria;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_mar")
	private Marca marca;

    @Column(name = "tamanno")
    private Integer tamanno;
    
    //----------construntores y toString--------

    public Articulo() {
    }

    public Articulo(String id_art, String descrip, String nombre, Double precio, Integer stock, Boolean estatus,
			Categoria categoria, Marca marca, Integer tamanno) {
		super();
		this.id_art = id_art;
		this.descrip = descrip;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.estatus = estatus;
		this.categoria = categoria;
		this.marca = marca;
		this.tamanno = tamanno;
	}


	@Override
	public String toString() {
		return "Articulo [id_art=" + id_art + ", descrip=" + descrip + ", nombre=" + nombre + ", precio=" + precio
				+ ", stock=" + stock + ", estatus=" + estatus + ", categoria=" + categoria + ", marca=" + marca
				+ ", tamanno=" + tamanno + "]";
	}
    
    //-----------setter y getter-----------   
 
	public String getId_art() {
        return id_art;
    }

	public void setId_art(String id) {
        this.id_art = id;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public void setTamanno(Integer tamanno) {
        this.tamanno = tamanno;
    }
    
	public Integer getTamanno() {
		return tamanno;
	}

    void setPrecio(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
