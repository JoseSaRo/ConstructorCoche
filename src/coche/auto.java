
package coche;

/**
 *
 * @author Jose salinas
 */
public class auto {
    
    /**
     * Se declara una variable gas privada
     */
    private int gas=0;
    
    /**
     * Constructor de clase con gas
     */
    auto (int gas){
        this.gas = gas;
    }
    
    
    
    /**
     * Metodo en el que se evalua si tiene gasolina
     */
    public void avanzar(){
        if(gas>0){
                System.out.println("Si avanza");  
        }
        else{
            System.out.println("No avanza");
        }
    }
    
}
