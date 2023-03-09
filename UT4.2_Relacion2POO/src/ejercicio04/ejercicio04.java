/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class ejercicio04 {
    private static Scanner s = new Scanner (System.in);
    private static DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate f;
        Gestor g = new Gestor("Vehiculacion S.L");
        String opcion = " ";
        
        g.addCliente("Alex", "alex@gmail.com", "AV/ eras");
        g.addCliente("Manuel", "manu@gmail.com", "C/Malans");
        g.addCliente("Tortosi", "torto@gmail.com", "R/central");
        
        g.addVehiculo("AABB677", "Citroen", "ZX", 100);
        g.addVehiculo("BBJJ777", "Volvo", "XC60", 45);
        g.addVehiculo("NNMM561", "Peugeot", "C200", 64.4);
        
        g.addAlquiler(1002, "NNMM561", LocalDate.parse("26/02/2023",dft));
        
        do {
            limpiarPantalla();
            pintarMenu(g);
            opcion = s.nextLine();
            switch (opcion) {
                case "1":
                    añadirCliente(g);
                    System.out.println("   (PULSA ENTER PARA CONTINUAR");
                    s.nextLine();
                    break;
                case "2":
                    añadirVehiculo(g);
                    System.out.println("   (PULSA ENTER PARA CONTINUAR");
                    s.nextLine();
                    break;
                case "3":
                    alquilarVehiculo(g);
                    System.out.println("   (PULSA ENTER PARA CONTINUAR");
                    s.nextLine();
                    break;
                case "4":
                    devolver(g);
                    System.out.println("   (PULSA ENTER PARA CONTINUAR");
                    s.nextLine();
                    break;
                case "5":
                    historico(g);
                    System.out.println("   (PULSA ENTER PARA CONTINUAR");
                    s.nextLine();
                    break;
                case "":
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Opción incorrecta, indicalar de nuevo");
                    System.out.println("   (PULSA ENTER PARA CONTINUAR");
                    s.nextLine();
                    break;
            }
        } while (!opcion.equals(""));
        
    
    }
    public static void limpiarPantalla(){
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
    public static void pintarMenu(Gestor g){
        System.out.println("========== "+g.getNombreEmpresa()+" ==========");
        g.listarVehiculos();
        System.out.println("======================================");
        System.out.println("1. Alta cliente");
        System.out.println("2. Alta vehiculo");
        System.out.println("3. Alquilar");
        System.out.println("4. Devolver");
        System.out.println("5. Historico de alquileres");
        System.out.println("Elige una opción: ");
        System.out.print(" (ENTER PARA SALIR) -> ");
        
    }
    public static void añadirCliente(Gestor g){
        System.out.println("Indica el nombre:");
        System.out.print("->");
        String nom = s.nextLine();
        System.out.println("Indica el correo:");
        System.out.print("->");
        String mail = s.nextLine();
        System.out.println("Indique la direccion:");
        System.out.print("->");
        String add = s.nextLine();
        g.addCliente(nom, mail, add);
    }
    public static void añadirVehiculo(Gestor g){
        System.out.println("Indica la matricula del vehiculo:");
        System.out.print("->");
        String mat = s.nextLine();
        System.out.println("Indica la marca:");
        System.out.print("->");
        String marca = s.nextLine();
        System.out.println("Indica el modelo:");
        System.out.print("->");
        String model = s.nextLine();
        System.out.println("Indica precio por dia(Intro para precio por defecto):");
        System.out.print("->");
        String precio = s.nextLine();
        if (precio.equals("")) {
            g.addVehiculoSinPrecio(marca, marca, model);
        }else{
            g.addVehiculo(marca, marca, model, Double.parseDouble(precio));
        }

    }
    public static void alquilarVehiculo(Gestor g){
        System.out.println("========= MENU ALQUILER VEHICULO ==========");
        
        System.out.println("           --- LISTA CLIENTES ---");
        g.listarClientes();
        System.out.println("--------------------------------------------");
        
        System.out.println("Indica el ID del cliente: ");
        System.out.print(" ->");
        String idSinParse = s.nextLine();
        int id = 0;
        if (!idSinParse.equals("")) {
            id = Integer.parseInt(idSinParse);
        }
        System.out.println("        --- VEHICULOS DISPONIBLES ---");
        g.listarVehiculosDisponibles();
        System.out.println("--------------------------------------------");
        
        System.out.println("Indica la matricula del vehiculo: ");
        System.out.print(" ->");
        String matricula = s.nextLine();

        System.out.println("--------------------------------------------");
        System.out.println("Indica la fecha de alquiler(ENTER PARA HOY): ");
        System.out.print(" ->");
        String fecha = s.nextLine();
        LocalDate f;
        if (fecha.equals("")) {
            f = LocalDate.now();
        }else {
            f = LocalDate.parse(fecha,dft);
        }
 
        g.addAlquiler(id, matricula, f);   
                    
    }
    public static void devolver(Gestor g){
        System.out.println("  --- DEVOlVER VEHICULO ---");
        g.listarAlquileres();
        System.out.println("---------------------------");
        System.out.println("Indica el ID del alquiler: ");
        System.out.print("-> ");
        String idSinParse = s.nextLine();
        int id = 0;
        if (!idSinParse.equals("")) {
            id = Integer.parseInt(idSinParse);
        }
        
        
        System.out.println("Indica la fecha de alquiler(ENTER PARA HOY): ");
        System.out.print(" ->");
        String fecha = s.nextLine();
        LocalDate f;
        if (fecha.equals("")) {
            f = LocalDate.now();
        }else {
            f = LocalDate.parse(fecha,dft);
        }
        g.devolverVehiculo(id, f);

    }
    public static void historico(Gestor g){
        System.out.println("        --- Historial Alquileres ---");
        g.listarAlquileres();
        System.out.println("--------------------------------------------");
        System.out.println("Indica la ID para ver detalles: ");
        System.out.print("->");
        int id = Integer.parseInt(s.nextLine());
        g.listarDetallesAlquiler(id);
    }
}
