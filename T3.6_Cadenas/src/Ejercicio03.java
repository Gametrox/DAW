/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author ps4an
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "hombres y mujeres tenemos los mismos derechos";
        boolean existe = false;
       //Metodo INDEX OF
        if (cadena.indexOf("mujeres")==-1) {
            System.out.println("No está");
        } else {
            System.out.println("Si está");
        }
       

        //Metodo contains
        if (cadena.contains("mujeres")) {
            System.out.println("Si está");
        } else {
            System.out.println("No está");
        }

        
        
    }
    
}
