/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class ejercicio05 {
        public static Scanner s = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco b = new Banco("AlexTransfer");
        b.nuevoCliente("19923F","Alejandro","Canovas","Garcia","alex@gmail.com");
        b.nuevoCliente("47771R","Joselito","Pericales","Palotines","josep@gmail.com");
        b.nuevaCuenta(b.buscarPersona("19923F"),2333.11);
        b.nuevaCuenta(b.buscarPersona("47771R"),59);
        b.nuevaCuenta(b.buscarPersona("47771R"),8001.42);
        
        String opcionPr = "";
        String opcionSc = "";
        
        do{
            menuPrincipal(b);
            opcionPr = s.nextLine();
            
            switch (opcionPr) {
                case "1":
                        nuevoCliente(b);
                    break;
                case "2":
                    System.out.println("Indica el DNI para ver: ");
                    String  dni = s.nextLine();
                    do{
                        menuSecundario(b,dni);
                        opcionSc = s.nextLine();
                        switch (opcionSc) {
                            case "1":
                                crearCuenta(b,dni);
                                break;
                            case "2":
                                ingreso(b,dni);
                                break;
                            case "3":
                                reintegro(b,dni);
                                break;
                            case "4":
                                transferenica(b,dni);
                                break;
                            case "5":
                                System.out.println("Volviendo...");
                                break;
                            default:
                                System.out.println("Opción incorrecta, indica de nuevo");
                                break;
                        }
                        
                    }while(!opcionSc.equalsIgnoreCase("5"));
                    break;
                case "3":
                    listarCuentas(b);
                    break;
                case "4":
                    listarClientes(b);
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta, indica de nuevo");
                    break;
            }
        }while(!opcionPr.equals("5"));
        
        
    }
    public static void limpiarPantalla(){
        for (int i = 0; i < 30; i++) {
            System.out.println("\n\n\n");
        }
    }
    
    public static void menuPrincipal(Banco b){
        System.out.println("---  BANCO "+b.getNombre()+" ---");
        System.out.println("1. Nuevo cliente");
        System.out.println("2. Seleccionar cliente");
        System.out.println("3. Listar Cuentas");
        System.out.println("4. Listar Clientes");
        System.out.println("5. Salir");
        System.out.print("Elige opción -> ");
    }
    public static void menuSecundario(Banco b, String dni){
        System.out.println("--- MENU CLIENTE ---");
        b.buscarPersona(dni).pintarDetalles();
        b.listarCuentasPersona(b.buscarPersona(dni));
        System.out.println("********************");
        System.out.println("1. Abrir cuenta");
        System.out.println("2. Ingreso");
        System.out.println("3. Reintegro");
        System.out.println("4. Transferencia");
        System.out.println("5. Volver");
        System.out.print("Elige opción -> ");
    }
    public static void nuevoCliente(Banco b){
        System.out.println("--- CREANDO CLIENTE ---");
        System.out.println("Indica el DNI: ");
        String dni = s.nextLine();
        System.out.println("Indica el nombre: ");
        String nombre = s.nextLine();
        System.out.println("Indica el primer apellido: ");
        String ap1 = s.nextLine();
        System.out.println("Indica el segundo apellido: ");
        String ap2 = s.nextLine();
        System.out.println("Indica el correo: ");
        String mail = s.nextLine();
        b.nuevoCliente(dni, nombre, ap1, ap2, mail);
        System.out.println("Se ha creado el cliente "+nombre+" exitosamente.");
    }
    public static void listarCuentas(Banco b){
        System.out.println("---------Listado de cuentas---------");
        b.listarCuentas();
        System.out.println("------------------------------------");
    }
    public static void listarClientes(Banco b){
        System.out.println("---Listado de clientes---");
        b.listarClientes();
        System.out.println("-------------------------");
    }
    public static void crearCuenta(Banco b, String dni){
        System.out.println("--- Creando cuenta ---");
        System.out.println("Indica la cantidad con la que será creada: ");
        double cantidad = Double.parseDouble(s.nextLine());
        b.nuevaCuenta(b.buscarPersona(dni), cantidad);
        System.out.println("Cuenta creada con exito...");
    }
    public static void ingreso(Banco b,String dni){
        System.out.println("Indica el id de la cuenta: ");
        int id = Integer.parseInt(s.nextLine());
        if (b.buscarcuenta(id)!=null) {
            System.out.println("Indica la cantidad a ingresar €€€: ");
            double ingresar = Double.parseDouble(s.nextLine());
            b.buscarcuenta(id).ingreso(ingresar);
        } else {
            System.out.println("No se encuentra la cuenta");
        }
        
    }
    public static void reintegro(Banco b, String dni){
        System.out.println("Indica el ID de la cuenta:");
        int id = Integer.parseInt(s.nextLine());
        if(b.buscarcuenta(id) != null){
            System.out.println("Indica la cantidad a retirar: ");
            double cantidad = Double.parseDouble(s.nextLine());
            if (b.buscarcuenta(id).reintegro(cantidad)) {
                b.buscarcuenta(id).reintegro(cantidad);
            }else {
                System.out.println("No tienes tanto dinero macareno");
            }
        } else {
            System.out.println("No se encuentra esa cuenta");
        }
    }
    public static void transferenica(Banco b, String dni){
        while(true){
            System.out.println("Indicar ID cuenta origen: ");
            int idOrigen = Integer.parseInt(s.nextLine());
            if (b.buscarcuenta(idOrigen)==null) { 
                System.out.println("No se encuentra esa cuenta");
                break;
            }
            
            System.out.println("Indicar ID cuenta destino: ");
            int idDestino = Integer.parseInt(s.nextLine());
            if (b.buscarcuenta(idDestino)==null) { 
                System.out.println("No se encuentra esa cuenta");
                break;
            }
            System.out.println("Indica la cantidad a transferir: ");
            System.out.println("(Dispones de ["+b.buscarcuenta(idOrigen).getSaldo()+"€])");
            System.out.print(" -> ");
            double cantidad = Double.parseDouble(s.nextLine());
            if (b.buscarcuenta(idOrigen).transferencia(b.buscarcuenta(idDestino), cantidad)==true) {
                System.out.println("Transferencia realizada");
                break;
            }else{
                System.out.println("No dispones de tanto money");
                break;
            }

        }
        
        
    }
}
