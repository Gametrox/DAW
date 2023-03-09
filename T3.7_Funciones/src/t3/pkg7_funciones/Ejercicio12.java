/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg7_funciones;

/**
 *
 * @author ps4an
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] lista1 = {1,2,3};
        int [] lista2 = {10,20,30};    
        
        copiar(lista1,lista2);
        
        
        
    
    
    }
    public static int [] copiar(int []lista1, int [] lista2){
          for (int i = 0; i < lista1.length; i++) {
            lista2[i]=lista1[i];
            System.out.println(lista2[i]);
        }  
          return lista2;
    }
    
    
}
