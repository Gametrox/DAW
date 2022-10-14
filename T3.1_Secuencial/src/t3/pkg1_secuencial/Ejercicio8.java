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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dec,ud;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el numero a invertir: ");
        int numero = s.nextInt();
        
        dec = (numero/10);
        ud = (numero%10);
        
        System.out.printf("El numero invertido es: %d%d\n",ud,dec);
        
        int inverT = (ud*10)+dec;
        System.out.println("El numero invertido en variable es: "+inverT);
        

    }
    
}
