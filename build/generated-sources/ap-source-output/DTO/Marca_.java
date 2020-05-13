package DTO;

import DTO.Articulo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-04-26T21:29:23")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile SingularAttribute<Marca, String> id_mar;
    public static volatile SingularAttribute<Marca, String> descrip;
    public static volatile SingularAttribute<Marca, Boolean> estatus;
    public static volatile SetAttribute<Marca, Articulo> articulos;
    public static volatile SingularAttribute<Marca, String> nombre;

}