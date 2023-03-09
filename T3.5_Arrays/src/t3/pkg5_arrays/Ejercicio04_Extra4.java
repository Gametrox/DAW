/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

/**
 *
 * @author ps4an
 */
public class Ejercicio04_Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] teamA = {1,5,3,4};
        int [] teamB = {5,1,4,3};
        
        boolean esIgual=true;        
        
        for (int i = 0; i < teamA.length; i++) {
            for (int j = 0; j < teamB.length; j++) {
                if (teamA[i]==teamB[j]) {
                    esIgual=true;
                    break;
                }else{
                    esIgual=false;
                }
            }
            
        }
        if (esIgual==true) {
            System.out.println("Son iguales");
        }else{
            System.out.println("NO SON IGUALES");
        }
        
    
    
    
    
    
    
    
    
    
    
    }
    
}
