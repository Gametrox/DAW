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
public class CentroEducativo {
    private String nombre;
    private ArrayList <Alumno> listaAlumnos = new ArrayList();
    private ArrayList <Grupo> listaGrupos = new ArrayList();

    public CentroEducativo(String nombre) {
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

    public ArrayList<Grupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(ArrayList<Grupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }
    
    public void addAlumno(String nom, int edad){
        Alumno a = new Alumno(nom,edad);
        listaAlumnos.add(a);
    }
    public Alumno obtenerAlumno(int id){
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getId()==id) {
                return alumno;
            }
        }
        return null;
    }
    public void listarAlumnos(){
        System.out.println(this.nombre+" LISTADO TOTAL DE ALUMNADO");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.aCadena());
        }
    }
    
    
    public void addGrupo(String nom){
        Grupo g = new Grupo(nom);
        listaGrupos.add(g);
    }
    
    public Grupo obtenerGrupo(String nom){
        for (Grupo grupo : listaGrupos) {
            if (grupo.getNombre().equalsIgnoreCase(nom)) {
                return grupo;
            }
        }            
        return null;

    }
    public void listarGrupos(){
        System.out.println(this.nombre+" LISTADO DE GRUPOS");
        for (Grupo grupo : listaGrupos) {
            grupo.listarAlumnosGrupo();
        }
    }
    
    public void matricular(Alumno a, Grupo g){
        g.addAlumno(a);
        
        
        
    }
    
}
