/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

import java.util.ArrayList;

/**
 *
 * @author ps4an
 */
public class Banco {
    private String nombre;
    private ArrayList <Persona> listaPersonas = new ArrayList();
    private ArrayList <CuentaCorriente> listaCuentas = new ArrayList();

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<CuentaCorriente> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<CuentaCorriente> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    
    public void nuevoCliente(String dni,String nombre,String ap1,String ap2,String mail){
        Persona c1 = new Persona(dni,nombre,ap1,ap2,mail);
        listaPersonas.add(c1);
    }
    
    public void nuevaCuenta(Persona p, double saldoInicio){
        CuentaCorriente cn = new CuentaCorriente(p,saldoInicio);
        listaCuentas.add(cn);
    }
    
    public Persona buscarPersona(String dni){
        for (Persona persona : listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(dni)) {
                return persona;
            }
        }
        return null;
    }
    public CuentaCorriente buscarcuenta(int num){
        for (CuentaCorriente cuenta : listaCuentas) {
            if (cuenta.getNumero()==num){
                return cuenta;
            }
        }
        return null;
    }
    
    public ArrayList<CuentaCorriente> getCuentas(Persona p){
        ArrayList <CuentaCorriente> lista = new ArrayList();
        for (CuentaCorriente cuenta : listaCuentas) {
            if (cuenta.getTitular().getDni().equalsIgnoreCase(p.getDni())) {
                lista.add(cuenta);
            }
        }
        return lista;
    }
    
    public void listarCuentasPersona(Persona c){
        System.out.println("--- Cuentas ---");
        System.out.println(" ID       SALDO");
        for (CuentaCorriente cuenta : listaCuentas) {
            if (cuenta.getTitular().getDni().equalsIgnoreCase(c.getDni())) {
                System.out.println(cuenta.aCadena());
            }
        }
    }
    public void listarCuentas(){
        for (CuentaCorriente cuenta : listaCuentas) {
            System.out.println(cuenta.aCadenaDetallada());
        }
    }
    public void listarClientes(){
        for (Persona persona : listaPersonas) {
            System.out.println(persona.aCadena());
        }
    }
    
}
