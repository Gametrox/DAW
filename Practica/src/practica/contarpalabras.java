/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class contarpalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        String cadena = "";
        String actualizar;
        int cantidad = 0;
        
        System.out.print("Cuantas palabras tendrá la frase: ");
        cantidad = Integer.parseInt(s.nextLine());
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Indica la ("+(i+1)+") palabra: ");
            actualizar = s.nextLine();
            cadena = cadena+actualizar;
            
        } System.out.println(cadena);
        
        String [] separar = cadena.split(" ");
        String iniciales = "";
        for (int i = 0; i < separar.length; i++) {
            iniciales = separar[0];
            iniciales = iniciales.toUpperCase();
        }System.out.println(iniciales);
    
    
    
    }
    
}
