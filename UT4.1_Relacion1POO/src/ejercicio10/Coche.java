/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author ps4an
 */
public class Coche {
    private String marca;
    private String modelo;
    private Motor motor;
    private Rueda [] ruedas;

    public Coche(String marca, String modelo,int caballos ,
            TipoCombustible combustible, TipoCambio cambio, int radio) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(caballos,combustible,cambio);
        this.ruedas = new Rueda[5];
        for (int i = 1; i <= 4; i++) {
            this.ruedas[i] = new Rueda(radio);    
        }
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
    
    public void cambiarRueda(int num){
        if (num>=1 && num<=4) {
            this.ruedas[num].setKilometros(0);

        }else{
            System.out.println("Error, rueda incorrecta");
        }
        
    }
    public void recorrer(int km){
//        this.motor.setKilometros(this.motor.getKilometros()+km);
        for (int i = 1; i <= 4; i++) {
            this.ruedas[i].setKilometros(this.ruedas[i].getKilometros()+km);
        }
    }
    
    public void imprimirFicha(){
        System.out.println("");
        System.out.println("FICHA DEL COCHE");
        System.out.println("======================");
        System.out.println("Marca/Modelo: "+this.marca+" "+this.modelo);
        System.out.println("Motor(CV): "+this.motor.getCaballos());
        System.out.println("Combustible: "+this.motor.getCombustible());
        System.out.println("Cambio: "+this.motor.getCambio());
//        System.out.println("KM del motor: "+this.motor.getKilometros()+"km");
        System.out.println("Tamaño de las ruedas: "+this.ruedas[1].getRadio()+"\"");
        System.out.println("KM de las ruedas: ");
        for (int i = 1; i <= 4; i++) {
            System.out.print("["+this.ruedas[i].getKilometros()+"]");
        }
        System.out.println("\n======================");

    }

    
   
    
    
}
