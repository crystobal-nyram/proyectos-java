/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author crisn
 */
public abstract  class cliente {
    
    protected String id;
    protected String contraseña;
    
    public cliente(String id,String password){
    this.id=id;
   
    }
    
    public cliente(String contraseña){
         this.contraseña=contraseña;
        
    }
    

    
  
    
    public String getId() {
        
        return this.id;
    }

    public String getContraseña() {
        return this.contraseña;
    }
    
    
    //nuestro metodos son abstractos, porque lo heredamos a nuestros usuarios..empresario y empleado
    public abstract void mostrar_pefil();

    /**
     *
     * @param retirar
     * @return
     */
    public abstract int retirar(int retirar);
    public abstract int depositar_a_mi_cuenta(int deposito);
    
 //   public  void donar();
    
    
    
    
}
