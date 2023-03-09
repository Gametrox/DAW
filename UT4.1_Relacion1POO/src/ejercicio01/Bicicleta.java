/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author ps4an
 */
public class Bicicleta {
    private String propietario;
    private double revoluciones;
    private int piñonActual;
    
    public Bicicleta(){
        this.piñonActual = 3;
        this.revoluciones = 0;
    }

    public Bicicleta(String propietario) {
        this.propietario = propietario;
    }
    

    public double getRevoluciones() {
        return revoluciones;
    }

    public void setRevoluciones(int revoluciones) {
        this.revoluciones = revoluciones;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    
    
    public double pedalear(){
        if (this.revoluciones==0) {
            this.revoluciones = 1;
            
        } else {
            this.revoluciones = this.revoluciones*2;
        }
        
        return this.revoluciones;

    }
    public double frenar(){
        if (this.revoluciones==0) {
            this.revoluciones=1;
        }else{
            this.revoluciones = this.revoluciones/2;
        }
        return this.revoluciones;
    }
    public void cambiarPiñon(int piñon){
        if (piñon < 6 && piñon > 0) {
            this.piñonActual=piñon;
        } else {
            System.out.println("PIÑON ERRONEO");
        }
    }
    
    public double obtenerVelocidad(){
        double velocidad = 0;
        switch (piñonActual) {
            case 1:
                 velocidad=this.revoluciones*2;
                 return velocidad;
            case 2:
                velocidad=this.revoluciones*1.5;
                return velocidad;
            case 3:
                velocidad=this.revoluciones*1;
                return velocidad;
            case 4:
                velocidad=this.revoluciones*0.5;
                return velocidad;
            case 5:
                velocidad = this.revoluciones*0.3;
                return velocidad;
            default:

                return velocidad;

            }
    }
    public void mostrarVelocidad(){
        obtenerVelocidad();
        System.out.println("Velocidad de ["+this.propietario+"] -> "+obtenerVelocidad());
    }
}


