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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);        
            int n;
            int sum=0;

        System.out.print("Indica el numero: ");
        n=Integer.parseInt(s.nextLine());
        
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("La suma de los "+n+" primeros numeros es: "+sum);

        int factorial=1;
        
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("El factorial de "+n+" es: "+factorial);
        
        
        
        
            
        }
        
        


    }
    
