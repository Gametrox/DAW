package ejercicio11_01;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class ejercicio11_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura f1 = new Factura();
        f1.añadirLinea("REE","Pan",2,0.80);
        f1.añadirLinea("REE","Leche",1,1.5);
        f1.añadirLinea("REE","Cerveza",10,1);
        f1.imprimirFactura();
    }
    
}
