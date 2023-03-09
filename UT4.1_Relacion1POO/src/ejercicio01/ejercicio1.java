/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author ps4an
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta miBici = new Bicicleta("Alex");
        Bicicleta tuBici = new Bicicleta("Bruh");
        
        miBici.pedalear();
        miBici.pedalear();
        miBici.cambiarPiñon(2);
        
        tuBici.pedalear();
        tuBici.pedalear();
        tuBici.pedalear();
        tuBici.cambiarPiñon(6);
        tuBici.pedalear();
        tuBici.pedalear();
        tuBici.pedalear();
        tuBici.cambiarPiñon(5);
        
        
        tuBici.mostrarVelocidad();
        miBici.mostrarVelocidad();
        
        
        
    }
    
}
