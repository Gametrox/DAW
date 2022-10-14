
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        
        System.out.print("Indica el numero entero: ");
        num = s.nextInt();
        
        if(num>0){
           System.out.println("El numero es positivo");
        }else if(num<0){
           System.out.println("El numero es negativo");
        }else{
           System.out.println("El numero es igual a 0");
    }
    }
    
}
