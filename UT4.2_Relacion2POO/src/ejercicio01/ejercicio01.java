/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Biblioteca b1 = new Biblioteca("Alex");
        
        b1.addAutor("John","Ronald","Tolkien","tolkien@gmail.com");
        b1.addAutor("Juan Gomez ","Jurado","Gomariz","juan@gmail.com");
        b1.addAutor("Alejandro","Canovas","Garcia","alejandro@hotmail.com");
        b1.addLibro("El señor A", b1.getListaAutores().get(0), 1957);
        b1.addLibro("Reina Roja", b1.getListaAutores().get(1), 2018);
        b1.addLibro("La lluvia en Sevilla", b1.getListaAutores().get(2), 2023);
        
        
        int num = 0;
        String cod = "";
        
        do {
            pintarMenu();
            num = Integer.parseInt(s.nextLine());
        
            switch (num) {
                case 1:
                    añadirAutor(s,b1);
                    break;
                case 2:
                    crearLibro(s,b1);
                    break;
                case 3:
                    b1.listarLibros();
                    break;
                case 4:
                    b1.listarAutores();
                    break;
                case 5:
                    System.out.print("Indica el codigo del libro a prestar:");
                    cod = s.nextLine();
                    b1.prestarLibro(cod);
                    break;
                case 6:
                    System.out.print("Indica el codigo del libro a prestar:");
                    cod = s.nextLine();
                    b1.devolverLibro(cod);
                    break;
                case 7:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Numero incorrecto, elige otra opción");
                    break;
            }
        } while (num!=7);

        
        
    }
    public static void pintarMenu(){
        System.out.println("1. Añadir autor");
        System.out.println("2. Añadir libro");
        System.out.println("3. Listar libros");
        System.out.println("4. Listar autores");
        System.out.println("5. Prestar libro");
        System.out.println("6. Devolver libro");
        System.out.println("7. Salir");
        System.out.print("Elige una opcion: ");
    }
    public static void añadirAutor(Scanner s, Biblioteca b1){
        System.out.println("Indica el nombre del autor: ");
        String nombre = s.nextLine();
        System.out.println("Indica el 1º apellido del autor: ");
        String apellido1 = s.nextLine();
        System.out.println("Indica el 2º apellido del autor: ");
        String apellido2 = s.nextLine();
        System.out.println("Indica el email del autor: ");
        String email = s.nextLine();
        b1.addAutor(nombre, apellido1, apellido2, email);
    }
    public static void crearLibro(Scanner s,Biblioteca b1){
        int idAutor = 0;
        do{
            System.out.print("Indica el ID del autor para añadir libro:");
            idAutor = Integer.parseInt(s.nextLine());
        }while(comprobarAutor(idAutor,b1)==null);
        
        System.out.print("Indica el título del libro: \n ->");
        String titulo = s.nextLine();
        
        
        
        
        
        System.out.print("Indica el año de publicación: \n ->");
        int año = Integer.parseInt(s.nextLine());
        
        b1.addLibro(titulo,comprobarAutor(idAutor,b1),año);
        
    }
    public static Autor comprobarAutor(int id,Biblioteca b1){
        for (Autor autor : b1.getListaAutores()) {
            if (autor.getId()==id) {
                return autor;
            }
        }
        return null;
    }
    
    public static void limpiarPantalla(){
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }
}
