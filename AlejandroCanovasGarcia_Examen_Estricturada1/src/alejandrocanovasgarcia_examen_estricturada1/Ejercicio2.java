/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandrocanovasgarcia_examen_estricturada1;

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
        Scanner s = new Scanner (System.in);
        int num = 0;
        double millas = 0;
        double km = 0;
        
        do {
            System.out.println("Conversor de medidas");
            System.out.println("====================");
            System.out.println("1. Millas a Kilometros");
            System.out.println("2. Kilometros a Millas");
            System.out.println("3. Salir");
            System.out.print("Indica una opción: ");
            num = Integer.parseInt(s.nextLine());
            System.out.println("-----------------");
            switch (num) {
                case 1:
                    System.out.print("¿Cuantas millas? ");
                    millas = Double.parseDouble(s.nextLine());
                    km = millas * 1.6093;
                    System.out.printf("\n-->%.0f millas son %.2f Kilometros\n\n",millas,km);
                    break;
                case 2:
                    System.out.print("¿Cuantos kilómetros? ");
                    km = Double.parseDouble(s.nextLine());
                    millas = km / 1.6093;
                    System.out.printf("\n-->%.0f km son %.2f millas\n\n",km,millas);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("");
                    System.out.println("*********ERROR*********");
                    System.out.println("Opción no valida");
                    System.out.println("");
                    break;
            }
        } while (num!=3);

    }
    
}
