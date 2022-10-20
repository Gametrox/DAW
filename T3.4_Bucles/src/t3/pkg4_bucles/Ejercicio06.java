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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            int pass;
            int i=4;
        do{
            System.out.print("Indica la contraseña: ");
            pass=Integer.parseInt(s.nextLine());
            
            if(pass==4566){
                System.out.println("Contraseña correcta!");
                System.out.println("Has accedido al sistema");
                break;
            }else{
                System.out.println("Contraseña incorrecta");
                i--;
                System.out.println("Quedan "+i+" intentos");
                if(i==0){
                    System.out.println("Limite de intentos excedido, prueba más tarde nuevamente.");
                }
            }
        }while(i!=0);
            
        


    }
    
}
