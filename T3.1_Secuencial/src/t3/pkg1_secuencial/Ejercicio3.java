/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg1_secuencial;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
         int descuento;
         int precio;
                    
            System.out.print("Introduce el descuento: ");
            descuento = s.nextInt();
            
            System.out.print("Introduce el precio original: ");
            precio = s.nextInt();
            
            int pFinal = precio-(descuento*precio)/100;
            System.out.printf("El precio total con el descuento aplicado es de: %d \n",pFinal);
        
    }
    
}
