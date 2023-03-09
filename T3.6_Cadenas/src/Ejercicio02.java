/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        String cadena = "";
        int consonante = 0;
        int vocal = 0;

        System.out.print("Indica la frase: ");
        cadena = s.nextLine().toLowerCase();
        
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a','e','i','o','u':
                    vocal++;
                case '1','2','3','4','5','6','7','8','9','0', ' ':
                    consonante--;
                default:
                    consonante++;
            }
           
        }
        System.out.printf("Hay [%d] vocales y [%d] consonantes\n",vocal,consonante);
    }
    
}
