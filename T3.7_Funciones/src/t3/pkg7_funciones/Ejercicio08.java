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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String mostrar = "";
        int selMenu = 0;
        int suma = 0;
        int max = 0;
        int min = 0;
        int [] lista = new int[5];
        int [] listaAux = new int[5];
        
        do{
            System.out.println("  MANEJADOR DE ARRAYS");
            System.out.println("=====================");
            System.out.print("ARRAY-> ");
            
            //SELECCIONADOR MENU***************
            switch (selMenu) {
                case 1:
                    for (int i = 0; i < lista.length; i++) {
                        System.out.print("|" +(listaAux[i]=aleatorio(lista)[i]));
                    }
                    break;
                case 2:
                    for (int i = 0; i < lista.length; i++) {
                        System.out.print("|" +listaAux[i]);
                    }
                    System.out.print("\nEl numero máximo es: "+numMax(max, listaAux));
                    System.out.print("\nEl numero mínimo es: "+numMin(min, listaAux));
                    
                    break;
                case 3:
                    for (int i = 0; i < lista.length; i++) {
                        System.out.print("|" +listaAux[i]);
                    }
                    System.out.print("\nLa suma es: "+sumatorio(suma,listaAux));
                    break;
                default:
                    for (int i = 0; i < lista.length; i++) {
                        System.out.print("|" +(lista[i]));
                    }
                    break;
            }
            //***************MOSTRAR MENU*********************
            System.out.print(menu(mostrar));
            selMenu = Integer.parseInt(s.nextLine());
            
        }while(selMenu!=4);//FIN WHILE
        
        
    }
    public static String menu (String menu){
        System.out.println("");
        System.out.println("=====================");
        System.out.println("1. Generar array");
        System.out.println("2. Obtener maximo y mínimo");
        System.out.println("3. Obtener la suma");
        System.out.println("4. Salir");
        return menu;
    }
    public static int [] aleatorio(int [] lista){
        int min=-10;
        int max=10;
        
        for (int i = 0; i < 5; i++) {
            int num=(int)(Math.random()*(max-min+1)+min);
            lista[i]= num;
        }
        return lista;
    }
    public static int numMax(int max, int [] lista){
        max = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (max<lista[i]) {
                max = lista[i];
           }  
        }
        return max;
    }
    public static int numMin(int min, int [] lista){
        min = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (min>lista[i]) {
                min = lista[i];
           }  
        }
        return min;
    
    }
    public static int sumatorio (int suma,int [] lista){
        suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma = suma+lista[i];
        }
        return suma;
    }
    
    
}
