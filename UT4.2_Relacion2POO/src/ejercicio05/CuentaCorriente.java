/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author ps4an
 */
public class CuentaCorriente {
    private static int contador = 1000;
    private int numero;
    private Persona titular;
    private double saldo;

    public CuentaCorriente(Persona titular,double saldo) {
        contador++;
        this.numero = contador;
        this.titular = titular;
        this.saldo = saldo;
        
    }

    public CuentaCorriente(Persona titular) {
        this.titular = titular;
        contador++;
        this.numero = contador;
        this.titular = titular;
        this.saldo = 0;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingreso(double cantidad){
        this.saldo += cantidad;
    }
    
    public boolean reintegro(double cantidad){
        if (this.saldo > cantidad){
            this.saldo -= cantidad;
            return true;
        }else {
            return false;
        }
    }
    
    public boolean transferencia(CuentaCorriente destino, double cantidad){
        if (this.saldo < cantidad) {
            return false;
        }else{
            this.saldo -= cantidad;
            destino.setSaldo(destino.getSaldo()+cantidad);
            return true;
        }
    }
    
    public String aCadena(){
        String cadena = String.format("%d      %.2f€", 
                this.numero,
                this.saldo
                );
        return cadena;
    }
    public String aCadenaDetallada(){
        String cadena = String.format("%d      %.2f€     >      %s %s %s", 
                this.numero,
                this.saldo,
                this.titular.getDni(),
                this.titular.getNombre(),
                this.titular.getApellido1(),
                this.titular.getApellido2()
                );
        return cadena;
    }
    
}
