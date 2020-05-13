package DTO;

import DTO.Categoria;
import DTO.Marca;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-04-26T21:29:23")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, Marca> marca;
    public static volatile SingularAttribute<Articulo, Double> precio;
    public static volatile SingularAttribute<Articulo, String> descrip;
    public static volatile SingularAttribute<Articulo, Boolean> estatus;
    public static volatile SingularAttribute<Articulo, String> id_art;
    public static volatile SingularAttribute<Articulo, Categoria> categoria;
    public static volatile SingularAttribute<Articulo, Integer> tamanno;
    public static volatile SingularAttribute<Articulo, Integer> stock;
    public static volatile SingularAttribute<Articulo, String> nombre;

}