/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Contrasena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String cadena = "";
        
        System.out.println("Inidca la cadena con almenos 4 palabras: ");
        do{
            cadena = s.nextLine();
            if (totalPalabras(cadena)!=4) System.out.println("Cadena incorrecta, indícala de nuevo: ");
            else System.out.println("***Cadena correcta, generando contraseña***");
            
        }while(totalPalabras(cadena)!=4);
        System.out.println(generarContrasena(cadena));
    }
    public static int totalPalabras(String cadena){
            String auxiliar=cadena;
            int contador = 0;
            auxiliar = auxiliar.replace(","," ");
            auxiliar = auxiliar.replace("."," ");
        for (int i = 1; i < cadena.length(); i++) {
            if (auxiliar.charAt(i-1)==' ') contador++;
              }
        if (contador > 0 ) contador = contador+1;
        
        return contador;
    }
    public static String generarContrasena(String cadena){
        do{String aux = "";
            char pl;
            pl = cadena.charAt(0);
            aux = aux + pl;
            aux = aux.toUpperCase();

            for (int i = 1; i < cadena.length(); i++) {
                if (cadena.charAt(i-1)==' ') {
                    pl = cadena.charAt(i);
                    aux = aux + pl;
                }
            }
            aux = aux +"+";
            int digito = (int)(Math.random()*10);
            aux = aux + digito;

            return aux;
        }while(totalPalabras(cadena)!=4);
    }
}
    