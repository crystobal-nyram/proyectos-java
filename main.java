/*

--------------------------------IMPORTANTE ANTES DE EJECUTAR--------------------------------------------!
!                                                                                                       !
!  hola profesor fernando buenas tardes,dias,noches.
!  de ante mano gracias por ser un buen porfesor,por inspirar más allá de lo qu esta en nuestras manos
!
!
!
!  Espero este miniProyecto cumpla las expextativas del trabajo
! tambien puede consultar aquí,lo he subido a GitHub.
!   
!cuidese muchos, ;) nos vemos pronto profe
!
!
!
!MADE IN : DvTecam
---------------------------------------------------------------------------------------------------------
*/


//TRAEMOS LAS librerias necesarias
package cajero;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author cristobal
 */
public class main {

   
    public static void main(String[] args) throws NumberFormatException, IllegalArgumentException , RuntimeException{
            //cosas curiosas de java
            /*funcion para poner la hora y la fecha*/ 
            /*primero invacmos la funcion date*/
           /* Date fech = new Date();
                String fecha=String.format("%1$s %2$tB %2$td, %2$tY", fech);
         String fechaActulizada=(""+fecha);   
            */
           
           
            /* %-->significa un indice y debe terminar en $
            
            String.format -->Convierte el valor de los objetos en 
                            cadenas en función de los formatos especificados 
                            y los inserta en otra cadena.
            
            fuente de consulta para está funcion: https://www.tutorialspoint.com/java/java_date_time.html
            */
            
            Date fecha = new Date();

      // display time and date using toString()

            
      
        
        
        
       //variables globales----------------------------------------------------------------------------------------------------------------------
        
        String usuario;
        String contraseña;
        
        //variables para mandar mensajes//
        String alerta="no";
        
        
         String mensaje_no_encontrado="intentalo más tarde ";
        String mensaje_despedida="Gracias por usar nuestro servicios \n  "+fecha.toString();
        String proceso_exi_usuario="\nencotramos tu usuario";
        String proceso_exi_password="\nencotramos tu contraseña";
        String mensaje_de_eleccion="Porfavor digita una opcion que este disponible en el menu";
         String mensajeEspera="♥Estamos procesando su información sea paciente\nGRACIAS!";
        
         
         
         
         
         
         
         
         
         
         
         
         
    
        //mensaje de bienvenida------------------------------------------------------
        sistema mensaje = new sistema();
        mensaje.mensaje_de_bienvenida();
        
   
   //peticion de datos------------------------------------------------------------------
     
     
     
     
  //------------------------------------------------------------------------------------
  
        do {
            
            do {                
                
            
            //datos que se mostran en la ventana
            do {                
                String mensaje_a_usuario_de_peticion_de_id = "Ingrese su nombre de usuario";
            String titulo_de_la_ventana = "Inicio de sesion";
            usuario = showInputDialog ( null, mensaje_a_usuario_de_peticion_de_id, titulo_de_la_ventana, INFORMATION_MESSAGE );
            
            
             if ("".equals(usuario)) {
                JOptionPane.showMessageDialog(null,"ingrese nombre de usuario por favor");
            }
            } while ("".equals(usuario));
                
            
            //lanzamos el mensaje de que el usuario no ha mandado nada
           
            
            
            
            
            //contraseña
            do {                
                String mensaje_a_usuario_de_peticion_de_contraseña = "Ingrese su contraseña";
            String titulo_de_la_ventana_2 = "Inicio de session";
            contraseña = showInputDialog ( null, mensaje_a_usuario_de_peticion_de_contraseña, titulo_de_la_ventana_2, INFORMATION_MESSAGE );
            
            
            //lanzamos el mensaje de que el usuario no ha mandado nada
            if ("".equals(contraseña)) {
                JOptionPane.showMessageDialog(null,"ingrese contraseña por favor");
            }
            } while ("".equals(contraseña));
            
            
            
            
           
        } while ("".equals(usuario) && "".equals(contraseña));
        //advertencia en el envio de datos
              String prompt = "¿Esta seguro que esta enviando los datos correctos?\n                     si o  no\n\n ---te recomendamos que lo escribas en minusculas--";    
              String title = "Alerta";   
               alerta = showInputDialog( null, prompt, title, WARNING_MESSAGE ); 
        
        } while (!"si".equals(alerta));//le preguntamos al usuario si esta seguro
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //PROCESAMIENTO DEL CAJERO----------------------------------------------------------------------------------------------------
       
       JOptionPane.showMessageDialog(null,mensajeEspera);
       
       
       /*aqui ubicamos las contraseñas y cuentas ficticiaas*/
      String usuariof1="emp1";
      String contraseñaf1="1";
      
      String usuariof2="em1";
      String contraseñaf2="1";
      
       if ((usuario.equals(usuariof1)) ||(usuario.equals(usuariof2)) ) {//evaluamos el usuario
           
            JOptionPane.showConfirmDialog(null, mensajeEspera +" "+proceso_exi_usuario);
            
            
            
            if ((contraseña.equals(contraseñaf1))||(contraseña.equals(contraseñaf2))) {
               JOptionPane.showConfirmDialog(null, mensajeEspera +" "+proceso_exi_password);
                 int respuesta = 0;
                //eaquí ya esta adrentro del sistema------------------------------------------------------------------------------
                  
                
                
                
                sistema mostrar_m =new sistema();//creamos el metodo para mandar la respuesta//
                  
                switch(usuario){
                    
                    case "emp1"://menu para el empresario-----------------
                     empresario Empresario =new empresario(usuario, contraseña);
                           do {  
                   
  /*inicio de */
                  try {//este try catch nos servira para volver a try="tratar" de componer el error de ingreso de datos  
                          mostrar_m.mostrar_menu_empresario();

             
          
                                    switch(mostrar_m.getRespuesta()){
                   
                    case 1:  
                        Empresario.mostrar_pefil();
                           break;
                        
                        
                    case 2: 
                          int deposito_a_mi=0;
                        deposito_a_mi=Integer.parseInt(showInputDialog(null,"¿Cuanto desea depositar a su cuenta?","depositar",INFORMATION_MESSAGE));
                         Empresario.depositar_a_mi_cuenta(deposito_a_mi);
                        break;
                        
                    case 3: 
                        int dinero_retirar=0;
                        dinero_retirar=Integer.parseInt(showInputDialog(null,"¿Cuanto desea retirar?","RETIRO",INFORMATION_MESSAGE));
                         Empresario.retirar(dinero_retirar);
                        break;
                        
                    case 4: 
                        int dinero_de_donacion=0;
                               dinero_de_donacion=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuanto desea donar?","Donar a fundación becalos",INFORMATION_MESSAGE));
                        Empresario.donar(dinero_de_donacion);//por esta razón es la diferencias de clientes
                     
                        break;
                    
                   case 5: 
                       showMessageDialog(null,mensaje_despedida+" \n Banco QUECHO-PRESTA","Fin del programa",INFORMATION_MESSAGE);
                       break;
                   
                        
                
                }
  /*fin de try*/                             } catch (NumberFormatException exepcion_de_empresario) {
                                   showMessageDialog(null, "hemos tenido un error con la entrada de tus datos");
                               }
               
                    
                } while (mostrar_m.getRespuesta()!=5);

                          
                          
                        
                        
                        
                        
                        break;
                        
                        
                        
                        
                        
                        
                    case "em1"://menu para un empleado-------------------------
         
                               mostrar_m.mostrar_menu_empleado();
           try {
                            
                       
                 
                    empleado empleado1 =new empleado(usuario, contraseña);      
                do {  
                   
                    
                     mostrar_m.mostrar_menu_empleado();
                    
                switch(mostrar_m.getRespuesta()){
                   
                     case 1:  
                       empleado1.mostrar_pefil();
                         break;
                        
                        
                    case 2: 
                         int dinero_deposito_a_mi_=0;
                               dinero_deposito_a_mi_=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuanto desea depositar a su cuenta?","depositarme",INFORMATION_MESSAGE));
                        empleado1.depositar_a_mi_cuenta(dinero_deposito_a_mi_);//por esta razón es la diferencias de clientes
                         
                        break;
                        
                    case 3: 
                         int dinero_retiro=0;
                               dinero_retiro=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuanto desea retirar?","repitar",INFORMATION_MESSAGE));
                        empleado1.retirar(dinero_retiro);//por esta razón es la diferencias de clientes
                        break;
                    
                   case 4: 
                       showMessageDialog(null,"Fin del programa",mensaje_despedida+" \n Banco QUECHO-PRESTA",INFORMATION_MESSAGE);
                       break;
                   default:
                       showMessageDialog(null, "ingrese una opcion del menu");
                       break;
               
                
                }
                
                    
                } while (mostrar_m.getRespuesta()!=4);
                 } catch (NumberFormatException exepcion_en_empleado) {
                                   showMessageDialog(null, "hemos tenido un error con la entrada de tus datos");
                               }
               

                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        break;
                        
                    default:
                        showMessageDialog(null,"Tuvimos un inconveniente en el sistema");
                        break;
                
                
                
                
                
                }
                
                
                
                
                
                
                
                
                
                
                
                               
                
                
                
                
                

            }
            
                 else {
             showMessageDialog(null,"tuvimos un error para concidir la contraseña: "+contraseña,"No condide", WARNING_MESSAGE );
              showMessageDialog(null, mensaje_no_encontrado,"fin de programa",INFORMATION_MESSAGE);
           }
            
     //-------los else son en caso de no encontrar el usuario y la contraseña---
            
         
            
        }
       else{
    showMessageDialog(null,"tuvimos un error para encontrar el usario: "+usuario,"No encontrado", WARNING_MESSAGE );
           showMessageDialog(null, mensaje_despedida,"fin de programa",INFORMATION_MESSAGE);
       }
                 

}
}