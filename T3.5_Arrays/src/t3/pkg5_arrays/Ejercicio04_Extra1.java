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
public class Ejercicio04_Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] list = new int [5];
        int num;
        boolean numPar=true;
        
        for(int i = 0; i < list.length; i++){
            System.out.print("Indica un número: ");
            num = Integer.parseInt(s.nextLine());
            list[i] = num;
            
        }
        for(int i = 0; i < list.length; i++){
            if(list[i]%2!=0){
                numPar = false;
            }
        }
        if (numPar == true){
            System.out.println("Los numeros SI son pares");
        }else{
            System.out.println("Los numeros NO son pares");
        }
 
    }
    
}
