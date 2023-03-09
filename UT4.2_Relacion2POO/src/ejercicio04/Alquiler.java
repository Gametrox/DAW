/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author ps4an
 */
public class Alquiler {
    private static int contador = 0;
    private int id;
    private Cliente cliente;
    private Vehiculo vehiculo;    
    private DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private double importe;
    private double IVA = 21;


    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaAlquiler) {
        contador += 1;
        this.id = contador;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.vehiculo.setAlquilado(true);
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = null;
        
        
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }
    
    public void devolverVehiculo(LocalDate f){
        this.vehiculo.setAlquilado(false);
        this.fechaDevolucion = f;
        this.importe = calcularImporte();
    }
    
    private double calcularImporte(){
        int dias = (int)ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        if (dias == 0) dias = 1;
        
        double total = dias * this.vehiculo.getPrecio_dia();
        double subtotal = total * this.IVA / 100;
        
        return IVA + subtotal;
    }
    
    public String aCadena(){
        String cadena = String.format("%d - %s alquiló [%s %s] el dia %s", 
                this.id,
                this.cliente.getNombre(),
                this.vehiculo.getMarca(),
                this.vehiculo.getModelo(),
                this.fechaAlquiler.format(dft)
                );
        
        return cadena;
    }
    
    public void imprimirDetalles(){
        System.out.println("-*-VEHICULO ["+this.vehiculo.getMarca()+" "+this.vehiculo.getModelo()+"]-*-");
        System.out.println("ID: "+this.id);
        System.out.println("MARCA: "+this.vehiculo.getMarca());
        System.out.println("MODELO: "+this.vehiculo.getModelo());
        System.out.print("ESTADO: ");
            if (this.vehiculo.isAlquilado()){
                System.out.println("\033[31mEstá alquilado desde el día: "+this.fechaAlquiler.format(dft)+"\033[30m");
            } else {
                System.out.println("\033[32mDisponible\033[30m");
                System.out.println("Devuelto el día "+this.fechaDevolucion.format(dft));
            }
        System.out.print("CLIENTE: ");
            if (this.cliente!=null) System.out.println(this.cliente.getNombre());
            else System.out.println("Ninguno");
        System.out.println("COSTE TOTAL: "+this.importe);
    }
    
    
    
}
