/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Agenda lista = new Agenda();
        
        lista.addContacto("Alex", "alex@gmail.com", "647612451");
        lista.addContacto("Olga", "olga@gmail.com", "678482285");
        lista.addContacto("Algo", "algo@gmail.com", "614908965");
        lista.addContacto("Mango", "mango@gmail.com", "609412833");
        
        int num = 0;
        
        do {
            pintarMenu();
            num = Integer.parseInt(s.nextLine());
            ingresarMenu(s,num,lista);
            
        } while (num != 5);
            
        
    }
    public static void pintarMenu(){
        System.out.println(" ___________________");
        System.out.println("|Agenda de Contactos|");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("1. Añadir");
        System.out.println("2. Lista completa");
        System.out.println("3. Modificar");
        System.out.println("4. Buscar");
        System.out.println("5. Salir");
        System.out.print("\nElige una opción: ");
        
    }
    public static void ingresarMenu(Scanner s, int num, Agenda lista){
        switch (num) {
            case 1:
                System.out.println("Indica el nombre: ");
                System.out.print(" ->");
                String nombre = s.nextLine();
                System.out.println("Indica el email: ");
                System.out.print(" ->");
                String email = s.nextLine();
                System.out.println("Indica el telefono: ");
                System.out.print(" ->");
                String telefono = s.nextLine();
                lista.addContacto(nombre,email,telefono);
                break;
            case 2:
                lista.listarAgenda();
                break;
            case 3:   
                System.out.println("Como deseas elegir el contacto a modificar [nombre/ID]: ");
                String eleccion = s.nextLine();
                eleccion = eleccion.toLowerCase();
                if (eleccion.equals("nombre")) {
                    System.out.println("Indica el nombre del contacto a modificar: ");
                    lista.modificarContacto(s.nextLine());
                } else if (eleccion.equals("id")) {
                    System.out.println("Indica el ID del contacto a modificar: ");
                    lista.modificarContacto(Integer.parseInt(s.nextLine()));
                }
                break;
            case 4:
                System.out.println("Indica una cadena para buscar: ");
                String cadena = s.nextLine();
                
                System.out.println("MOSTRANDO CONTACTOS QUE EMPIEZEN POR ["+cadena+"]: ");
                for (Contacto objeto : lista.buscarContactos(cadena)) {
                    System.out.println(objeto.aCadena());
                }
                System.out.println("===================================");

            default:
                break;
        }
    
    }
    
}
