/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

/**
 *
 * @author ps4an
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []numeros = {5,2,4,4,3,4};
        int maxRep = 0;
        int moda = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numrep = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i]==numeros[j]) {
                    numrep++;
                }
                if (maxRep<numrep) {
                    moda = numeros[i];
                    maxRep = numrep;
                }
            }
            
        }
        System.out.println(moda);
        
    
    
}   
}
    

