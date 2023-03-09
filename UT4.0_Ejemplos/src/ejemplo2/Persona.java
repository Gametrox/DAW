/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author ps4an
 */
public class Persona {
    private String nombre;
    private int edad;
    private static int contadorPersonas = 0;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
        Persona.contadorPersonas++;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }

    
}
