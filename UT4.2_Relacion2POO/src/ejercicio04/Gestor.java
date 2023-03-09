/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author ps4an
 */
public class Gestor {
    private DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyy");
    private String nombreEmpresa;
    private ArrayList<Cliente>listaClientes = new ArrayList();
    private ArrayList<Vehiculo>listaVehiculos = new ArrayList();
    private ArrayList<Alquiler>listaAlquileres = new ArrayList();

    public Gestor(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public ArrayList<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(ArrayList<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    
    
    public void addCliente(String nombre, String email, String direccion){
        Cliente a = new Cliente(nombre,email,direccion);
        listaClientes.add(a);
    }
    public void listarClientes(){
        for (Cliente c : listaClientes) {
            System.out.println(c.aCadena());
        }
    }
    public Cliente buscarCliente(int idCliente){
        for (Cliente c : listaClientes) {
            if (idCliente==c.getId()) {
                return c;
            }
        }
        return null;
    }
    
    
    public void addVehiculo(String matricula, String marca, String modelo, double precio_dia){
        Vehiculo v = new Vehiculo(marca,modelo,matricula,precio_dia);
        listaVehiculos.add(v);
    }
    public void addVehiculoSinPrecio(String matricula, String marca, String modelo){
        Vehiculo v = new Vehiculo(marca,modelo,matricula);
        listaVehiculos.add(v);
    }
    public void listarVehiculos(){
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v.aCadena());
        }
    }
    public void listarVehiculosDisponibles(){
        for (Vehiculo v : listaVehiculos) {
            if (v.isAlquilado()==false) {
                System.out.println(v.aCadenaAlquiler());
            }
        }
    }
    public Vehiculo buscarVehiculo(String matricula){
        for (Vehiculo v : listaVehiculos) {
            if (matricula.equalsIgnoreCase(v.getMatricula())) {
                return v;
            }
        }
        return null;
    }
    
    public Alquiler buscarAlquiler(int id){
        for (Alquiler a : listaAlquileres) {
            if (id == a.getId()) {
                return a;
            }
        }
        return null;
    }
    
    public void listarAlquileres(){
        for (Alquiler alquiler : listaAlquileres) {
            System.out.println(alquiler.aCadena());
        }
    }
    
    public boolean nuevoAlquiler(int idCliente, String matricula, LocalDate f){
        boolean estaBien = true;
        try {
        if (buscarCliente(idCliente)==null) {
            estaBien = false;
            System.out.println("ERROR - ID no encontrada en la base de datos");
        }
        
            if (buscarVehiculo(matricula)==null) {
                estaBien = false;
                System.out.println("ERROR - MATRICULA no encontrada en la base de datos");
            }
        

        
        if (buscarVehiculo(matricula).isAlquilado()) {
            estaBien = false;
            System.out.println("ERROR - El vehículo YA está alquilado");
        }
        } catch (Exception e) {
            
        }
        if (estaBien) return true;
        return false;
        
    }
    public void devolverVehiculo(int id,LocalDate f){
        if (buscarAlquiler(id)!=null) {
            buscarAlquiler(id).devolverVehiculo(f);
        }else{
            System.out.println("ERROR, no se encuentra este alquiler");
        }
    }
    
    public void addAlquiler(int id, String matricula, LocalDate f){
        if (nuevoAlquiler(id,matricula,f)) {
            Alquiler a = new Alquiler(buscarCliente(id),buscarVehiculo(matricula),f);
            listaAlquileres.add(a);
        }else {
            System.out.println("ERROR No se ha podido hacer el alquiler");
        }
    }
    public void listarDetallesAlquiler(int id){
        if (buscarAlquiler(id)!=null){
            buscarAlquiler(id).imprimirDetalles();
        } else {
            System.out.println("ERROR, No se ecuentra este alquiler");
        }
        
    }
    
    
}
