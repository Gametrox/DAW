/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

/**
 *
 * @author ps4an
 */
public class Ejercicio07bis {

    public static void main(String[] args) {
        String linea="alicia;peralta;manduca;alicia.peralta@gmail.com;600554433";
        String [] separador = linea.split(";");
        
        String aliasmail,tlf,nomcomp;
        nomcomp=separador[0]+separador[1]+separador[2];
        tlf=separador[4];
        System.out.println("El nombre completo es: "+nomcomp);

        
        String [] alias = separador[3].split("@");
        aliasmail=alias[0];
        System.out.println("El alias es: "+aliasmail);
        System.out.println("El teléfono es: "+tlf);
        
        
    }
    
}
