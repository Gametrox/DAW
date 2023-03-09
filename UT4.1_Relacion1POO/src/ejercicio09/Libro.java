/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;
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

    public Libro(String codigo, String titulo, Autor autor, int año) {
        this.codigo = Utilidades.generarCodigoLibro();
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        
    }
    
    public String getCitaBibliografica(){
        String cita = this.codigo+" - "+this.titulo+" - "+"("+this.año+")"+
                " - "+"de "+ autor.getNombreCita();
        
        return cita;
    }
    
}
