/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author ps4an
 */
public class Casa {
    private String propietario;
    private int superficiePlanta1;
    private int superficiePlanta2;
    private double precioVenta;
    private static int contadorCasas = 0;
//CON ***2*** PLANTAS
    public Casa(String propietario, int superficiePlanta1, int superficiePlanta2, double precioVenta) {
        this.propietario = propietario;
        this.superficiePlanta1 = superficiePlanta1;
        this.superficiePlanta2 = superficiePlanta2;
        this.precioVenta = precioVenta;
        Casa.contadorCasas++;
    }

    public static int getContadorCasas() {
        return contadorCasas;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getSuperficiePlanta1() {
        return superficiePlanta1;
    }

    public void setSuperficiePlanta1(int superficiePlanta1) {
        this.superficiePlanta1 = superficiePlanta1;
    }

    public int getSuperficiePlanta2() {
        return superficiePlanta2;
    }

    public void setSuperficiePlanta2(int superficiePlanta2) {
        this.superficiePlanta2 = superficiePlanta2;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    
    
    public void imprimirDatos(){
        System.out.printf("  %7s  %7d m2  %7.0f€\n",
        this.propietario,this.calcularSuperficieTotal(this.superficiePlanta1,this.superficiePlanta2),
        this.precioVenta);
        
    }
    private int calcularSuperficieTotal(int superficiePlanta1,int superficiePlanta2){
        int total = superficiePlanta1 + superficiePlanta2;
        return total;
    }    
    
}
    
    
    

