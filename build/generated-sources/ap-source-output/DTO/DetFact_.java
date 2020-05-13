package DTO;

import DTO.Articulo;
import DTO.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-04-26T21:29:23")
@StaticMetamodel(DetFact.class)
public class DetFact_ { 

    public static volatile SingularAttribute<DetFact, Factura> factura;
    public static volatile SingularAttribute<DetFact, String> id_art;
    public static volatile SingularAttribute<DetFact, Integer> cantidad;
    public static volatile SingularAttribute<DetFact, Articulo> articulo;
    public static volatile SingularAttribute<DetFact, String> id_fact;

}