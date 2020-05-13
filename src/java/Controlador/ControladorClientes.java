
package Controlador;

import DrinkUpControler.ClientesJpaController;
import Modelo.Clientes;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Textbox;

public class ControladorClientes extends SelectorComposer
{
  @Wire  
  private Textbox cedula;
  
  @Wire
  private Textbox nombre;
  
  @Wire
  private Textbox apellido;            
  
  @Wire
  private Textbox direccion;
  
  @Wire
  private Textbox telefono;
  
  @Wire
  private Datebox fechanac;    
  
@Listen("onClick = #BtnGrabar")
 public void doGrabar() throws Exception 
 {  
    if (cedula.getText().trim().length()==0) 
      throw new WrongValueException(cedula, "Cedula de Cliente Vacia");  
    
   if (nombre.getText().trim().length()==0) 
      throw new WrongValueException(nombre, "Nombre de Cliente Vacio");  
 
  if (apellido.getText().trim().length()==0) 
      throw new WrongValueException(apellido, "Apellido de Cliente Vacia");   
  
  
  //Stear el modelo
  Clientes cliente;
  Clientes clienteBus;
  
  
  cliente=new Clientes(cedula.getText(),
                       nombre.getText(),
                       apellido.getText(),
                       direccion.getText(),
                       telefono.getText(),
                       fechanac.getValue(),
                       true);
  
  //Grabar
  ClientesJpaController clientesJpaController;
  EntityManagerFactory emf =Persistence.createEntityManagerFactory("ZKDrinkUpPU");
  clientesJpaController=new ClientesJpaController(emf);
  
  
  clienteBus=clientesJpaController.findClientes(cedula.getText());
  if (clienteBus!=null)
    throw new WrongValueException(cedula, "Cliente ya incluido");   
  
  clientesJpaController.create(cliente);
  
  //Limpiar
    cedula.setText("");
    nombre.setText(""); 
    apellido.setText(""); 
    direccion.setText(""); 
    telefono.setText(""); 
    fechanac.setValue(null);

    throw new WrongValueException(cedula, "Grabacion Realizada");   
  
 }
 
}
