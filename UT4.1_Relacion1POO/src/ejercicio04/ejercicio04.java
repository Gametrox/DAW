/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Scanner;
import Utilidades.*;
/**
 *
 * @author ps4an
 */
public class ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        Persona[]personas = new Persona[10];
        String nombre,email = "";
        for (int i = 0; i < 3; i++) {
            System.out.print("Indica el nombre: ");
            nombre = s.nextLine();
               
            do{
                System.out.print("Indica el email: ");
                email = s.nextLine();
            }while(!Utilidades.checkEmail(email));
                    
            Persona p = new Persona(nombre,email);
            personas[i] = p;
            System.out.println("-----------Añadida ["+Persona.getContador()+"] en la lista");
        }
        System.out.println("\n");
        System.out.println("=================================");
        System.out.println("Se han añadido un total de ["+Persona.getContador()+"] personas");
        for (int i = 0; i < Persona.getContador(); i++) {
            personas[i].mostrarDatos();
        }
        System.out.println("=================================");


    }
    
}
