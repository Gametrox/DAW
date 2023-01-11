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
public class palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] lista = {{"Nuria","Juan","Pedro","Alejandro","Teruel"},
            {"28","55","43","12","20"}};
        
        for (int i = 0; i < lista.length; i++) {
            int [] numl = new int[lista[i].length]; 
                numl[i] = Integer.parseInt(lista[1][i]);
            
            System.out.print(numl[i] + " ");
            System.out.println(i);
            System.out.print(" ");
        }
        
    }
   
    
}
