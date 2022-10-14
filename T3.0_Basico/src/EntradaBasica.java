
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class EntradaBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        double estatura;
        
//        Scanner s = new Scanner(System.in);
//        
//        System.out.print("Introduce tu nombre: ");
//        nombre = s.nextLine();
//        System.out.print("Introduce tu edad: ");
//        edad = Integer.parseInt(s.nextLine());
//        System.out.println("Introduce tu altura: ");
//        estatura = Double.parseDouble(s.nextLine());
//        
//        System.out.printf("Tu nombre es %s, tienes %d años y mides %.2f cm",nombre,edad,estatura);
//        
        Scanner s = new Scanner(System.in);
        
        int num;
        String cadena;
        System.out.print("Introduce tu nombre: ");
        num=s.nextInt();
        System.out.println("Has introducido el numero -->"+num);
        
        System.out.print("Introduce cadena: ");
        cadena=s.nextLine();
        System.out.println("Has introducido la cadena -->"+cadena);
           






    }
    
}
