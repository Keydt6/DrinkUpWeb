package DTO;

import DTO.Factura;
import DTO.Usuario;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-04-26T21:29:24")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, LocalDate> fecha_n;
    public static volatile SingularAttribute<Cliente, Boolean> estatus;
    public static volatile SingularAttribute<Cliente, String> cedula;
    public static volatile SingularAttribute<Cliente, Usuario> usu;
    public static volatile SetAttribute<Cliente, Factura> facturas;
    public static volatile SingularAttribute<Cliente, String> apellido;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> nombre;

}