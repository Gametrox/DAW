/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class cajatexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String cadena = "merequetenge";
        cajaTexto(cadena);
        
    }
    public static void cajaTexto(String cadena){
        for (int i = 0; i < cadena.length()+4; i++) {
            System.out.print("#");
        }
        System.out.print("\n# "+cadena+" #\n");
        for (int i = 0; i < cadena.length()+4; i++) {
            System.out.print("#");
        }
        System.out.println("");
    }
    
}
