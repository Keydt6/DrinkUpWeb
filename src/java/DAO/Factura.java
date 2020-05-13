package DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Factura")
public class Factura implements Serializable {

	/**
	 * atributo generado para identificar la clase al momento
	 * que es serializado para ser enviado o recivido.
	 */
	private static final long serialVersionUID = 7890868526818018489L;
	
	//----------atributos----------

	@Id
    @Column(name = "id_fact")
    private String id_fact;

    @Column(name = "subMonto")
    private Double subMonto;
    
    @OneToOne(cascade={javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_des")
    private Destino dest;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "cedula")
    private Cliente cli;
    
    @OneToMany(fetch=FetchType.LAZY, cascade={javax.persistence.CascadeType.ALL})
	private Set<DetFact> det = new HashSet<DetFact>();

    @Column(name = "fecha_entrega")
    @Temporal(javax.persistence.TemporalType.DATE)
    private LocalDate fecha_entrega;

    @Column(name = "hora_entrega")
    private LocalTime hora_entrega;   

    @Column(name = "estatus")
    private boolean estatus;
    
  //----------construntores y toString--------

    public Factura() {
    }

    public Factura(String id_fact, Double monto, boolean estatus) {
        this.id_fact = id_fact;
        this.subMonto = monto;
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Factura{" + "id_fact=" + id_fact + ", monto=" + subMonto + '}';
    }
    
  //-----------setter y getter-----------

    public String getId_fact() {
        return id_fact;
    }

    public void setId_fact(String id_fact) {
        this.id_fact = id_fact;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public Double getSubMonto() {
        return subMonto;
    }

    public void setSubMonto(Double monto) {
        this.subMonto = monto;
    }

	public Destino getDest() {
		return dest;
	}

	public void setDest(Destino dest) {
		this.dest = dest;
	}

	public Cliente getCli() {
		return cli;
	}

	public void setCli(Cliente cli) {
		this.cli = cli;
	}

	public Set<DetFact> getDet() {
		return det;
	}

	public void setDet(Set<DetFact> det) {
		this.det = det;
	}

	public LocalDate getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(LocalDate fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public LocalTime getHora_entrega() {
		return hora_entrega;
	}

	public void setHora_entrega(LocalTime hora_entrega) {
		this.hora_entrega = hora_entrega;
	}

}
