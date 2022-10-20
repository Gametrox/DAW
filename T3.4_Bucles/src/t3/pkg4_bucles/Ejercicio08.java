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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);    
            int num;
            boolean neg;
        do{
            System.out.print("Indicar numero: ");
            num=Integer.parseInt(s.nextLine());
        if(num<0){
                neg=true;
        }
        }while(num!=0);
        if(neg=true){
                System.out.println("HAY NUMEROS NEGATIVOS");
            }
        System.out.println("FIN");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
