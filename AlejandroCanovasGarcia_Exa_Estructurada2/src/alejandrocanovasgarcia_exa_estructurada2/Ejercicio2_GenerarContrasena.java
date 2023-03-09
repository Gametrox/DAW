/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandrocanovasgarcia_exa_estructurada2;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio2_GenerarContrasena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Ejercicio 2 - Generar contraseñas");
        System.out.println("=================================");
        System.out.print("Dime una frase:\n--> ");
        String cadena = s.nextLine();

        System.out.println(generarContrasena(cadena));
        
    }
    public static String generarContrasena(String cadena){
        String contrasena = "";
        String [] simbolos = {"+","$","@","!","#"};
        int random = (int)(Math.random()*10);
        char primeraLetra = cadena.charAt(0);
        contrasena = contrasena + primeraLetra;
        contrasena = contrasena.toUpperCase();
        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i-1)==' ') {
                contrasena = contrasena + cadena.charAt(i);
            }
        }
        contrasena = contrasena + simbolos[random];
        contrasena = contrasena + random;
        return contrasena;
    }
}
