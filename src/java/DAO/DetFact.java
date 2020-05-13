package DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@IdClass(DetFactPK.class)
@Table(name = "DetFact")
public class DetFact implements Serializable, Cloneable {

    /**
	 * atributo generado para identificar la clase al momento
	 * que es serializado para ser enviado o recivido.
	 */
	private static final long serialVersionUID = 2076154466106193635L;
	
	//----------atributos----------

	@Id
    @Column(name = "id_fact")
    private String id_fact;

    @Id
    @Column(name = "id_art")
    private String id_art;

    @Column(name = "cantidad")
    private Integer cantidad;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "id_fact", referencedColumnName = "id_fact")
    private Factura factura;

    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn(name = "id_art", referencedColumnName = "id_art")
    private Articulo articulo;
    
  //----------construntores y toString--------

    public DetFact() {
    }

    public DetFact(String id_fact, String id_art, Integer cantidad) {
        this.id_fact = id_fact;
        this.id_art = id_art;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetFact{" + "id_fact=" + id_fact + ", id_art=" + id_art + ", cantidad=" + cantidad + '}';
    }
    
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

}
