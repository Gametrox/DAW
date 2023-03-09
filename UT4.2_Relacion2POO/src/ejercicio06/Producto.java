/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author ps4an
 */
public class Producto {
    private String ref;
    private String descripcion;
    private double precioUnitario;
    private int unidades;

    public Producto(String ref, String descripcion, double precioUnitario) {
        this.ref = ref;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
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

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s - [  %s]   %.2f€   %duni",
                this.ref,
                this.descripcion,
                this.precioUnitario,
                this.unidades
                );
        return cadena;
    }
    
}
