/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author ps4an
 */
public class Persona {
    private String nombre;
    private String email;
    private static int contador = 0;

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Persona.contador = contador;
    }
    
    
    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        Persona.contador++;
    }
    
    public void mostrarDatos(){
        
        System.out.println(this.nombre+ " - "+ this.email);

    }
}
