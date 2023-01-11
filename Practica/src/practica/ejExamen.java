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
public class ejExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(elevar(0, 0));
        
        
    }
    public static int elevar(int base, int exponente){
        Scanner s = new Scanner(System.in);
        System.out.print("Indica la base: ");
        base = Integer.parseInt(s.nextLine());
        System.out.print("Indica el exponente: ");
        exponente = Integer.parseInt(s.nextLine());
        int resultado=base;
        int acumulador = base;
        if (exponente == 0) {
            resultado = 1;
        } else {
            for (int i = 1; i < exponente; i++) {
                acumulador = base*acumulador;        
                resultado = acumulador;
            }
        }
        
        System.out.println("El resultado es "+resultado);
        return resultado;
        
    }
    
}
