/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        String cadena = "";
        
        System.out.print("Indica la cadena: ");
        cadena = s.nextLine();
        
        System.out.println("---Forma 1 [charAt]---");
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i));
            System.out.print(" ");
        }
        System.out.println("\n");
        
        System.out.println("---Forma 2[substring]---");
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.substring(i,i+1));
        }
    }
    
}
