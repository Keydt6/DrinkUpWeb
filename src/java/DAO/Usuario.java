package DTO;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

    /**
	 * atributo generado para identificar la clase al momento
	 * que es serializado para ser enviado o recivido.
	 */
	private static final long serialVersionUID = 7183520378910836691L;
	
	//----------atributos----------

	@Id
    @Column(name = "id_u")
    private String id_u;

    @Column(name = "password")
    private String password;

    @Column(name = "tipo")
    private Integer tipo;

    @Column(name = "fecha_ultimo")
    private LocalDate fecha_ultimo; //fecha ultimo login deberia ser date

    @Column(name = "fecha_registro")
    private LocalDate fecha_registro; //deberia ser date

    @Column(name = "estatus")
    private Boolean estatus;
    
  //----------construntores y toString--------

    public Usuario() {
    }

    public Usuario(String id_u, String password, Integer tipo, LocalDate fecha_ultimo, LocalDate fecha_registro, Boolean estatus) {
        this.id_u = id_u;
        this.password = password;
        this.tipo = tipo;
        this.fecha_ultimo = fecha_ultimo;
        this.fecha_registro = fecha_registro;
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_u=" + id_u + ", password=" + password + ", tipo=" + tipo + ", fecha_ultimo=" + fecha_ultimo + ", fecha_registro=" + fecha_registro + '}';
    }

  //-----------setter y getter-----------
    
    public LocalDate getFecha_ultimo() {
        return fecha_ultimo;
    }

    public void setFecha_ultimo(LocalDate fecha_ultimo) {
        this.fecha_ultimo = fecha_ultimo;
    }

    public LocalDate getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getId_u() {
        return id_u;
    }

    public void setId_u(String id) {
        this.id_u = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

}
