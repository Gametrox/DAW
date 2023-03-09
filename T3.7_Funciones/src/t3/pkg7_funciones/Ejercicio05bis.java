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
public class Ejercicio05bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int num = 0;
        int minimo = 0;
        int maximo = 0;
        
        System.out.print("Indica el mínimo: ");
        minimo = Integer.parseInt(s.nextLine());
        System.out.print("Indica el maximo: ");
        maximo = Integer.parseInt(s.nextLine());
        
        System.out.printf("Los numeros generados aleatoriamente entre %d y %d son los siguientes:\n",minimo,maximo);
        for (int i = 0; i < 9; i++) {
            if (minimo > 0 && maximo > 0){
                System.out.println(aleatorio(num,minimo,maximo));
            } else if (minimo == maximo){
                System.out.println(aleatorio(num,minimo,maximo));
            }
        }
        System.out.println("");
        
    }
    public static int aleatorio(int num,int min, int max){
        
        num=(int)(Math.random()*(max-min+1)+min); 
        return num;
    }
}
