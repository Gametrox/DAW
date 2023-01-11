/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class dedos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int [] mano1 = {1,0,0,0,0};
        int [] mano2 = {1,0,0,0,0};
        
        mostrador(mano1, mano2);
        
    }
    public static int elegir_primero(int numero){
        Scanner s = new Scanner (System.in);
        String cara = "CARA";
        String cruz = "CRUZ";
        String eleccion1, eleccion2;
    
        numero = (int)(Math. random()*2+1);
        
        
        System.out.println("Elige JUGADOR 1 [CARA | CRUZ]");
        eleccion1 = s.nextLine();
        eleccion1 = eleccion1.toUpperCase();
        
        
        System.out.println("Elige JUGADOR 2 [CARA | CRUZ]");
        eleccion2 = s.nextLine();
        eleccion2 = eleccion2.toUpperCase();
        
        
        
        if (numero==1) System.out.println("\033[32mGANA CARA");
        else System.out.println("\033[32mGANA CRUZ");
        
        if (eleccion1.equals(cara) || eleccion1.equals(cruz)){
            System.out.println("Comienza el jugador 1");
        }
        if (eleccion2.equals(cara) || eleccion2.equals(cruz)){
            System.out.println("Comienza el jugador 2");
        }
        
        
        
        return numero;
    }

    public static int mostrador(int [] mano1, int [] mano2){
        System.out.println("***Jugador 1***");
        for (int i = 0; i < mano1.length; i++) {
        System.out.print(" "+mano1[i]+" ");
        }
        System.out.println("");
        System.out.println("***Jugador 2***");
        for (int i = 0; i < mano2.length; i++) {
        System.out.print(" "+mano2[i]+" ");
        }
        System.out.println("");
        return 0;
    }
//    public static int gameplay(int [] mano1, int [] mano2){
//        Scanner s = new Scanner (System.in);
//        System.out.println("Indica que quieres hacer");
//        int selector = Integer.parseInt(s.nextLine());
//        int acumulador = 0;
//        
//        if (selector == 1) {
//            for (int i = 0; i < mano1.length; i++) {
//                acumulador = acumulador + mano1[i];
//                mano2[i] = acumulador;
//            }
//        }
//   
//    }
}
