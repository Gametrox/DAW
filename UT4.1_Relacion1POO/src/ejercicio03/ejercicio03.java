/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author ps4an
 */
public class ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //1º FORMA (SIN ARRAYS)
//        Libro libro1 = new Libro("1984","G.Oswell",1948);
//        Libro libro2 = new Libro("L001","Moby Dick","Mervill,H.",1851);
//        Libro libro3 = new Libro("","50 sombras","Mike M.",2010);
//        
//        libro1.setISBN("L453");
//        
//        System.out.println(libro1.citaBibliografica());
//        System.out.println(libro2.citaBibliografica());
//        System.out.println(libro3.citaBibliografica());
//        
    //2º FORMA (USANDO ARRAYS)
        Libro [] listaLibros = new Libro [10];
        
//        Libro unlibro;
        int total = 0;
        
//        unlibro = new Libro("1984","G.Oswell",1948);
        listaLibros[total] = new Libro("1984","G.Oswell",1948);
        total++;
        
        listaLibros[total] = new Libro("L001","Moby Dick","Mervill,H.",1851);
        total++;
        
        listaLibros[total] = new Libro("50 sombras","Mike M.",2010);
        total++;
        
//        for (int i = 0; i < total; i++) {
//            System.out.println(listaLibros[i].citaBibliografica());
//        }
  
        listaLibros[0].setISBN("y1p3");
        
        for (int i = 0; i < total; i++) {
            System.out.println(listaLibros[i].getISBN());
        }
    
    }
    
}
