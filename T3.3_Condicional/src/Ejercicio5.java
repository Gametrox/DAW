
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int año;
        
        System.out.print("Indica el año: ");
        año= Integer.parseInt(s.nextLine());
        
        if(año%4==0 && año%100!=0 || (año%100==0 && año%400==0)){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
        



    }
    
}
