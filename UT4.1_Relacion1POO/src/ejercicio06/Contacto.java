/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author ps4an
 */
public class Contacto {
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private static int contador = 0;

    public Contacto(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        contador++;
        this.id = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static int getContador() {
        return contador;
    }

    
    public void listarContactos(){
        System.out.printf("%d %12s %22s %12s\n",this.id,this.nombre,this.email,this.telefono);
        
    }
    
    
    
}
