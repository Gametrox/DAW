/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author ps4an
 */
public class Factura {
    private String cif;
    private String numero;
    private String fechaFactura;
    private ArrayList<LineaFactura>lineas = new ArrayList();
    private final int IVA=21;

    public Factura(String cif, String numero) {
        this.cif = cif;
        this.numero = numero;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
    }
    
    public void añadirLinea(Producto p, int cantidad){
        LineaFactura fn = new LineaFactura(p,cantidad);
        lineas.add(fn);
    }
    
    private double getSubtotal(){
        double subtotal = 0;
        for (LineaFactura linea : lineas) {
            subtotal += linea.getImporteLinea();
        }
        return subtotal;
    }
    private double getImporteIva(){
        double precioiva = 0;
        for (LineaFactura linea : lineas) {
            precioiva += linea.getImporteLinea();
        }
        precioiva = precioiva / IVA;
        return precioiva;
    }
    private double getTotal(){
        double total = 0;
        total = getSubtotal()+getImporteIva();
        return total;
    }
    
    public void imprimirFactura(){
        System.out.println("            FACTURA         ");
        System.out.println("***********************************************************");
        System.out.println("CIF: "+this.cif);
        System.out.println("Fecha: "+this.fechaFactura);
        System.out.println("REF     DESCRIPCION       CANT        PRECIOU    IMPORTE");
        System.out.println("----------------------------------------------------------");
        for (LineaFactura linea : lineas) {
            linea.imprimirLinea();
        }
        System.out.println("----------------------------------------------------------");
        System.out.printf("                              Subtotal: %.2f\n",getSubtotal());
        System.out.printf("                           Importe IVA: %.2f\n",getImporteIva());
        System.out.printf("                          PRECIO TOTAL: %.2f\n",getTotal());
        System.out.println("***********************************************************");
        System.out.println("\n");
    }
    
}
