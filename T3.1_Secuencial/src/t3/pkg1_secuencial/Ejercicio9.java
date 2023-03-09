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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String ini1,ini2,ini3;
        String nombre;
        char a,b,c;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Escribe tu nombre completo: ");
        ini1 = s.next(); ini2 = s.next(); ini3 = s.next();
        
        a = ini1.charAt(0);
        b = ini2.charAt(0);
        c = ini3.charAt(0);
        
        System.out.printf("Las iniciales de tu nombre son: %c%c%c",a,b,c);
        
        
        


    }
    
}
