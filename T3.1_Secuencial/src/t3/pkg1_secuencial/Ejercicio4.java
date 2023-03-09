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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
              
        double faren;
        System.out.println("Introduce los grados Fahrenheit: ");
        faren = s.nextDouble();
        
        double gConver = (faren-32)*5/9;
        System.out.printf("Esto es el resultado en celsius: %.2f \n", gConver);
        

    }
    
}
