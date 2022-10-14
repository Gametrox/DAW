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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int c;
        
        System.out.print("Introduce el valor de A: ");
        a = s.nextInt();
        System.out.print("Ahora el de B: ");
        b = s.nextInt();
        
        c = a;
        a = b;
        b = c;
        
        System.out.printf("Ahora A vale: %d y B vale: %d\n",a,b);
        

        
        

    }
    
}
