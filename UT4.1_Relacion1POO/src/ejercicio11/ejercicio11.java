/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;


/**
 *
 * @author ps4an
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Factura facturaPrueba= new Factura("1111");
        System.out.print("Indica la referencia: ");
        String ref = s.nextLine();
        
        System.out.print("Indica la descripción: ");
        String des = s.nextLine();
        
        System.out.print("Indica la cantidad: ");
        int cant = Integer.parseInt(s.nextLine());
        
        System.out.print("Indica el precio unitario: ");
        double precio = Double.parseDouble(s.nextLine());
        
        
        facturaPrueba.añadirLinea(ref,des,cant,precio);
        facturaPrueba.imprimirFactura();
        
      
    }
    
}
