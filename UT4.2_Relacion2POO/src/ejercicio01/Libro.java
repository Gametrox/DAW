/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;
import Utilidades.Utilidades;
/**
 *
 * @author ps4an
 */
public class Libro {
    private String codigo;
    private String titulo;
    private Autor autor;
    private int año;
    private boolean prestado = false;

    public Libro(String titulo, Autor autor, int año) {
        this.codigo = Utilidades.generarCodigoLibro();
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    
    public boolean isPrestado() {
        if (this.prestado) {
            return true;
        }
        return false;
    }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    
    
    public void imprimir(){
        if (this.isPrestado()) {
            System.out.printf("P %s - \t%s (%d) - %s\n",
                    this.codigo,this.titulo,this.año,this.autor.getNombreCita());
        } else {
            System.out.printf("  %s - \t%s (%d) - %s\n",
                    this.codigo,this.titulo,this.año,this.autor.getNombreCita());

        }
    }

    

    
    
}
