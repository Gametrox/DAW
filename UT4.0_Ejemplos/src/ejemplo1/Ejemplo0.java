/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;

import ejemplo0.*;
import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejemplo0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //METODO PRECISO
        Persona persona1 = new Persona();       
            persona1.setNombre("Alicia");
            persona1.setEdad(44);
            persona1.setDni("12345678A");
            persona1.setAltura(1.70);
            persona1.setPeso(70);
            
        //METODO CORTO
        Persona persona2 = new Persona("Maria",34,"4353627F",1.73,86);
        
        System.out.println("========1=======");
        
        System.out.println("Objeto persona1: ");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("DNI: "+ persona1.getDni());
        System.out.println("Peso: "+ persona1.getAltura());
        System.out.println("Peso: "+ persona1.getPeso());
        System.out.println("IMC: "+ persona1.getImc());
        
        System.out.println("=======2======");
        
        persona2.imprimirDatos();
        
        System.out.println("====================");
    }
    
}
