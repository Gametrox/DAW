/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo0;

/**
 *
 * @author ps4an
 */
public class Ejemplo0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona yo = new Persona();
        
        
        persona1.setNombre("Alicia");
        persona1.setEdad(44);
        persona1.setDni("12345678A");
        
        System.out.println("Objeto persona1: ");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("DNI: "+ persona1.getDni());
        
        System.out.println("====================");
        
        yo.setNombre("Alejandro");
        yo.setEdad(21);
        yo.setDni("58427114F");
        
        System.out.println("Objeto PROPIO");
        System.out.println("Nombre: " + yo.getNombre());
        System.out.println("Edad: " + yo.getEdad());
        System.out.println("DNI: "+ yo.getDni());
        
        
    }
    
}
