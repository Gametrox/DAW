/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg1_secuencial;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
            double base;
            double altura;
            
            System.out.println("Calcular el area y perimetro del rectangulo");
            System.out.println("-------------------------------------------");
            System.out.print("Introduce la base: ");
            base = s.nextDouble();
         
            System.out.print("Introduce la altura: ");
            altura = s.nextDouble();
            
            double area = (base*altura);
            double perimetro = (base*2)+(altura*2);
            
            System.out.printf("El perímetro es %.1f y el area es de %.1f",perimetro,area);
        
                
        
  
    }
    
}
