/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        String cadena = "";
        int apariciones = 0;
        int espacios = 0;
        
        System.out.print("Indica la frase: ");
        cadena = s.nextLine();
        
        System.out.print("Inidca la letra para comprobar: ");
        String letra = s.nextLine();
        
        for (int i = 0; i < cadena.length(); i++) {
            if (letra.charAt(0) == cadena.charAt(i)) {
                apariciones++;
            }
            if (cadena.charAt(i)==' ') {
                espacios++;
            }
        }
        
        System.out.println("La letra ["+letra.charAt(0)+"] aparece: "+apariciones+" veces");
        System.out.println("Hay "+(espacios+1)+" palabras");
    }
    
}
