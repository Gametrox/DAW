
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String cadena = "Alicia tiene 35 años";
        String [] cadenaSeparada = cadena.split(" ");
        
        String palabra1 = "";
        String palabra2 = "";
        
        System.out.print("Inidca la 1º posición a buscar: ");
        int buscador = Integer.parseInt(s.nextLine());
        
        System.out.print("Inidca la 2º posición a buscar: ");
        int buscador2 = Integer.parseInt(s.nextLine());
        
        for (int i = 0; i < cadenaSeparada.length; i++) {
            palabra1 = cadenaSeparada[buscador-1];
            palabra2 = cadenaSeparada [buscador2-1];
        }
        System.out.println(palabra1);
        System.out.println(palabra2);

    }
    
}
