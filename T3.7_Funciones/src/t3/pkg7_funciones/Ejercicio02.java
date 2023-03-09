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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String numero = "";
        int num;
        do{
            System.out.print("Inidca un numero para ver si es afortunado (Intro para salir): ");
            numero = s.nextLine();
            if (!numero.equals("")) {
             num = Integer.parseInt(numero);
                if (esAfortunado(num)==true) {
                    System.out.println("\033[32mNUMERO GANADOR");
                    System.out.println("");
                } else {
                    System.out.println("\033[31mHas perdido");
                    System.out.println("");
                }    
            }else{
                  System.out.println(""); 
                }
        }while(!numero.equals(""));
        
        
    }
    public static boolean esAfortunado(int num){
        int afortunados = 0;
        int noAfortunados = 0;
    while (num > 0) {
        int digito = (int)(num % 10);
        if ((digito == 2) || (digito == 5) || (digito == 8)) {
            afortunados++;
        }else {
            noAfortunados++;
        }
        num /= 10;
       }
       if (afortunados > noAfortunados)
       return true;
       else
       return false;

    }
    
}
