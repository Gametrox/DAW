/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author ps4an
 */
public class LineaFactura {
    private String refProducto = "REF000";
    private String descripcion = "";
    private int cantidad = 0;
    private double precioUnitario = 0;
    private double importeLinea = this.precioUnitario*this.cantidad;

    public LineaFactura(String refProducto, String descripcion, int cantidad, double precioUnitario) {
        this.refProducto = refProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.importeLinea = this.precioUnitario*this.cantidad;
    }
    
    public String getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(String refProducto) {
        this.refProducto = refProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getImporteLinea() {
        return importeLinea;
    }

    public void setImporteLinea(double importeLinea) {
        
        this.importeLinea = importeLinea;
    }
    
    
    
    public void imprimirLinea(){
        System.out.printf("%4d     %-14s %.2f€        %5.2f€\n",
                this.cantidad,this.descripcion,this.precioUnitario,this.importeLinea);
    }
    
}
