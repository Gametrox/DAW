/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandrocanovasgarcia_exa_estructurada2;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio4_FuncionDeOrdenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner s = new Scanner (System.in);

        int a[] = {5,2,3,9,7};
        System.out.println("Ejercicio 4 - Ordenación");
        System.out.println("========================");
        System.out.println("Indica el orden: ");
        System.out.println("1)Ascendente");
        System.out.println("2)Descendente");
        System.out.println("3)Desordenado");
        int num = Integer.parseInt(s.nextLine());
        if (num==1) {
                System.out.print("Orden ascendente: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(" "+ordenarArray(a)[i]+" ");
            }System.out.println("");
        
        }else if (num==2){
            System.out.print("Orden decreciente: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(" "+ordenarArrayMenor(a)[i]+" ");
            }System.out.println("");
        }else if (num==3){
            System.out.print("Array sin ordenar: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(" "+a[i]+" ");
            }System.out.println("");
        }
        
        
        
       
        
        
        
    }
    public static int [] ordenarArray(int []a){
        for (int x = 0; x < a.length; x++) {
            for (int i = 0; i < a.length-x-1; i++) {
                if (a[i] > a[i+1]) {
                    int tmp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = tmp;
                }
            }
        }
        return a;
    }
    public static void ordenarArrayMenor(int []a){
        for (int x = 0; x < a.length; x++) {
            for (int i = 0; i < a.length-x-1; i++) {
                if (a[i] < a[i+1]) {
                    int tmp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = tmp;
                }
            }
        }
    }
}
