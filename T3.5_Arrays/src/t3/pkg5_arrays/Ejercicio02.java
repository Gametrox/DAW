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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int [] num = new int[5];
        int numC;
        
        for(int i = 0; i < num.length; i++){
            System.out.print("Indica un número: ");
            numC=Integer.parseInt(s.next());
            num[i]=numC;
            
        }
        System.out.println("ARRAY DE NUMEROS");
        System.out.println("----------------");
        for(int i = 0;i<num.length;i++){
            System.out.printf("Numeros[%d]%10d\n",i,num[i]);
        }
       
        System.out.print("\nArray --> [");
        for (int i = 0; i < num.length-1; i++) {
            System.out.printf("%d|",num[i]);
        }
        System.out.printf("%d]\n",num[num.length-1]);
        
        
        
        
    }
    
}
