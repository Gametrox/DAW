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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int nPar1,nPar2,nPar3;
        int nEx;
        int nTfin;
        
        System.out.print("Introduce la nota del Parcial 1: ");
        nPar1 = s.nextInt();
        System.out.print("Ahora la nota del Parcial 2: ");
        nPar2 = s.nextInt();
        System.out.print("Y la nota del Parcial 3: ");
        nPar3 = s.nextInt();
        
        System.out.println("--------------------------");
        System.out.print("Ahora indica la nota del examen final: ");
        nEx = s.nextInt();
        
        System.out.println("--------------------------");
        System.out.print("Por ultimo, introduce la nota del trabajo: ");
        nTfin = s.nextInt();
        
        int mediaPar = (nPar1+nPar2+nPar3)/3;
        double FmediaPar = (mediaPar*0.55)+(nEx*0.30)+(nTfin*0.15);
        
        System.out.println("--------------------------");
        System.out.printf("La nota en algoritmos es de: %.2f",FmediaPar);
        
        
    }
    
}
