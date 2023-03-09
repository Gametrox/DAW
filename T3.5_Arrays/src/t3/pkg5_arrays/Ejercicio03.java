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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] notas = new int [5];
        int num = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Indica la nota nº"+(i+1));
            num = Integer.parseInt(s.nextLine());
            if (num>=0 && num<=10) {
                notas[i]=num;
            }else {
                System.out.println("Error, nota fuera de rango");
                i--;
            }
        }
        int max = notas[0];
        int min = notas[0];
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>max) {
                max = notas[i];
            }
            if (notas[i]<min) {
                min = notas[i];
            }
            suma = notas[i]+suma;
        }
       int media = suma / notas.length;
        System.out.println("Las notas son: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]+" ");
        }System.out.println("");
        System.out.println("La nota mínima es: "+min);
        System.out.println("La nota maxima es: "+max);
        System.out.println("La nota media es: "+media);
    }
    
}
