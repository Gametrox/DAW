/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author ps4an
 */
public class Cliente {
    private static int contador = 1000;
    private int id;
    private String nombre;
    private String email;
    private String direccion;

    public Cliente(String nombre, String email, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        contador += 1;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String aCadena(){
        String cadena = String.format("%d - %s - %s - %s",
                this.id,
                this.nombre,
                this.email,
                this.direccion
        );
        return cadena;
    }
    
    
    
}
