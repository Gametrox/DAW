/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

import java.util.ArrayList;

/**
 *
 * @author ps4an
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro>listaLibros = new ArrayList();
    private ArrayList<Autor>listaAutores = new ArrayList();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }
    
    public void addLibro(String titulo,Autor autor, int año){
        Libro libronuevo = new Libro (titulo,autor,año);
        listaLibros.add(libronuevo);
    }
    public void addAutor(String nombre, String apellido1, String apellido2, String email){
        Autor autornuevo = new Autor(nombre,apellido1,apellido2,email);
        this.listaAutores.add(autornuevo);
    }
    public boolean prestarLibro(String cod){
        for (Libro libro : listaLibros) {
            if (libro.getCodigo().equals(cod) && libro.isPrestado()==false) {
                libro.setPrestado(true);
                return true;
            }
        }
        System.out.println("ERROR: El libro ya está prestado");
        return false;

    }
    
    public boolean devolverLibro(String cod){
        for (Libro libro : listaLibros) {
            if (libro.getCodigo().equals(cod) && libro.isPrestado()==true) {
                libro.setPrestado(false);
                return true;
            } 
        }
        System.out.println("ERROR: El libro ya está en la biblioteca");
        return false;

    }
    
    public void listarLibros(){
        System.out.println(this.nombre+" - Listado de Libros: ");
        System.out.println("=====================================");
        for (Libro libro : listaLibros) {
            libro.imprimir();
        }
        System.out.println("=====================================");

    }
    public void listarAutores(){
        System.out.println("*-----------------*");
        System.out.println("Listado de autores: ");
        for (Autor autor : this.listaAutores) {
            System.out.println(autor.getNombreCita());
        }
        System.out.println("*-----------------*\n");

    }
    
}
