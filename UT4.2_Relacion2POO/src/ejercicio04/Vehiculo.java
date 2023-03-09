/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author ps4an
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private boolean alquilado;
    private double precio_dia;

    public Vehiculo(String marca, String modelo, String matricula, double precio_dia) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precio_dia = precio_dia;
        this.alquilado = false;
    }
    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precio_dia = 30;
        this.alquilado = false;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public double getPrecio_dia() {
        return precio_dia;
    }

    public void setPrecio_dia(double precio_dia) {
        this.precio_dia = precio_dia;
    }
    
    public String aCadena(){
        String cadena = "";
        
        if (isAlquilado()) cadena+=("\033[31mA");
        
        else cadena+=(" ");
        
        cadena+=("   "+this.matricula+" "+this.marca+" "+this.modelo+"\033[30m");
               
        return cadena;
    
    }
    public String aCadenaAlquiler(){
        String cadena = "";
        
        if (isAlquilado()) cadena+=("\033[31mA");
        
        else cadena+=(" ");
        
        cadena+=("   "+this.matricula+" "+this.marca+" "+this.modelo+" "+this.precio_dia+"€\033[30m");
               
        return cadena;
    
    }
    
    
}
