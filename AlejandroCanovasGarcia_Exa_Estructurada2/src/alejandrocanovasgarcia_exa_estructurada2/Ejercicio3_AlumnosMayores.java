/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandrocanovasgarcia_exa_estructurada2;

/**
 *
 * @author ps4an
 */
public class Ejercicio3_AlumnosMayores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] cadena = {{"Pepe","Juan","Marta","Alicia","Leo"},
                              {"30","35","35","20","18"}};
        int [] edades = new int [5];
        int edadmax = Integer.parseInt(cadena[1][0]);
        for (int i = 0; i < 5; i++) {
            edadmax = Integer.parseInt(cadena[1][i]);
            edades[i] = edades[i]+edadmax;
        }
        for (int i = 0; i < 5; i++) {
            if (edades[i]>edadmax) {
                edadmax = edades[i];
                
            }
        }
        
                

    }
    
}
