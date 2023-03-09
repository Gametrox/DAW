/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "uno Dos tres tres dOs uno uno dos tres";
        String cadrepe = "dos";
        int contador = 0;
        
        cadena = cadena.toLowerCase();
                    
        cadena = cadena.replace(',', ' ');
        cadena = cadena.replace('.', ' ');
        String [] separ = cadena.split(" ");
        
        
        for (int i = 0; i < separ.length; i++) {
            if (separ[i].equals(cadrepe)) {
                contador++;
            }
           
        }
        System.out.printf("La palabra [%s] se repite [%d] veces\n",cadrepe,contador);
    }
    
}
