/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandrocanovasgarcia_exa_estructurada2;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio1_NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int num, num1, num2;
        System.out.println("Ejercicio 1 - Numeros primos");
        System.out.println("===========================");
        System.out.print("Indica el primer número: ");
        num1 = Integer.parseInt(s.nextLine());
        System.out.print("Indica el segundo número: ");
        num2 = Integer.parseInt(s.nextLine());
        System.out.println("");
        
        if (num1<0)  num1 = num1-(+num1)*2;
        if (num2<0) num2 = num2-(+num2)*2;
        
        System.out.println("Los numeros primos comprendidos entre ("+num1+") y ("+num2+") son:");
        imprimirPrimos(num1,num2);
        
    }
    public static boolean esPrimo (int num){
        for(int i=2;i<num;i++) {
        if(num%i==0)
            return false;
        }
        return true;
    }
    public static void imprimirPrimos(int num1, int num2){
        if (num1<0) {
            num1 = num1-(+num1)*2;
        }
        if (num2<0) {
            num2 = num2-(+num2)*2;
        }
        if (num1<num2) {
            for (int i = num1; i < num2+1; i++) {
                if (esPrimo(i)) {
                    System.out.println(i);
                }
            }
        }else{
            for (int i = num2; i < num1+1; i++) {
                if (esPrimo(i)) {
                    System.out.println(i);
                }
            }

        }
        
    }
}
