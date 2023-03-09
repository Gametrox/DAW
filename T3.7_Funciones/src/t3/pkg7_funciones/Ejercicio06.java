/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg7_funciones;

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
        Scanner s = new Scanner(System.in);
       
        
        System.out.println("                ---INDICA EL COLOR---");
        System.out.println("1.Cian | 2.Rojo | 3.Verde| 4.Amarillo | 5.Azul | 6.Morado");
        int num = Integer.parseInt(s.nextLine());
        System.out.print("Indica la frase a colorear: ");
        String frase = s.nextLine();
        System.out.println("                ---INDICA EL COLOR---");
        System.out.println("1.Cian | 2.Rojo | 3.Verde| 4.Amarillo | 5.Azul | 6.Morado");
        int num2 = Integer.parseInt(s.nextLine());
        System.out.print("Indica la frase 2 a colorear: ");
        String frase2 = s.nextLine();
        System.out.println("                ---INDICA EL COLOR---");
        System.out.println("1.Cian | 2.Rojo | 3.Verde| 4.Amarillo | 5.Azul | 6.Morado");
        int num3 = Integer.parseInt(s.nextLine());
        System.out.print("Indica la frase 3 a colorear: ");
        String frase3 = s.nextLine();
        System.out.println(devolverCadenaColor(frase,num));
        System.out.println(devolverCadenaColor(frase2,num2));
        System.out.println(devolverCadenaColor(frase3,num3));
        
        
        
        
        
    }
    public static String devolverCadenaColor(String cadena, int num){
        switch (num) {
            case 1:
                cadena = String.format("\033[36m%S",cadena);
                break;
            case 2:
                cadena = String.format("\033[31m%S",cadena);
                break;
            case 3:
                cadena = String.format("\033[32m%S",cadena);
                break;
            case 4:
                cadena = String.format("\033[33m%S",cadena);
                break;
            case 5:
                cadena = String.format("\033[34m%S",cadena);
                break;
            case 6:
                cadena = String.format("\033[35m%S",cadena);
                break;
            default:
                System.out.println("\033[31mERROR EN EL COLOR");
        }
        return cadena;
    
        
    }
    public static void imprimirCadenaColor(String color, String cadena){
        switch (color) {
            case "rojo":
                cadena = String.format("\033[31m color rojo");
                break;
            case "verde":
                cadena = String.format("\033[32m color verde");
                break;
            case "amarillo":
                cadena = String.format("\033[33m color amarillo");
                break;
            default:
                System.out.println("Error");
        }
    
    
    }
    
}
