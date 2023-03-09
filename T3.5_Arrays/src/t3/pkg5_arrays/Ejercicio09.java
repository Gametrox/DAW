/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

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
        Scanner s = new Scanner (System.in);
        
        String [] nombres = new String [3];
        int [] edades = new int [3];
        String sNombre = "";
        String nomMayor = "";
        String nomMenor = "";
        
        int sEdad;
        int maxEdad;
        int minEdad;
        
        System.out.println("********************");
        System.out.println("Comparador de edades");
        System.out.println("********************");
        
    
        for (int i = 0; i < nombres.length; i++) {
            
                System.out.print("Indica el nombre del alumno: ");
                sNombre = s.nextLine();
                nombres[i]=sNombre;

                System.out.print("Ahora la edad: ");
                sEdad = Integer.parseInt(s.nextLine());
                edades[i] = sEdad;
                System.out.println("");
            
        }
            maxEdad = edades[0];
            minEdad = edades[0]; 
        for (int i = 0; i < nombres.length; i++) {
            
            if (edades[i] > maxEdad){ 
                maxEdad = edades[i]; 
                nomMayor = nombres[i];
            }
            if (edades[i] < minEdad){ 
                minEdad = edades[i]; 
                nomMenor = nombres[i];
            }
            
        }
    
        System.out.println("El mayor es-> "+nomMayor);
        System.out.println("El menor es-> "+nomMenor);
        
        
        
        
        
        
    }
    
}
