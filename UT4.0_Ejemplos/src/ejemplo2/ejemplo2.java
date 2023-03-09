/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author ps4an
 */
public class ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona ("Alicia",23);
        Persona p3 = new Persona ("Celia",30);
        Persona p2 = new Persona ("Fran",31);

        System.out.println("Se han creado: "+Persona.getContadorPersonas()+" personas");
    }
    
}
