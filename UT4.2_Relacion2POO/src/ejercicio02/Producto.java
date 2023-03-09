/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author ps4an
 */
public class Producto {
    private String ref;
    private String descripcion;
    private double precioUnitario;
    private static int contador = 0;

    public Producto(String descripcion, double precioUnitario) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        
        this.contador += 1;
        this.ref = "REF"+contador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
    
    public String aCadena(){
        String cadena = String.format("%s - %s - %.2f",
                this.ref,
                this.descripcion,
                this.precioUnitario);
        return cadena;
    }
}
