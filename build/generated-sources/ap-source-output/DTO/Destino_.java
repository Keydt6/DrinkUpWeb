package DTO;

import DTO.Parroquia;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-04-26T21:29:24")
@StaticMetamodel(Destino.class)
public class Destino_ { 

    public static volatile SingularAttribute<Destino, String> id_des;
    public static volatile SingularAttribute<Destino, Boolean> estatus;
    public static volatile SingularAttribute<Destino, Parroquia> parr;
    public static volatile SingularAttribute<Destino, String> referencia1;
    public static volatile SingularAttribute<Destino, String> direccion;
    public static volatile SingularAttribute<Destino, String> referencia2;

}