package DTO;

import DTO.Cliente;
import DTO.Destino;
import DTO.DetFact;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2018-04-26T21:29:23")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Cliente> cli;
    public static volatile SetAttribute<Factura, DetFact> det;
    public static volatile SingularAttribute<Factura, LocalDate> fecha_entrega;
    public static volatile SingularAttribute<Factura, Boolean> estatus;
    public static volatile SingularAttribute<Factura, LocalTime> hora_entrega;
    public static volatile SingularAttribute<Factura, Double> subMonto;
    public static volatile SingularAttribute<Factura, Destino> dest;
    public static volatile SingularAttribute<Factura, String> id_fact;

}