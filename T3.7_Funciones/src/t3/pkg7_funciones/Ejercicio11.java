/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg7_funciones;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
public static void main (String[] args){
//Declaramos un array y lo rellenamos usando una función
//que devuelve un array
    int[] numerosPorValor;
    numerosPorValor=rellenarArray(5);
    imprimirArray(numerosPorValor);
    int numerosPorRef[]=new int[5];
    rellenarArray(numerosPorRef);
    imprimirArray(numerosPorRef);
     
}

public static int[] rellenarArray(int size){
    Scanner s = new Scanner (System.in);
    int vector []= new int[size];
  
    for (int i = 0; i < vector.length; i++) {
        vector[i]=Integer.parseInt(s.nextLine());
    }
    return vector;
}
public static void rellenarArray(int vector[]){
    Scanner entrada=new Scanner(System.in);
               
    for (int i = 0; i < vector.length; i++) {
        System.out.print("vector["+i+"]:");
        vector[i]=Integer.parseInt(entrada.nextLine());
    }
}
public static void imprimirArray (int vector[]){
    System.out.print("Array--> ");
    for (int i = 0; i < vector.length; i++) {
        System.out.print(" "+vector[i]);
    }
        System.out.println("");
  }
}