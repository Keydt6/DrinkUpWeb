/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn; 
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Destino")
public class Destino implements Serializable {

    /**
	 * atributo generado para identificar la clase al momento
	 *que es serializado para ser enviado o recivido.
	 */
	private static final long serialVersionUID = 8774918770736373449L;
	
	//----------atributos----------

	@Id
    @Column(name = "id_des")
    private String id_des;

    @OneToOne(cascade={javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name="id_parr")
    private Parroquia parr;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "referencia1")
    private String referencia1;

    @Column(name = "referencia2")
    private String referencia2;

    @Column(name = "estatus")
    private boolean estatus;

  //----------construntores y toString--------

    public Destino() {
    }

    public Destino(String id_des, Parroquia parr, String direccion, String referencia1, String referencia2, boolean estatus) {
        this.id_des = id_des;
        this.parr = parr;
        this.direccion = direccion;
        this.referencia1 = referencia1;
        this.referencia2 = referencia2;
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Destino{" + "id_des=" + id_des + ", Parroquia=" + parr + ", direccion=" + direccion + ", referencia1=" + referencia1 + ", referencia2=" + referencia2 + '}';
    }

  //-----------setter y getter-----------
    
    public String getId_des() {
        return id_des;
    }

    public void setId_des(String id_des) {
        this.id_des = id_des;
    }

    public Parroquia getParr() {
        return parr;
    }

    public void setParr(Parroquia parr) {
        this.parr = parr;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferencia1() {
        return referencia1;
    }

    public void setReferencia1(String referencia1) {
        this.referencia1 = referencia1;
    }

    public String getReferencia2() {
        return referencia2;
    }

    public void setReferencia2(String referencia2) {
        this.referencia2 = referencia2;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

}
