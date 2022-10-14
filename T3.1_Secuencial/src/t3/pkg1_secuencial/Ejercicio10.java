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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int mone1,mone2,mone50,mone20,mone10;
        System.out.print("Monedas de 1€: ");
        mone1 = s.nextInt();
        System.out.print("Monedas de 2€: ");
        mone2 = s.nextInt();
        System.out.print("Monedas de 50 cent: ");
        mone50 = s.nextInt();
        System.out.print("Monedas de 20 cent: ");
        mone20 = s.nextInt();
        System.out.print("Monedas de 10 cent: ");
        mone10 = s.nextInt();
        
        
        double totEur = (mone1 * 2) + (mone2 * 1) + (mone50 * 0.5) + (mone20 * 0.2) + (mone10 * 0.1);
     
        

        System.out.println("---------Totales---------");
        System.out.printf("Euros: %.2f€\n",totEur);
        
        
        System.out.print("-------------------------");
        System.out.print("El total suma: ");
        

        
        




    }
    
}
