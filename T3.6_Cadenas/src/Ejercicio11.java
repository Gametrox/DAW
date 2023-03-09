/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "La LLUVIA EN SEVILLA ES UNA MARAVILLA";
        char mayusc, resto;
        String total = "";
        
        cadena = cadena.toLowerCase();
        
        String primeraLetra = ""+cadena.charAt(0);
        primeraLetra = primeraLetra.toUpperCase();
        
        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i-1)==' ') {
                mayusc = cadena.charAt(i);
                resto = Character.toUpperCase(mayusc);
                total = total + resto;
            } else {
                resto = cadena.charAt(i);
                total = total+resto;
            }
        }System.out.println(primeraLetra+total);


    }
    
}
