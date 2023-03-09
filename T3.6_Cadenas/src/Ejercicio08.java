
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String cadena = ""; 
        String inc = "";
        
        System.out.print("Escribe algo: ");
        cadena = s.nextLine();
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                inc = inc + cadena.charAt(i);
            }
        }System.out.println(inc);
    
    
    
    
    
    
    
    }
    
}
