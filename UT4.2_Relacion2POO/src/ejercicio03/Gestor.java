/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Gestor {
    Scanner s = new Scanner(System.in);
    private String nombre;
    private int contador = 0;
    private ArrayList <Incidencia> lista = new ArrayList();
    private ArrayList <Puesto> puestos = new ArrayList();

    public Gestor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Incidencia> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Incidencia> lista) {
        this.lista = lista;
    }

    public void addIncidencia(String des, int pue, LocalDate fecha){
        Incidencia i = new Incidencia(des,pue,fecha);
        this.contador += 1;
        lista.add(i);
                
    }
    
    
    
    public void listarIncidencias(){
        boolean estaTodo = true;
        
        for (Incidencia incidencia : lista) {
            
            if (incidencia.getEstado()==EstadoIncidencia.PENDIENTE) {
                estaTodo = false;
            }
        }
        
        
        System.out.println("========================================================");
        if (lista.isEmpty() || estaTodo) {
            System.out.println("           ----------- TODO RESUELTO -----------");
            System.out.println("========================================================");
        }else {
            if (this.contador == 1) {
                System.out.println("           ----------- HAY "+this.contador+" INCIDENCIA  -----------");
            }else{
                System.out.println("           ----------- HAY "+this.contador+" INCIDENCIAS  -----------");

            }
        }
        for (Incidencia incidencia : lista) {
            
            System.out.println(incidencia.cadenaIncidencia());
            
        }
        if (lista.size()>=1) {
            System.out.println("========================================================");

        }

    }
    
    public void listarPuestos(){
        System.out.println("    LISTADO DE PUESTOS:\n");
        for (Puesto puesto : puestos) {
            System.out.println(puesto.lineaPuesto());
        }
        System.out.println("");
    }
    public void addPuesto(int cod, String des){
        Puesto p = new Puesto(cod,des);
        puestos.add(p);
    }
    
    public Puesto buscarPuesto(int cod){
        for (Puesto puesto : puestos) {
            if (cod == puesto.getCodigo()) {
                return puesto;
            }
        }
        return null;    
    }
    
    public void resorlverIncidencia(String s,int cod){
        
        Incidencia i = buscarInci(cod);
        if (i.getEstado() == i.getEstado().PENDIENTE) {
            this.contador -= 1;
            i.setDescripcionSolucion(s);
            i.setfFin(LocalDate.now());
            i.setEstado(EstadoIncidencia.RESUELTA);
        }else{
            System.out.println("Error, ya está resuelta");
        }
        
        
    }
    public Incidencia buscarInci(int s){
        for (Incidencia incidencia : lista) {
            if (s == incidencia.getCodigo()) {
                return incidencia;
            }
        }
        return null;
    }
    
    public void estado(String s, Incidencia i){
        if (i.getEstado()==EstadoIncidencia.PENDIENTE && s.equals(nombre)) {
            i.setEstado(EstadoIncidencia.RESUELTA);
            
        }
    }
    
    public void pintarDetalla (Incidencia i){
        System.out.println("===========INCIDENCIA==========");
        System.out.println("CODIGO: "+i.getCodigo());
        System.out.println("PUESTO: "+buscarPuesto(i.getCodigoPuesto()).getDescripcion());
        System.out.println("-------------------------------");
        System.out.println("DESCRIPCION: "+i.getDescripcionProblema());
        System.out.println("FECHA INCIDENCIA: "+i.getfIni());
        if (i.getEstado()==EstadoIncidencia.RESUELTA) {
            System.out.println("-------------------------------");
            System.out.println("RESOLUCION: "+i.getDescripcionSolucion());
            System.out.println("FECHA RESOLUCION: "+i.getfFin());            
        }
        System.out.println("===============================");
    }
   
    
    
    
    
    
}
