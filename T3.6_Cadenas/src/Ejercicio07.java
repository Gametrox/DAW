
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String palabra1 = "";
        String palabra2 = "";
        do{
            System.out.print("Indica la primera palabra: ");
            palabra1 = s.nextLine();
            System.out.print("Indica la segunda palabra: ");
            palabra2 = s.nextLine();
            if (!palabra1.equals(palabra2)) {
                palabra1 = palabra1.toUpperCase();
                palabra2 = palabra2.toUpperCase();
            } else {
                palabra1 = palabra1.toLowerCase();
                palabra2 = palabra2.toLowerCase();

            }

            if (palabra1.equals(palabra2)) {
                System.out.println("Iguales");
            } else {
                System.out.println("Desiguales");
            }
        }while (!palabra1.equals("."));
    }
    
}
