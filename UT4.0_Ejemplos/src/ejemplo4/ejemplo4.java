/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo4;

import java.util.ArrayList;
/**
 *
 * @author ps4an
 */
public class ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        
        nombres.add("Jose");
        nombres.add("Alex");
        nombres.add("Simon");
                
        System.out.println("IMPRIMIR ARRAY DE MANERA RARA");
        System.out.println(nombres);
        System.out.println("");
        
        System.out.println("IMPRIMIR ARRAY MANERA CLASICA CON SIZE");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.print(nombres.get(i)+" ");
        }System.out.println("\n");
        
        System.out.println("RECORRE CON FOREACH");
        for(String nombre : nombres){
            System.out.print(nombre+" ");
        }System.out.println("");

        
        ArrayList <Integer> numeros = new ArrayList();
        numeros.add(12);
        numeros.add(15);
        numeros.add(18);
        numeros.add(18);
        
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }System.out.println("\n");
        
        numeros.remove(3);
        
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }System.out.println("\n");
    }
    
}
