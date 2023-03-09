
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        
        boolean par = true;
        if(numero % 2==0){
            par = true;
        }else{
            par = false;
        }
        if(par){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
            
        


    }
    
}
