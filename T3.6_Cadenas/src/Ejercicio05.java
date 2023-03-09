/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author ps4an
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "   hola don Pepito ";
        int posCom = -1;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i,i+1).equals(" ")) {
                posCom = cadena.charAt(i);
            }
        }System.out.println(cadena.substring(posCom));
            
        
        
    }
    
}
