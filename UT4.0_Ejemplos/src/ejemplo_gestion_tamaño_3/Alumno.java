/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_gestion_tamaño_3;

/**
 *
 * @author ps4an
 */
public class Alumno {
    private int id;
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.id=(int)(Math.random()*1000);
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }


    
    
    public void imprimirDetalles(){
        System.out.printf("ID: %d \nNombre: %s \nEdad: 3d\n",this.id,this.nombre,this.edad);
        
    }
    public String toCadena(){
        String cadena = String.format("ID:[%d] - %4s",this.id,this.nombre);
        return cadena;
        
    }
}
