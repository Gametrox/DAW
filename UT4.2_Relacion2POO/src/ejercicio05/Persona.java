/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author ps4an
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;

    public Persona(String dni, String nombre, String apellido1, String apellido2, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String aCadena(){
        String cadena = String.format("%s - %s. %s - %s",
                this.dni,
                this.nombre,
                this.apellido1,
                this.email
        );
        return cadena;
        
    }
    public void pintarDetalles(){
        System.out.println("DETALLES DE ["+this.nombre + " " + this.apellido1+"]");
        System.out.println("DNI:       "+this.dni);
        System.out.println("NOMBRE:    "+this.nombre);
        System.out.println("APELLIDOS: "+this.apellido1+" "+this.apellido2);
        System.out.println("CORREO:    "+this.email);
        System.out.println("--------------------------------------------------------");
    }
    
}