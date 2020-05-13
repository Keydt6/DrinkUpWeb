package DTO;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-04-26T21:29:23")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> id_u;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, Integer> tipo;
    public static volatile SingularAttribute<Usuario, Boolean> estatus;
    public static volatile SingularAttribute<Usuario, LocalDate> fecha_registro;
    public static volatile SingularAttribute<Usuario, LocalDate> fecha_ultimo;

}