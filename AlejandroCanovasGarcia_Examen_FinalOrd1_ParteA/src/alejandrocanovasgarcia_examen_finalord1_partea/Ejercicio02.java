/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandrocanovasgarcia_examen_finalord1_partea;

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
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        System.out.println("EJercicio 2 - Numeros primos");
        System.out.println("============================");
        System.out.print("Indica el primer número: ");
        int num1 = Integer.parseInt(s.nextLine());
        System.out.print("Indica el segundo número: ");
        int num2 = Integer.parseInt(s.nextLine());
        imprimirPrimos(num1,num2);
        
        
    }
    public static boolean esPrimo(int numero){
       int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
          if (numero % contador == 0)
            primo = false;
          contador++;
        }
        return primo;
      }
    
    public static void imprimirPrimos(int num1,int num2){
        if (num1<0) {
            num1 = num1*-1;
            
        }
        if (num2<0) {
            num2 = num2*-1;
        }
        if (num1>num2) {
            System.out.println("Numeros primos entre "+num2+" y "+num1);
            for (int i = num2; i <= num1; i++) {
                if (esPrimo(i)) {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Numeros primos entre "+num1+" y "+num2);
            for (int i = num1; i <= num2; i++) {
                if (esPrimo(i)) {
                    System.out.println(i);
                }
            }
        }
        
    }
}
