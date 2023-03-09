/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner s = new Scanner(System.in);
        Gestor g = new Gestor("AlexSL");
        g.addPuesto(10,"PC sobremesa 10");
        g.addPuesto(11,"PC sobtemesa 11");
        g.addPuesto(12,"PC portatil 12");
        g.addPuesto(40,"Pizarra digital Sala reuniones");
        g.addPuesto(41,"PC sala de reuniones");
        
       

        
        int selector = 0;
        do{
            limpiarPantalla();
            g.listarIncidencias();
            
            System.out.println(g.getNombre());
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy - HH:mm'h'", new Locale("es", "ES"));
            String formattedDate = dateFormat.format(date);
            System.out.println(formattedDate);
            menu();
            
            selector = Integer.parseInt(s.nextLine());
            limpiarPantalla();

            switch (selector) {
                case 1:
                    añadirIncidencia(s,g,dtf);
                    break;
                case 2:
                    resolverIncidencia(s,g);
                    break;
                case 3:
                    detalleIncidencia(s,g);
                    break;
                case 4:
                    añadirPuesto(s,g);                    
                    break;
                case 5:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Opcion incorrecta, indica de nuevo");
                    break;
            }
        }while(selector!=5);
        
        
        
        
    }
    public static void menu(){
        System.out.println("****************");
        System.out.println("1. Nueva incidencia");
        System.out.println("2. Resolver incidencia");
        System.out.println("3. Detalles de incidencia");
        System.out.println("4. Nuevo puesto");
        System.out.println("5. Salir");
        System.out.println("Elige Opción");
        System.out.print(" -> ");
    }
    public static void limpiarPantalla(){
        for (int i = 0; i < 20; i++) {
            System.out.println("\n");
        }
    
    }
    public static void añadirPuesto(Scanner s, Gestor g){
        System.out.println("---AÑADIENDO PUESTO---");
        g.listarPuestos();
        System.out.println("Introduce el nombre del puesto: ");
        System.out.print(" -> ");
        String nombrePuesto = s.nextLine();
        System.out.println("Indica el codigo del puesto: ");
        System.out.print(" -> ");
        int codPuesto = Integer.parseInt(s.nextLine());
        if (g.buscarPuesto(codPuesto) == null) {
            g.addPuesto(codPuesto, nombrePuesto);
            System.out.println("    ...Puesto añadido exitosamente...\n");
            System.out.print("---Enter para salir---");
            s.nextLine();
        }else{
            System.out.println("Este puesto ya está asignado!");
            System.out.print("---Enter para salir---");
            s.nextLine();

        }
    }
    
    public static void añadirIncidencia(Scanner s, Gestor g, DateTimeFormatter dtf ){
        g.listarPuestos();
        System.out.println("Indica el problema");
        System.out.print(" -> ");
        String descri = s.nextLine();
        
        System.out.println("Indica la fecha de incidencia(Intro para hoy): ");
        System.out.print(" -> ");
        String fechaS = s.nextLine();
        
        System.out.println("Indica el puesto al que asignarla: ");
        System.out.print(" -> ");
        int pue = Integer.parseInt(s.nextLine()); 
        LocalDate fecha;
        if (fechaS.equals("")) {
            fecha = LocalDate.now();
            g.addIncidencia(descri, pue,fecha);
        }else{
            fecha=LocalDate.parse(fechaS, dtf);
            System.out.println("\nFecha1: "+fecha.format(dtf));
            g.addIncidencia(descri, pue,fecha);
        }
        
        
    }
    
    public static void detalleIncidencia(Scanner s, Gestor g){
        g.listarIncidencias();
        System.out.println("Indica el codigo de la incidencia para ver detalles: ");
        int inci = Integer.parseInt(s.nextLine());
        if (g.buscarInci(inci)==null) {
            System.out.println("No se encuentra esa incidencia");   
        }else{
            g.pintarDetalla(g.buscarInci(inci));
        }
        System.out.print("---Enter para salir---");
        s.nextLine();
    }
    
    public static void resolverIncidencia(Scanner s, Gestor g){
        g.listarIncidencias();
        System.out.println("Indica el codigo de la incidencia: ");
        int elegirInci = Integer.parseInt(s.nextLine());
        if (g.buscarInci(elegirInci)==null) {
            System.out.println("Error, incidencia incorrecta");
            System.out.print("---Enter para salir---");
            s.nextLine();
        } else {
            System.out.println("Indica la descripción de la incidencia");
            String res = s.nextLine();
            g.resorlverIncidencia(res,elegirInci);
        }
    }
}
