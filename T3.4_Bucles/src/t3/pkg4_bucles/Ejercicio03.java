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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            int n;
            int suma=0;
            int cuenta=0;
        System.out.print("Indica el numero: ");
        n=Integer.parseInt(s.nextLine());
        suma=suma+n;
        cuenta++;  

        while(n!=0){
            cuenta++;  
            System.out.print("Indica el numero: ");
            n=Integer.parseInt(s.nextLine()); 
            suma=suma+n;

        }
            System.out.println("La cuenta total es de: "+(cuenta-1));
            System.out.println("La suma total es de: "+suma);
        
//        
//        do{
//        cuenta++;    
//        System.out.print("Indica el numero: ");
//        n=Integer.parseInt(s.nextLine());
//        suma=suma+n;
//        }while(n!=0);
//        System.out.println("La cuenta total es de: "+(cuenta-1));
//        System.out.println("La suma total es de: "+suma);
//    
//
//        
//        
        

    }
    
}
