/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;
import Utilidades.Utilidades;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ps4an
 */
public class ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        ArrayList <Libro> listaLibros = new ArrayList();
        ArrayList <Autor> listaAutores = new ArrayList();
        
        listaAutores.add(new Autor("Jorge Javier","Vazquez","Aledo","jorge@gmail.com"));
        listaAutores.add(new Autor("Alicia","Cano","Medina","alicia@gmail.com"));

        listaLibros.add(new Libro (Utilidades.generarCodigoLibro(),"El hobitton",
                listaAutores.get(0),2020));
        listaLibros.add(new Libro (Utilidades.generarCodigoLibro(),"Mi vida bella",
                listaAutores.get(1),2021));
        
        int num = 0;
        do {
            pintarMenu();
            num = Integer.parseInt(s.nextLine());
            switch (num) {
                case 1:
                    imprimirListas(listaAutores,listaLibros);
                    break;
                case 2:
                    nuevoAutor(s,listaAutores);
                    break;
                case 3:
                    nuevoLibro(s,listaLibros,listaAutores);
                    break;
                case 4:
                    System.out.println("Salidendo...");
                    break;
                default:
                    System.out.println("ERROR - Indica otro número");
                    break;
            }
 
        } while (num!=4);
    }
    public static void pintarMenu(){
        System.out.println("1. Listar libros y autores");
        System.out.println("2. Añadir nuevo Autor");
        System.out.println("3. Añadir nuevo Libro");
        System.out.println("4. Salir");
    }
    public static void imprimirListas(ArrayList <Autor> listaAutores, ArrayList <Libro> listaLibros){
        System.out.println("LISTA AUTORES ["+listaAutores.size()+"]");
        System.out.println("==================");

        for (Autor autores : listaAutores) {
            System.out.println(autores.getNombreCita());
        }
        System.out.println("\nLISTA LIBROS ["+listaLibros.size()+"]");
        System.out.println("==================");
        for (Libro libros : listaLibros) {
            System.out.println(libros.getCitaBibliografica());
        }
        System.out.println("\n");
    }
    public static void nuevoAutor(Scanner s, ArrayList <Autor> listaAutores){
        String email = "";
        System.out.println("Introducir nuevo autor");
        System.out.println("======================");
        System.out.print("Nombre: ");
        String nombre = s.nextLine();
        System.out.print("Apellido1: ");
        String apellido1 = s.nextLine();
        System.out.print("Apellido2: ");
        String apellido2 = s.nextLine();
        do{
            System.out.print("Email: ");
            email = s.nextLine();
        }while(Utilidades.checkEmail(email)==false);
        listaAutores.add(new Autor(nombre,apellido1,apellido2,email));
    }
    public static void nuevoLibro(Scanner s, ArrayList <Libro> listaLibros, ArrayList <Autor> listaAutores){
        boolean existe = false;
        Autor aux = new Autor();
        
        System.out.println("Introdicir un nuevo libro");
        System.out.println("=========================");
        System.out.print("Titulo: ");
        String titulo = s.nextLine();
        System.out.print("Año: ");
        int año =Integer.parseInt(s.nextLine());
        String apellido = " ";
        do{
            System.out.print("Apellido del autor: ");
            apellido = s.nextLine();
            for (Autor autor : listaAutores){ 
                if(autor.getApellido1().equals(apellido)){
                    aux = autor;
                    existe = true;
                }
            }
            if (existe== false) {
                System.out.println("Error no existe este autor.");
            }
        }while(existe == false);
        listaLibros.add(new Libro (Utilidades.generarCodigoLibro(),titulo,aux,año));
        
    }
}
