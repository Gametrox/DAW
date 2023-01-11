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
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner s = new Scanner(System.in);
        int [] lista = new int [5];
        int num=0;
        int max=0;
        int min=0;
        int sumatotal=0;
            num=Integer.parseInt(s.nextLine());
            max = num;
            min = num;
            for (int i = 0; i < lista.length; i++) {
                lista[i]=num;
            }
            

                      
            
         
        
        System.out.println(sumatotal(sumatotal,lista));
            System.out.println(maximo(max,lista));
            System.out.println(minimo(min,lista));
    }
    public static int maximo(int max, int []lista){
        max = lista[0];
        for (int i = 0; i < lista.length; i++) {
                if (lista[i]>max) max = lista[i];
         }
         return max;
    }
    public static int minimo(int min, int []lista){
        min = lista[0];
         for (int i = 0; i < lista.length; i++) {
                if (lista[i]<min) min = lista[i];
         }
         return min;
    }
    public static int sumatotal(int suma,int []lista){
        for (int i = 0; i < lista.length; i++) {
            suma = suma + lista[i];
        
        }
        return suma;
    }
      

    
}
