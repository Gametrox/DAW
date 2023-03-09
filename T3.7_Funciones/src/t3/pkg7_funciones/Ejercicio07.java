/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg7_funciones;

/**
 *
 * @author ps4an
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] lista1 = {1,2,3};
        int [] lista2 = {3,2,1};
        int [] listaAux = fusionarVectores(lista1,lista2);
        
        if (compararVectores(lista1,lista2)==true) System.out.println("\033[32mSí son iguales");
        else System.out.println("\033[31mNo son iguales");
        System.out.println("-----------------------");
        System.out.println("El array fusionado es: ");
        for (int i = 0; i < listaAux.length; i++) {
            System.out.print(listaAux[i] + " ");
        }
        System.out.println();
    }
    
    public static boolean compararVectores (int [] lista1, int [] lista2){
        if (lista1.length != lista2.length) {
            return false;
        } else {
            for (int i = 0; i < lista1.length; i++) {
                if (lista1[i]!=lista2[i]) return false;
                
            }
            return true;
        }
    }
    
    public static int [] fusionarVectores (int [] lista1, int [] lista2){
        int pos = 0;
        int [] listaAux = new int[lista1.length + lista2.length];
        
        for (int i = 0; i < lista1.length; i++) {
            listaAux[i] = lista1[i];
            pos++;
        }
        for (int i = 0; i < lista2.length; i++) {
            listaAux[pos] = lista2[i];
            pos++;
        }
        return listaAux;
        
        
 
        
        
    }

    
    
}
