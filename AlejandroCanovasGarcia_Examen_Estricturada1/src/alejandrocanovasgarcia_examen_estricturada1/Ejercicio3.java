/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandrocanovasgarcia_examen_estricturada1;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int base = 0;
        int exp = 0;
        int resultado = 0;
        int acumulador = 0;
        System.out.println("Ejercicio [3] - Cálculo de potencia");
        System.out.println("===================================");
        
        System.out.print("Dime la base: ");
        base = Integer.parseInt(s.nextLine());
        System.out.print("Dime el exponente: ");
        exp = Integer.parseInt(s.nextLine());
        
        for (int i = 0; i < exp; i++) {
            if (exp>0) {
               resultado = base*exp; 
            } else if (exp<0){
                i = exp;
                resultado = i/exp; 
            } else{
                resultado = '1';

            }
        }
        System.out.println("El número "+base+" elevado a "+exp+" es: "+resultado);
        

    }
    
}
