/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author ps4an
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int año;
    

    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }
    

    public Libro(String ISBN, String titulo, String autor, int año) {
        if (this.checkISBN(ISBN)){
            this.ISBN=ISBN;
            
        } else {
            this.ISBN=null;
        }
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    public String citaBibliografica(){
        String cita = (this.titulo+" | "+this.autor+" | "+this.año);
        return cita;
    }
    
    
    
    public String getISBN() {
        if (this.ISBN==null) {
            return "*** ["+this.titulo+"] NO tiene ISBN***";
        } else {
            return ISBN;
        }
    }

    public void setISBN(String ISBN) {
        ISBN = ISBN.toUpperCase();
        if (this.checkISBN(ISBN)){
            this.ISBN=ISBN;
            
        } else {
            this.ISBN=null;
        }
        
        
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    private boolean checkISBN(String ISBN){
        
        boolean estaBien = true;
        if (ISBN.length()!=4) {
            estaBien = false;
        }
        char letra = ISBN.charAt(0);
        if (letra < 'A' || letra > 'Z') {
            estaBien = false;
        }
        char digito1 = ISBN.charAt(1);
        if (digito1<'0' || digito1>'9' ) {
            estaBien = false;

        }
        char digito2 = ISBN.charAt(2);
        if (digito2<'0' || digito2>'9' ) {
            estaBien = false;

        }
        char digito3 = ISBN.charAt(3);
        if (digito3 < '0' || digito3>'9' ) {
            estaBien = false;

        }
        
        if (estaBien==false) {
            return false;
        }else{
            return true;
        }
        
    }
    
    
}
