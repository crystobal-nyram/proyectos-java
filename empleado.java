/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author crisn
 */
public class empleado extends cliente{
      
       private int estado_de_cuenta=100;
       private String tipo_de_usuario="Medium";
 //metodos que tiene mi empleado son las mismas que tiene un empresario y al viseversa*/
 //metodos retirar efectivo,consultar perfil,donar,depositar

    public empleado(String id, String password) {
        super(id, password);
    }

   
     //estado de cuenta------------------------------------------------------------------------------------------------------------
      @Override
       public int depositar_a_mi_cuenta(int deposito){
           if ((deposito>=5)) {

             int cuenta_depositando=0;
             cuenta_depositando=deposito;
        estado_de_cuenta=estado_de_cuenta+cuenta_depositando;
    
      
        
            JOptionPane.showMessageDialog(null,"Su estado de actual es: "+estado_de_cuenta+"\nLa cantidad que depositaste  es:"+cuenta_depositando);
            JOptionPane.showMessageDialog(null,"Esta seguro de  hacer esta transaccion","CONFIRMACION",JOptionPane.YES_NO_CANCEL_OPTION);
      
        }
        else{
        JOptionPane.showMessageDialog(null, "ha ingresado una cantidad incorrecta\n*Verifique si tiene fondo necesarios\n*Verifique la donacion sea mayor a $5.00","error",WARNING_MESSAGE);
        }
        
        
        return this.estado_de_cuenta;
           
           
           
           
     
       }
       
       @Override
        public int retirar(int retiro){
            
            
             if ((retiro<=estado_de_cuenta)&&(retiro>=5)) {

             int cuenta_retirando=0;
             cuenta_retirando=retiro;
        estado_de_cuenta=estado_de_cuenta-cuenta_retirando;
    
      
        
            JOptionPane.showMessageDialog(null,"Su estado de actual es: "+estado_de_cuenta+"\nLa cantidad que retiraste es:"+cuenta_retirando);
            
      
        }
        else{
        JOptionPane.showMessageDialog(null, "ha ingresado una cantidad incorrecta\n*Verifique si tiene fondo necesarios\n*Verifique la donacion sea mayor a $5.00","error",WARNING_MESSAGE);
        }
         
        
          return estado_de_cuenta;//aquí estamos actulizando su estado de cuenta
        
           
    }

    

    @Override
    public void mostrar_pefil() {
       JOptionPane.showMessageDialog(null,"Id: "+getId()+"\nPassword:********\nTipo de cuenta: "+getTipo_de_usuario()
                +"\n Estado de cuenta: $"+getEstado_de_cuenta()           ,  "Perfil",WARNING_MESSAGE);
    }
    
    
  //getter y setters--------------------------------------------------------------------------------------------------------

    public int getEstado_de_cuenta() {
        return estado_de_cuenta;
    }

    public String getTipo_de_usuario() {
        return tipo_de_usuario;
    }
       
    
    
    
    
    
    
       
       
       
       
       
       
}
