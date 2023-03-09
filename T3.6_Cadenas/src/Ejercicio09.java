/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "el rock mola siempre";
        String cadena2 = "";
        String caracter;
        for (int i = 0; i < cadena.length(); i++) {
            
            if (cadena.charAt(i)=='o') {
                cadena2 = cadena2+'0';
            } else if (cadena.charAt(i)=='i'){
                cadena2 = cadena2+'1';
            } else {
                caracter=cadena.substring(i, i+1); //caracter en minuscula
                cadena2=cadena2+caracter.toUpperCase();
            } 
            
        }
        System.out.println(cadena2);
        
        
        
    }
    
}
