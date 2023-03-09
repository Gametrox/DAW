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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int num ;
        
        System.out.println("Inidca un numero: ");
        num = Integer.parseInt(s.nextLine());
        if (esPar(num)) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
        
        
    }
    //FUNCIONES
    public static boolean esPar(int num){
        boolean comprobante;
        if (num % 2 == 0) {
            comprobante = true;
        } else {
            comprobante = false;
        }
        return comprobante;
        
    }
    
    
    
}
