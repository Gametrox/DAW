/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Agenda {
    private ArrayList<Contacto>lista;
    private int contadorID;
    
    public Agenda(){
        this.lista = new ArrayList();
    }
    
    public void addContacto(String nombre,String email, String telefono){
        this.contadorID++;
        Contacto persona = new Contacto(this.contadorID,nombre,email,telefono);
        this.lista.add(persona);
        
    }
    public void listarAgenda(){
        System.out.println("Mostrando contactos de | AGENDA");
        System.out.println("===================================");
        for (Contacto contacto : lista) {
            System.out.println(contacto.aCadena());
        }
        System.out.println("===================================");
    }
    public void modificarContacto(int id){
        //LLAMAMOS AL MODIFICADOR
        for (Contacto contacto : lista) {
            if (id == contacto.getId()) {
                modificarContacto(contacto);
            }
            
        }
        
    }
    public void modificarContacto(String nombre){
        //LLAMAMOS AL MODIFICADOR
        
        for (Contacto contacto : lista) {
            if (nombre.equals(contacto.getNombre())) {
                modificarContacto(contacto);
            }
        }
        
    }
    private void modificarContacto(Contacto c){
        Scanner s = new Scanner (System.in);
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println("MENU MODIFICADOR");
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("Indica qué deseas modificar [nombre|email|telefono|todo]: ");
        String entrada = s.nextLine();
        entrada = entrada.toLowerCase();
        switch (entrada) {
            case "nombre":
                System.out.println("Indica el nuevo nombre: "); 
                c.setNombre( s.nextLine());
                break;
            case "email":
                System.out.println("Indica el nuevo email: ");
                c.setEmail(s.nextLine());
                break;
            case "telefono":
                System.out.println("Indica el nuevo teléfono: ");
                c.setTelefono(s.nextLine());
                break;
            case "todo":
                System.out.println("Indica el nuevo nombre: "); 
                c.setNombre(s.nextLine());
                
                System.out.println("Indica el nuevo email: ");
                c.setEmail(s.nextLine());
                
                System.out.println("Indica el nuevo teléfono: ");
                c.setTelefono(s.nextLine());
                break;
            default:
                break;
        }
        
    }
    public ArrayList<Contacto> buscarContactos(String expresion){
        ArrayList <Contacto> listaNombres = new ArrayList();
        for (Contacto contacto : lista) {
            if (contacto.getNombre().startsWith(expresion)) {
                listaNombres.add(contacto);
            }
        }
        return listaNombres;    
    }
}
    
    
    
