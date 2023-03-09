/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Bd_Productos bd=new Bd_Productos();
        bd.add("Leche Puleva",1.2);
        bd.add("Chocolate",2);
        bd.add("Pan",0.75);
        bd.add("Agua 1.5L",1.5);
        Factura f1 = new Factura("B12345678","10/03/22");
        int num = 0;
        do{
            pintarMenu();
            num = Integer.parseInt(s.nextLine());
            switch (num) {
                case 1:
                    añadirLinea(f1,bd,s);
                    break;
                case 2:
                    f1.imprimirFactura();
                    break;
                case 3:
                    añadirProducto(bd,s);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error, elige otra opción");
                    break;
            }
        }while(num != 4);
    }
    public static void pintarMenu(){
        System.out.println("   MENU FACTURA");
        System.out.println("*****************");
        System.out.println("1. Añadir linea");
        System.out.println("2. Imprimir factura");
        System.out.println("3. Añadir producto");
        System.out.println("4. Salir");
        System.out.print("Elige una opción:");
    }
    public static void añadirLinea(Factura f1,Bd_Productos bd,Scanner s){
        System.out.println("Añadiendo lineas...");
        System.out.println("--- INTRO PARA FINALIZAR ---");
        bd.listarProducto();
        System.out.println("----------------------------");
        System.out.print("Referencia: ");
        String ref = s.nextLine();
        Producto p;
        
        if(bd.buscar(ref)!=null){
             p = bd.buscar(ref);
            System.out.print("Cantidad: ");
            int cant = Integer.parseInt(s.nextLine());
            f1.añadirLinea(p, cant);
            System.out.println("Linea añadida exitosamente");
        } else {
            System.out.println("No se encuetra producto");
        }
    }
    public static void añadirProducto(Bd_Productos bd, Scanner s){
        System.out.println("--- AÑADIENDO PRODUCTO ---");
        System.out.print("Indica el nombre: ");
        String des = s.nextLine();
        System.out.print("Indica el precio unitario: ");
        double precioU = Double.parseDouble(s.nextLine());
        bd.add(des, precioU);
        System.out.println("***PRODUCTO AÑADIDO***");
    }
}
