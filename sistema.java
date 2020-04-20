/*
ESTA CLASE FUE CREADA PARA MOSTRAR LOS MENSAJES PRINCIPALES DE SISTEMAS Y ASÍ EVITAR ABRUMACIÓN DE TEXTO EN LA CLASE MAIN
 */
package cajero;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author crisn
 */
public class sistema {
    
            Date fecha = new Date();
            private int respuesta=0;
            
         //medo para mostrar el mensaje
    private int respuestarespuesta;
            
            
            /*ocupamos valores:
            @param int
            @param void
            
            */
            
            public void mensaje_de_bienvenida(){
                JOptionPane.showMessageDialog(null,"Hola\n Bienvenido a  \n BANCO QUECHO-PRESTA \n Gracias por utilizar nuestros servicios ");
    
            }
            
         
            //metodo para procesar la respuesta 
            //ocupando modiificadores de acceso
            
            
       //menu de empleado
        public int mostrar_menu_empleado(){
          
                 this.respuesta= respuesta=Integer.parseInt(JOptionPane.showInputDialog("\n                    "+fecha.toString()+"\nElige una opcion del menu  \n1.-Consultar perfil \n 2.-Despositar\n 3.-Retirar\n 4.-salir"));    
            
                 return respuesta;
        }

        public int mostrar_menu_empresario(){
                this.respuesta= respuesta=Integer.parseInt(JOptionPane.showInputDialog("\n                     Fecha de inicio:"+fecha.toString()+"\n\nElige una opcion del menu  \n1.-Consultar perfil \n 2.-Despositar\n 3.-Retirar\n 4.Donar \n5-salir"));    
            
        return this.respuesta;
        }
        
        
        //----------------------------------------------------------------GET Y SETTERS
           public int getRespuesta() {
          return respuesta;
            }

       
           

    
        
        
    
}
