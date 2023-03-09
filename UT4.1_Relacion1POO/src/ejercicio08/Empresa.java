/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author ps4an
 */
public class Empresa {
    private String CIF;
    private String nombre;
    private String localidad;

    public Empresa(String CIF, String nombre, String localidad) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.localidad = localidad;
    }
    

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    public void imprimir(){
        //CAMBIAR COLOR AL 34
        System.out.printf("\u001B[31m%s  - \u001B[34m%8s   - \u001B[34m%8s \u001B[0m\n",this.CIF,this.nombre,this.localidad);
    
    }
    
}
