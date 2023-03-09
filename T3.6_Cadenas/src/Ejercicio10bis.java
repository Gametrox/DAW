
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio10bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        Scanner s = new Scanner(System.in);

        String cadena = "La lluvia en sevilla es una maravilla";//3
        String buscar = "";
        
        int pos = 0;
        int contador = 0;
        boolean continuar=true;
        
        System.out.print("Indica la palabra a buscar: ");
        buscar = s.nextLine();
        buscar = buscar.toLowerCase();
        do {
            pos = cadena.indexOf(buscar);
                if (pos>=0) {
                    contador++;
                    cadena = cadena.substring(pos+buscar.length());
                } else {
                    continuar = false;
                }
            } while (continuar);
        System.out.println("Apariciones totales: "+contador);
        
        
    }
    
}
