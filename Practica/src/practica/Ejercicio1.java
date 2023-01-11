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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String cad1 = "la lluvia en sevilla";
        String cad2 = "la lluvia en sevilla";
        String cad3 = "maravilla";
        String cad4 = "maravilla";
        
        System.out.println(iguales(cad1, cad2));
        System.out.println(iguales(cad3, cad4));
        
    }
    public static boolean iguales (String cadena1, String cadena2){
        if (cadena1.length()==cadena2.length()) {
           for (int i = 0; i < cadena1.length(); i++) {
                if (cadena1.charAt(i)==cadena2.charAt(i)) {
                    return true;
                } else {
                    return false;
                }
            } 
        }
        
        return false;
    }
    
    
    
}
