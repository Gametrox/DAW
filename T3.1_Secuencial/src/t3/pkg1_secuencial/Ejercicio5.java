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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
      double sBase;
      double comision;
      double venta1;
      double venta2;
      double venta3;
      
        System.out.print("Indica el salario base: ");
        sBase = s.nextDouble();
        
        System.out.print("Indica la primera venta: ");
        venta1 = s.nextDouble();
        
        System.out.print("Indica la segunda% venta: ");
        venta2 = s.nextDouble();
        
        System.out.print("Indica la tercera venta: ");
        venta3 = s.nextDouble();
        
        comision = (venta1 + venta2 + venta3)*0.10;
        
        System.out.println("El sueldo base es de: " + sBase);
        System.out.println("La comision obtenida por las ventas es de: " + comision);
        System.out.printf("El total a percibir es: %.2f€ ", sBase+comision);
        
    }
    
}
