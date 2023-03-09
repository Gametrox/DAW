/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_gestion_tamaño_3;

import java.util.ArrayList;

/**
 *
 * @author ps4an
 */
public class Grupo {
    private String nombre;
    private ArrayList<Alumno>lista;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.lista = new ArrayList(50);
    }

    
    
    public void addAlumno(Alumno user){
        this.lista.add(user);
    }
    
    public Alumno buscarAlumno(int id){
        Alumno a = null;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId()==id) {
                return lista.get(i);
            }
        }
        return a;
    }
    
    public void listarGrupo(){
        System.out.println("=====================");
        System.out.println("Grupo: "+this.nombre);
        System.out.println("=====================");
        
        for (Alumno alumno : lista) {
            System.out.println(alumno.toCadena());

        }
        System.out.println("=====================");
       
    }
    
}
