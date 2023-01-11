/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int numero = 100;
        int comprobarPar = 0;
        
        do{
            switch (numero) {
                case 1:
                    esPar(comprobarPar);
                    break;
                case 3:
                    System.out.println("Indica la fecha con espacios [D/M/A]: ");
                    String fechaFull = s.nextLine();
                    String [] fechaSeparada = fechaFull.split("/");
                    int day=Integer.parseInt(fechaSeparada[0]);
                    int month=Integer.parseInt(fechaSeparada[1]);
                    int year=Integer.parseInt(fechaSeparada[2]);

                    if (esCorrecta(day, month, year)==0) System.out.println("\033[32mLa fecha es correcta\033[0m");
                    if (esCorrecta(day, month, year)==1) System.out.println("\033[31mDIA INCORRECTO\033[0m");
                    if (esCorrecta(day, month, year)==2) System.out.println("\033[31mMES INCORRECTO\033[0m");
                    if (esCorrecta(day, month, year)==3) System.out.println("\033[31mAÑO INCORRECTO\033[0m");
                    break;
                case 7:
                    int [] lista1 = new int [5];
                    int [] lista2 = new int [5];
                    System.out.println("Indica la lista 1");
                    for (int i = 0; i < lista1.length; i++) {
                        lista1[i]=Integer.parseInt(s.nextLine());
                    }
                    System.out.println("Indica la lista 2");
                    for (int i = 0; i < lista2.length; i++) {
                        lista2[i]=Integer.parseInt(s.nextLine());
                    }
                    if (comparar(lista1,lista2)==true) {
                        System.out.println("Son iguales");
                    } else {
                        System.out.println("No son iguales");
                    }
                    
                    
                    break;
                    
                default:
                    break;
            }
            
            menu();
            numero = Integer.parseInt(s.nextLine());
        }while(numero!=0);
    }
    public static void menu(){
        System.out.println("===Ejercicios[ 1 - 3 - 7 ]===");
        System.out.println("Indica que ejercicio quieres comprobar:");
        System.out.println("1. Comprobar si un número es par");
        System.out.println("3. Comprobar si una fecha es correcta");
        System.out.println("7. Listas con parámetros de entrada");
        System.out.println("0. CERRAR");
    }
    public static boolean esPar(int numero){
        Scanner s = new Scanner (System.in);

        System.out.println("Indica el numero para comprobar si es par: ");
        numero = Integer.parseInt(s.nextLine());
        if (numero % 2 == 0) {
            System.out.println("----------------");
            System.out.println("\033[32mEl número es par\033[0m");
            System.out.println("----------------");
            return true;
        } else {
            System.out.println("-------------------");
            System.out.println("\033[31mEl numero no es par\033[0m");
            System.out.println("-------------------");
            return false;
        }
        
    }
    public static int esCorrecta(int day, int month,int year){
        if (year < 2500 && year>1500) {
            switch (month){
                case 1,3,5,7,8,10,12:

                    if(day>0 && day<32)
                        return 0;
                    else{
                        return 1;
                    }
                case 4,6,9,11:
                    if (day>0 && day<31){
                        return 0;
                    }else{
                        return 1;
                    }

                case 2:
                    if (Year.of(year).isLeap()){
                        if (day>0 && day<30){
                        return 0;
                        }else{
                        return 1;
                        }

                    }else if (day>0 && day<29){
                        return 0;
                    }else{
                        return 1;
                    }
                   default:
                       return 2;
            }
        }else{
            return 3;
        }
    }
    public static boolean comparar(int [] lista1, int [] lista2){
        Scanner s = new Scanner (System.in);
        for (int i = 0; i < lista1.length; i++) {
            if (lista1[i]==lista2[i]) {
                return true;
            }else{
                return false;
            }
        }
        return false;
        
        
    }
    
}
