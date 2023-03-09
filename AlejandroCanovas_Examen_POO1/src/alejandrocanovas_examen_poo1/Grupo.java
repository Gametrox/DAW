/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alejandrocanovas_examen_poo1;

import java.util.ArrayList;

/**
 *
 * @author ps4an
 */
public class Grupo {
    private String nombre;
    private final int MAX_ALUMNOS = 2;
    private ArrayList <Alumno> listaAlumnos = new ArrayList();

    public Grupo(String nombre) {
        this.nombre = nombre;
        
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
    
    public boolean addAlumno(Alumno a){
        if (a.getGrupo()!=null) {
            System.out.println("ERROR, YA MATRICULADO");
            return false;
        }
        if (this.listaAlumnos.size()==MAX_ALUMNOS) {
            System.out.println("ERROR, GRUPO LLENO");
            return false;
        }
            a.setGrupo(this);
            a.setMatriculado(true);
            
            return true;
    }
    public void listarAlumnosGrupo(){
        System.out.println(this.nombre+" - "+this.listaAlumnos.size());
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.aCadena());
            
        }
    }
    
}
