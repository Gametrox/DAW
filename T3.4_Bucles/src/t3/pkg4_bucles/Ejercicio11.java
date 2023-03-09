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
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            String num;
            int numG=0;
            int numB=0;
            char caracter;
            
        System.out.print("Indica el numero afortunado: ");
        num = s.nextLine();
        
        while(!num.equals("")){
            numG=0;
            numB=0;
            for(int i=0;i<num.length();i++){
                caracter = num.charAt(i);
                    switch(caracter){
                        case '2','5','8':
                            numG++;
                            break;
                        default:
                            numB++;
                            break;
                    }    
            }if(numG>numB){
                System.out.println("------------------");
                System.out.println("Tu numero es bueno");
                System.out.println("------------------");
            }else{
                System.out.println("-----------------");
                System.out.println("Tu numero es malo");
                System.out.println("-----------------");
            }
            System.out.print("Indica otro número: ");
            num = s.nextLine();
    };
        
        
        
        
        
        
    }
    
}
