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
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char inchar;
        do{
            System.out.print("Indica el caracter: ");
            inchar=s.nextLine().charAt(0);  
            if(inchar=='a' || inchar=='e' || inchar=='i' || inchar=='o' || inchar=='u' || 
               inchar=='A' || inchar=='E' || inchar=='I' || inchar=='O' || inchar=='U'){
                System.out.println("VOCAL");   
            }else if(inchar==' '){
                System.out.println("FIN");
            }else{
                System.out.println("NO VOCAL");
            }
            
            
        }while(inchar!=' ');
        
        
        
    }
    
}
