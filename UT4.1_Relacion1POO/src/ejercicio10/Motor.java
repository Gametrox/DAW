/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author ps4an
 */

enum TipoCambio{
    MANUAL,AUTOMATICO
}
enum TipoCombustible{
    GASOLINA,DIESEL
}


public class Motor {
    private int caballos;
    private TipoCombustible combustible;
    private TipoCambio cambio;
    private int kilometros;

    public Motor(int caballos, TipoCombustible combustible, TipoCambio cambio) {
        this.caballos = caballos;
        this.combustible = combustible;
        this.cambio = cambio;
        this.kilometros = 0;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    public TipoCambio getCambio() {
        return cambio;
    }

    public void setCambio(TipoCambio cambio) {
        this.cambio = cambio;
    }
    
    

    
    
}
