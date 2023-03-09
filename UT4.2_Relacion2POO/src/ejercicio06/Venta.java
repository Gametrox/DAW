/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

import java.util.ArrayList;

/**
 *
 * @author ps4an
 */
public class Venta {
    private static int contador = 0;
    private int numero;
    private ArrayList <LineaVenta> lineas = new ArrayList();
    private int IVA = 21;
    private double importeTotal;

    public Venta() {
        contador++;
        this.numero = contador;
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<LineaVenta> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaVenta> lineas) {
        this.lineas = lineas;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    
    public void addLinea(Producto p, int cantidad){
        LineaVenta l = new LineaVenta(p,cantidad);
        lineas.add(l);
    }
    public void imprimirVenta(){
        System.out.println("======================================================");
        System.out.println("    VENTA NUMERO: "+this.numero+"\n");
        System.out.println("CANT        DESCRIPCION      PRECIO U       IMPORTE");
        for (LineaVenta linea : lineas) {
            linea.imprimirLinea();
        }
        System.out.println("======================================================");
        System.out.println(" - Pulse INTRO para continuar - ");

        
    }
    
    @Override
    public String toString(){
        String cadena = String.format("", args)
    
    }
    
}
