/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author ps4an
 */
public class LineaFactura {
    private Producto producto;
    private int cantidad;
    private double importeLinea;

    public LineaFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.importeLinea = cantidad * producto.getPrecioUnitario();   
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporteLinea() {
        return importeLinea;
    }

    public void setImporteLinea(double importeLinea) {
        this.importeLinea = importeLinea;
    }
    
    public void imprimirLinea(){
        String s = String.format("%-7s %-19s %-11d %-10.2f€ %-10.2f",
                this.producto.getRef(),
                this.producto.getDescripcion(),
                this.cantidad,
                this.producto.getPrecioUnitario(),
                this.importeLinea);
        System.out.println(s);
    }
    
    
    
    
}
