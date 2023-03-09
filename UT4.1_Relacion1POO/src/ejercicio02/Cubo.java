/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author ps4an
 */
public class Cubo {
    private final int capacidadMax;
    private int contenido;

    public int getCapacidadMax() {
        return capacidadMax;
    }


    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
    
    

    public Cubo(int capacidadMax) {
       this.capacidadMax = capacidadMax;
    }
    

    public void llenarCubo(int litros){
        if (this.contenido<=this.capacidadMax) {
            this.contenido=litros;
        } else{
             System.out.println("IMPOSIBLE LLENAR. SE DESBORDA");   
        }
    }
    public void vaciarCubo(){
        this.contenido=0;
    }
    public void rellenarCubo(int litros){
        int resto = this.capacidadMax-this.contenido;
        if (resto<=this.capacidadMax) {
            this.contenido=this.contenido+litros;
        } else {
             System.out.println("IMPOSIBLE LLENAR. SE DESBORDA");   
        }
    }
    public void pintarCubo(){
        int resto = this.capacidadMax-this.contenido;
        if (resto<=this.capacidadMax) {
            for (int i = 0; i < resto; i++) {
                System.out.print("#        #");
                System.out.println("");
            } 
        } 
        if (this.contenido<=this.capacidadMax) {
            for (int i = 0; i < this.contenido; i++) {
                System.out.print("#~~~~~~~~#");
                System.out.println("");
            }System.out.println("##########");
        } else {
             System.out.println("IMPOSIBLE LLENAR. SE DESBORDA");   
        }
    }
    
}
