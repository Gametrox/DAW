/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author ps4an
 */
public class Autor {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;

    public Autor(String nombre, String apellido1, String apellido2, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
    }
    public Autor(){
    
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
    
    public String getNombreCita(){
        String cita = "";
        
        char ini1 = this.nombre.charAt(0);
        
        char ini2 = ' ';
        
        for (int i = 1; i < this.nombre.length(); i++) {
            if (this.nombre.charAt(i-1)==' ') {
                ini2 = this.nombre.charAt(i);
                
            }
        }        
        if (ini2==' ') {
            cita = this.apellido1+", "+Character.toUpperCase(ini1)+".";
        }else{
            cita = this.apellido1+", "+Character.toUpperCase(ini1)+
                    "."+Character.toUpperCase(ini2)+".";
        }
        return cita;
    }
}
