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
public class empresario extends cliente{
    
    protected  int estado_de_cuenta=10;//le ponemos más dinero en su cuenta, por que se supone que es un empresario XD
    private final String tipo_de_usuario ="Master";

    public int getEstado_de_cuenta() {
        return estado_de_cuenta;
    }

    
    //aplicacion de la herencia----------------------------------
    public empresario(String id, String password) {
        super(id, password);
        
    }

//geters y setters////////////--------------------------------------------------------------------------------------------------------

    public String getTipo_de_usuario() {
        return tipo_de_usuario;
    }

   
    
  //fin de gettr y setter------------------------------------------------------------------------------------
    
  
    
    
    //depositando a mi cuenta------------------------------------------------
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
  //-------------------------------------------------------------
   
      
      
      //retiranado----------------------------------------------------------------------------------------------------------------------------------------------
      // @Override
      @Override
    public int retirar(int cantidad_a_retirar) {
  
          if ((cantidad_a_retirar<=estado_de_cuenta)&&(cantidad_a_retirar>=5)) {

             int cuenta_retirando=0;
             cuenta_retirando=cantidad_a_retirar;
        estado_de_cuenta=estado_de_cuenta-cuenta_retirando;
    
      
        
            JOptionPane.showMessageDialog(null,"Su estado de actual es: "+estado_de_cuenta+"\nLa cantidad que retiraste es:"+cuenta_retirando);
            
      
        }
        else{
        JOptionPane.showMessageDialog(null, "ha ingresado una cantidad incorrecta\n*Verifique si tiene fondo necesarios\n*Verifique la donacion sea mayor a $5.00","error",WARNING_MESSAGE);
        }
         
        
          return estado_de_cuenta;//aquí estamos actulizando su estado de cuenta
        
        
    }
  //fin de retiro--------------------------------------------------
    
    
    
    
    //donando---------------------------------------------------------------------------------------------------------
    //este metod no usa @OVERRIDE por que no se sobreescribe o se vuelve a ocupar
   
    public int  donar(int donacion){
        
        if ((donacion<=estado_de_cuenta)&&(donacion>=5)) {

             int cuenta_donando=0;
             cuenta_donando=donacion;
        estado_de_cuenta=estado_de_cuenta-cuenta_donando;
    
      
        
            JOptionPane.showMessageDialog(null,"Su estado de actual es: "+estado_de_cuenta+"\nLa cantidad de donación es:"+cuenta_donando);
            
      
        }
        else{
        JOptionPane.showMessageDialog(null, "ha ingresado una cantidad incorrecta\n*Verifique si tiene fondo necesarios\n*Verifique la donacion sea mayor a $5.00","error",WARNING_MESSAGE);
        }
         
        
          return estado_de_cuenta;//aquí estamos actulizando su estado de cuenta
       
    }

  //fin de donacion--------------------------------------------------------------------------------
    
    
    
    
    
    //mostrar pefil----------------------------------------------------------------------------------------------------------
    @Override
    public void mostrar_pefil() {
        JOptionPane.showMessageDialog(null,"Id: "+getId()+"\nPassword:********\nTipo de cuenta: "+getTipo_de_usuario()
                +"\n Estado de cuenta: $"+getEstado_de_cuenta()           ,  "Perfil",WARNING_MESSAGE);
      
    }
//fin de mostrar perfil------------------------------------------------

  

    
    
   

    
}   
