/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_gestion_tamaño_3;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Grupo x = new Grupo("GRUPO_TIA");
        x.addAlumno(new Alumno("Mortadelo",21));
        x.addAlumno(new Alumno("Filemon",18));
        x.addAlumno(new Alumno("Carpanta",30));
        
        System.out.println("");
        
        x.listarGrupo();
        
        System.out.println("Indica el ID para buscar al alumno: ");
        int num = Integer.parseInt(s.nextLine());
        

        
        
    }
    
}
