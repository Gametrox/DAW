/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sFrase, fecha;
            
        //PARTE 1, INDICAR LA FRASE Y SEPARARLA
            System.out.println("Indica la frase: ");
            sFrase = s.nextLine();

            String [] palabra = sFrase.split(" ");
            System.out.printf("La frase tiene  %d palabras\n",palabra.length);

            for (int i = 0; i < palabra.length; i++) {
                System.out.println(palabra[i]);
            }
        
        //PARTE 2 ( INDICAR Y SEPARAR FECHA )
            System.out.println("Indica la fecha: ");
            fecha = s.nextLine();
            
            String [] sFecha = fecha.split("/");
            
            System.out.println("************");
            System.out.println("La fecha es: ");
            System.out.printf("Día-> %s\nMes-> %s\nAño-> %s\n",sFecha[0],sFecha[1],sFecha[2]);
        
    }
    
}
