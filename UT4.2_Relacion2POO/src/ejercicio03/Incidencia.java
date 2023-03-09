/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.time.LocalDate;

/**
 *
 * @author ps4an
 */
enum EstadoIncidencia{
        PENDIENTE,RESUELTA
    }

public class Incidencia {
    
    private static int contador = 1000;
    private int codigo;
    private LocalDate fIni;
    private int codigoPuesto;
    private String descripcionProblema;
    private LocalDate fFin;
    private String descripcionSolucion;
    private EstadoIncidencia estado;
    
   
    public Incidencia(String descripcionProblema,int puesto, LocalDate fecha) {
        contador += 1;
        this.codigo = contador;
        this.codigoPuesto = puesto;
        this.descripcionProblema = descripcionProblema;
        this.fIni = fecha;
        this.estado = EstadoIncidencia.PENDIENTE;
    }

    public int getCodigoPuesto() {
        return codigoPuesto;
    }

    public void setCodigoPuesto(int codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    
    

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Incidencia.contador = contador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    

    public LocalDate getfIni() {
        return fIni;
    }

    public void setfIni(LocalDate fIni) {
        this.fIni = fIni;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    public LocalDate getfFin() {
        return fFin;
    }

    public void setfFin(LocalDate fFin) {
        this.fFin = fFin;
    }

    public String getDescripcionSolucion() {
        return descripcionSolucion;
    }

    public void setDescripcionSolucion(String descripcionSolucion) {
        this.descripcionSolucion = descripcionSolucion;
    }

    public EstadoIncidencia getEstado() {
        return estado;
    }

    public void setEstado(EstadoIncidencia estado) {
        this.estado = estado;
    }

   
    
    public String cadenaIncidencia(){
        if (this.estado == EstadoIncidencia.PENDIENTE) {
            String cadena = String.format("\033[31m[   %s] %d      %s [%s]\033[30m",
                this.estado,
                codigo,
                this.descripcionProblema,
                this.fIni
                );
            return cadena;
        }
           String cadena = String.format("\033[32m[   %s] %d      %s [%s]\033[30m",
                this.estado,
                codigo,
                this.descripcionProblema,
                this.fIni
                );
            return cadena; 
    }
    
    

    
    
}
