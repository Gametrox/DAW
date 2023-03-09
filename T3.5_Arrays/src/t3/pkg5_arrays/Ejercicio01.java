/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

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
        Scanner s = new Scanner(System.in);
        //Parte 1
//        //Manera 1
//        String [] list ={"perro","gato","conejo","pollo","leon"};
//        System.out.println(list[0]);
//        System.out.println(list[1]);
//        System.out.println(list[2]);
//        System.out.println(list[3]);
//        System.out.println(list[4]);
//
//        //Manera 2
//        for(int i = 0; i < list.length; i++){
//            System.out.println(list[i]);
//        }
        //Parte 2
        int [] num = {2,4,6,8,10};
        for(int i = num.length-1; i >= 0; i--){
            System.out.println(num[i]);
        }
        
    }
    
}
