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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        int num;
//        
//        System.out.print("Indica el numero para ver su tabla: ");
//        num=Integer.parseInt(s.nextLine());
//        
//        for(int i=0;i<=10;i++){
//            System.out.println(num+"x"+i+"="+(num*i));
//        }
       
        int j=1;
        int num;
            System.out.print("Indica el numero para ver su tabla: ");
            num=Integer.parseInt(s.nextLine());
        while(j<=10){
            System.out.println(num+"x"+j+"="+(num*j));
            j++;
        }
        
        
        
        
        
        
        
        
    }
    
}
