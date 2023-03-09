/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author ps4an
 */
public class ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cubo cubito = new Cubo(5);
        cubito.pintarCubo();
        System.out.println("");
         
        cubito.llenarCubo(4);
        cubito.pintarCubo();
        System.out.println("");
        
        cubito.rellenarCubo(2);
        System.out.println("");
        
        cubito.pintarCubo();
        System.out.println("");
        
        cubito.vaciarCubo();
        System.out.println("");
        cubito.pintarCubo();
        
        
    }
    
}
