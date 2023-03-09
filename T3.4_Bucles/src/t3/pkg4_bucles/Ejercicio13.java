/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg4_bucles;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio13 {

    //
    //
    //
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("    CALCULO DE DIVISORES");
        System.out.println("============================");
        System.out.print("Dime un numero (0 para salir): ");
        num = Integer.parseInt(s.nextLine());
        do{
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.out.println("El numero "+i+" es divisor de "+num);
                }
            }
            System.out.print("Indica el numero (0 para salir): ");
            num = Integer.parseInt(s.nextLine());
            
        }while(num!=0);



    }
    
}
