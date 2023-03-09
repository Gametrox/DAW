/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author ps4an
 */
public class Factura {
    private String cif;
    private LocalDate fechaFactura=LocalDate.now();
    private ArrayList <LineaFactura> lineas = new ArrayList();
    private final double IVA = 21;

    public Factura(String cif) {
        this.cif = cif;
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

       
    
    
    public void añadirLinea(String ref, String des, int cant, double precio){ 
        LineaFactura añadir = new LineaFactura(ref,des,cant,precio);
        
        lineas.add(añadir);
        
        System.out.println("Producto añadido.");
    }   
    
    private double getSubtotal(){
        double subtotal = 0;
        for (LineaFactura linea : lineas) {
            subtotal = subtotal+ linea.getImporteLinea();
        }
        return subtotal;
    }
    private double getIVA(){
        double precioIva = (getSubtotal() * IVA)/100;
        return precioIva;
    }
    private double getTotal(){
        double total = getSubtotal() + getIVA();
        return total;
    }
    
    
    public void imprimirFactura(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaHoy = fechaFactura.format(dtf);

        System.out.println("===========================================");
        System.out.println("                 Factura");
        System.out.println("CIF: "+this.cif);
        System.out.println("Fecha: "+fechaHoy);
        System.out.println("");
        System.out.println("CANT     DESCRIPCION    PRECIO U    IMPORTE");
        System.out.println("-------------------------------------------");
        for (LineaFactura linea : lineas) {
           linea.imprimirLinea();
        }
        System.out.println("-------------------------------------------");
        System.out.printf("                           Subtotal: %.2f€\n",this.getSubtotal());
        System.out.printf("                           IVA %.0f: %.2f€\n",this.IVA,getIVA());
        System.out.printf("                           TOTAL: %.2f€\n",this.getTotal());
        System.out.println("===========================================");

        
    }
    
}
