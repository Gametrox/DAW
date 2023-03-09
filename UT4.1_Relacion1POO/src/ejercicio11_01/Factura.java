/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11_01;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ps4an
 */
public class Factura {
    private String cif;
    private LocalDate fechaFactura;
    private ArrayList<LineaFactura> lineas = new ArrayList();
    private final double IVA = 21;

    public Factura() {
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
    }
    
    private double getSubtotal(){
        double sub = 0;
        for (LineaFactura linea : lineas) {
           sub += linea.getImporteLinea();
        }
        return sub;
    }
    private double getIva(){
        double iva = 0;
            iva += (getSubtotal()*this.IVA)/100;
        
        return iva;
    }
    private double getTotal(){
        double total = 0;
        total += getSubtotal()+getIva();
        return total;
    }
    public void añadirLinea(String ref,String des,int cant,double preciou){
        LineaFactura nuva = new LineaFactura(ref,des,cant,preciou);
        lineas.add(nuva);
    }
    public void imprimirFactura(){
        System.out.println("=================================================");
        System.out.println("           FACTURA");
        System.out.println("CIF"+this.cif);
        System.out.println("Fecha: "+this.fechaFactura+"\n");
        System.out.println("CANT        DESCRIPCION     PRECIO U     IMPORTE");
        System.out.println("------------------------------------------------");
        for (LineaFactura linea : lineas) {
            linea.imprimirLinea();
            
        }
        System.out.println("------------------------------------------------");
        System.out.printf("SUBTOTAL: %.2f\n",getSubtotal());
        System.out.printf("IVA: %.2f\n",getIva());
        System.out.printf("Total: %.2f\n",getTotal());
        System.out.println("=================================================");
        
    }
}
