/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

import java.util.Scanner;
import Utilidades.*;

/**
 *
 * @author ps4an
 */
public class ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        Contacto [] lista = new Contacto [100];
        int selector = 0;
        lista[0] = new Contacto ("Juan","juan@gmail.com","674821534");
        lista[1] = new Contacto ("Alicia","alicia@gmail.com","654231542");
        lista[2] = new Contacto ("Alejandro","alex@gmail.com","677421873");
        
        do{
            menu(); 
            selector = Integer.parseInt(s.nextLine());
            switch (selector) {
                case 1:
                    nuevoContacto(s, lista);
                    break;
                case 2:
                    listarContacto(lista);
                    break;
                case 3:
                    listarContacto(lista);
                    modificarContacto(s,lista);
                    break;
                default:
                    System.out.println("Saliendo . . . ");
                    break;
            }
        }while(selector!=4);

    }
    public static void menu(){
        System.out.println("=====================");
        System.out.println("      CONTACTOS      ");
        System.out.println("=====================");
        System.out.println("1. Nuevo Contacto");
        System.out.println("2. Listar Contactos");
        System.out.println("3. Modificar Contacto");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }
    public static void nuevoContacto(Scanner s,Contacto [] lista){
        System.out.println("================== AÑADIR CONTACTOS ==================");
        System.out.println("Indica el nombre: ");
        System.out.print("   ->");
        String nombre = s.nextLine();
        String email = "";
        do {
            System.out.println("Indica el email: ");
            System.out.print("   ->");
            email = s.nextLine();
        } while (!Utilidades.checkEmail(email));
        
        System.out.println("Indica el teléfono: ");
        System.out.print("   ->");
        String telefono = s.nextLine();
        
        lista[Contacto.getContador()] = new Contacto (nombre,email,telefono); 
        
    }
    public static void listarContacto(Contacto [] lista){
    System.out.println("================= LISTA DE CONTACTOS =================");
        System.out.println("ID      NOMBRE            EMAIL          TELEFONO");
        for (int i = 0; i < Contacto.getContador(); i++) {
            lista[i].listarContactos();
        }
        System.out.println("======================================================");
    }
    public static void menuModificador(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("     MODIFICADOR     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Cambiar nombre");
        System.out.println("2. Cambiar email");
        System.out.println("3. Cambiar número");
        System.out.println("4. EDITAR TODO");
        System.out.print("Elige una opción: ");
    }
    public static void modificarContacto(Scanner s, Contacto [] lista){
        System.out.println("Indica el ID del contacto a modificar:");
        System.out.print("   ->");
        int selector = Integer.parseInt(s.nextLine());
        menuModificador();
        int opcion = Integer.parseInt(s.nextLine());
        
        switch (opcion) {
            case 1:
                System.out.println("Indica el nuevo nombre:");
                System.out.print("   ->");
                String nombre = s.nextLine();
                lista[selector-1].setNombre(nombre);
                break;
            case 2:
                String email = "";
                do {
                    System.out.println("Indica el nuevo email:");
                    System.out.print("   ->");
                    email = s.nextLine();
                    
                } while (!Utilidades.checkEmail(email));
                lista[selector-1].setEmail(email);
                
                break;
            case 3:
                System.out.println("Indica el nuevo telefono:");
                System.out.print("   ->");
                String telefono = s.nextLine();
                lista[selector-1].setTelefono(telefono);
                break;
            case 4:
                System.out.println("Indica el nuevo nombre:");
                System.out.print("   ->");
                nombre = s.nextLine();
                System.out.println("Indica el nuevo email:");
                System.out.print("   ->");
                email = s.nextLine();
                System.out.println("Indica el nuevo telefono:");
                System.out.print("   ->");
                telefono = s.nextLine();
                lista[selector-1].setNombre(nombre);
                lista[selector-1].setEmail(email);
                lista[selector-1].setTelefono(telefono);
                break;
            default:
                System.out.println("OPCION INVAIDA");
                break;
        }
    }
}
