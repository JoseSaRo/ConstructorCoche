
package coche;

/**
 *
 * @author Jose Salinas
 */
public class Coche {

    public static void main(String[] args) {
        
         
        /**
         * Se llama al metodo enviando como valor 0 
         */
        System.out.println("Coche sin gasolina");
        auto sinGas = new auto(0);
        sinGas.avanzar();
        
        /**
         * Se llama al metodo enviando como valor 1
         */
        System.out.println("Coche con gasolina");
        auto conGas = new auto(25);
        conGas.avanzar();
        
        
        
    }
    
}
