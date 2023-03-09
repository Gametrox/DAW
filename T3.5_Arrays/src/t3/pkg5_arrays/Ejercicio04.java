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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int [] vector = new int [5];
        int num;
        
        
        for(int i=0; i<vector.length;i++){
            System.out.print("Indica el numero: ");
            num = Integer.parseInt(s.nextLine());
            vector[i] = num;
            if(num<0) break;
                        

        }
        System.out.println("Los numeros introducidos son: ");
        for(int i=0;i<vector.length;i++){
            if(vector[i]>0){
                System.out.println(vector[i]);
            }       
        }


    
    
    
    
    }
    
}
