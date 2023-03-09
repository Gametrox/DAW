/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg7_funciones;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String cadena_vacia = "";
        String cadena = "";
        String cadenaIntroducir = "";
        int selMenu = 0;
        
        do {
            switch (selMenu) {
                case 1:
                    cadena = devolverCadena(s, cadenaIntroducir);
                    break;
                case 2:
                    cadena = capitalizarCadena(cadena);
                    break;
                case 3:
                    cadena = sustituirBlancos(cadena);
                    break;
                case 4:
                    break;
                default:
                    break;
            }
            System.out.print(menu(cadena_vacia,cadena));
            selMenu = Integer.parseInt(s.nextLine());
            
        } while (selMenu != 4);
        
        
    }
    public static String menu(String mostrar, String chain){
        System.out.println("*****************");
        System.out.println("Cadena: "+chain);
        System.out.println("*****************");
        System.out.println("1. Introducir nueva cadena");
        System.out.println("2. Capitalizar la cadena");
        System.out.println("3. Sustituir los espacios en blanco por _");
        System.out.println("4. Salir");
        return mostrar;
    }
    public static String devolverCadena(Scanner s,String cadena_nueva){
        System.out.print("Indica la nueva cadena: ");
        cadena_nueva = s.nextLine();
        return cadena_nueva;
    }
    public static String capitalizarCadena(String cadena){
        String cadenaNueva = "";
        char primLetra, letra;
        
        primLetra = cadena.charAt(0);
        primLetra = Character.toUpperCase(primLetra);
        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i-1)==' ') {
               letra = cadena.charAt(i);
               letra = Character.toUpperCase(letra);
               cadenaNueva = cadenaNueva + letra;
            } else {
                letra = cadena.charAt(i);
                letra = Character.toLowerCase(letra);
                cadenaNueva = cadenaNueva + letra;
            }
        }
        cadenaNueva = primLetra+cadenaNueva;
    return cadenaNueva;
    }
    public static String sustituirBlancos(String cadenaCambiada){
        cadenaCambiada = cadenaCambiada.replace(" ","_");
        
        return cadenaCambiada;
    }
    }

