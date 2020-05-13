package DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

    /**
	 * atributo generado para identificar la clase al momento
	 * que es serializado para ser enviado o recivido.
	 */
	private static final long serialVersionUID = 5871016983296759070L;
	
	//----------atributos----------

	@Id
    @Column(name = "cedula")
    private String cedula;
	
	@OneToOne(cascade={javax.persistence.CascadeType.ALL}, fetch = FetchType.LAZY)
	@JoinColumn(name="id_u")
	private Usuario usu;
	
	@OneToMany(fetch=FetchType.LAZY, cascade={javax.persistence.CascadeType.ALL})
	private Set<Factura> facturas = new HashSet<Factura>();

	@Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fecha_n")
    @Temporal(javax.persistence.TemporalType.DATE)
    private LocalDate fecha_n;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "estatus")
    private Boolean estatus;
    
  //----------construntores y toString--------

    public Cliente() {
    }

    public Cliente(Usuario usu, String cedula, String nombre, String apellido, LocalDate fecha_n, String direccion, String telefono, Boolean estatus) {
        this.usu = usu;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_n = fecha_n;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Usuario=" + usu + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_n=" + fecha_n + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

  //-----------setter y getter-----------

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }
    
    public Set<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}

    public LocalDate getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(LocalDate fecha_n) {
        this.fecha_n = fecha_n;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean Estatus) {
        this.estatus = Estatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
