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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double m1;
        double m2;
        double m3;
        double media;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la primera nota: ");
        m1 = s.nextDouble();
        
        System.out.print("Introduce la seguna nota: ");
        m2 = s.nextDouble();
        
        System.out.print("Introduce la tercera nota: ");
        m3 = s.nextDouble();
        
        media = (m1+m2+m3)/3;
        System.out.printf("La nota media es de: %.2f \n",media);

    }
    
}
