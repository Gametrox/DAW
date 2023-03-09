
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

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
        String boton = "";
        
        String seguir = "";
        char sg = ' ';
        System.out.println("Recogiendo un char por teclado");
        System.out.println("------------------------------");
        //Char
        do{
        System.out.print("¿Quieres continuar? [S|N]: ");
            seguir = s.nextLine();
            sg = seguir.charAt(0);
            if (sg=='s') {
               sg = Character.toUpperCase(sg);
            }
        }while(sg=='S');
        // STRING
//        do{
//            System.out.print("¿Quieres continuar? [S|N]: ");
//            boton = s.nextLine();
//            if (boton.equals("s")) {
//                boton = boton.toUpperCase();
//            }
//        }while(boton.equals("S"));
        
        
    }
    
}
