
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Practica_Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        double estatura;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        nombre = s.nextLine();
        
        System.out.print("Introduce tu edad: ");
        edad = Integer.parseInt(s.nextLine());
        
        System.out.print("Por último, introduce tu estatura: ");
        estatura = Double.parseDouble(s.nextLine());
        
        System.out.println("Tu nombre es: "+ nombre + " | Tu edad es: "+ edad + " años | Mides: "+ estatura);
        
        
        
        
        
    }
    
}
