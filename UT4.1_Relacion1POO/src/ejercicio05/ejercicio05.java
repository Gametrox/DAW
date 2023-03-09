/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Casa [] listaCasas = new Casa [50];
        int num = 0;
        int selector = 0;
        listaCasas[0] = new Casa("Juan",30,45,120000);
        listaCasas[1] = new Casa("Pedro",120,120,100000);
        listaCasas[2] = new Casa("Alicia",70,70,150000);
        listaCasas[3] = new Casa("Paco",80,0,120000);
                

        do{
            mostrarMenu();
            num = Integer.parseInt(s.nextLine());
            switch (num) {
                case 1:
                    System.out.println("==== Alta de nueva casa ===");
                    añadirCasa(listaCasas);
                    break;
                case 2:
                    System.out.println("==== Listado de casas ====");
                    for (int i = 0; i < Casa.getContadorCasas(); i++) {
                        System.out.print("CASA "+(i+1)+"--> ");
                        listaCasas[i].imprimirDatos();
                    }
                    break;
                case 3:
                    System.out.println("==== Cambiar propietario ===");
                    System.out.print("Elige una casa para cambiar su propietario: ");
                    selector = Integer.parseInt(s.nextLine());
                    System.out.println("Indica su nuevo propietario: ");
                    String nuevoPropietario = s.nextLine();
                    listaCasas[selector-1].setPropietario(nuevoPropietario);
                    break;
                    
                case 4:
                    System.out.println("==== BUSCADOR POR PRECIO ====");
                    System.out.print("Indica el precio máximo: ");
                    int max = Integer.parseInt(s.nextLine());
                    buscarCasas(listaCasas,max);
                    break;
                    
                default:
                    System.out.println("---CERRANDO PROGRAMA---");
                    break;
            }
        } while(num!=5);
       
    }
    public static void mostrarMenu(){
        System.out.println("====================");
        System.out.println("     MENU CASAS     ");
        System.out.println("====================");
        System.out.println("1. Añadir casa");
        System.out.println("2. Listar casas");
        System.out.println("3. Cambiar propietario");
        System.out.println("4. Buscar por precio");
        System.out.println("5. Salir\n");
        System.out.print("Elige una opción: ");
        
    }
    public static void añadirCasa(Casa [] lista){
        Scanner s = new Scanner (System.in);
        System.out.print("Nombre del propietario: ");
        String nombre = s.nextLine();
        System.out.print("Superficie PLANTA 1: ");
        int p1 = Integer.parseInt(s.nextLine());
        System.out.print("Superficie PLANTA 2: ");
        int p2 = Integer.parseInt(s.nextLine());
        System.out.print("Precio de venta: ");
        double pv = Double.parseDouble(s.nextLine());
        
        lista[Casa.getContadorCasas()] = new Casa (nombre,p1,p2,pv);
        
    }
    public static void buscarCasas(Casa [] lista,int max){
        for (int i = 0; i < Casa.getContadorCasas(); i++) {
            if (lista[i].getPrecioVenta() < max) {
                System.out.print((i+1)+" -->"); lista[i].imprimirDatos();
            }
        }
    }
      
    
}
