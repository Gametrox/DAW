/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandrocanovas_examen_poo1;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // TODO code application logic here1
        Scanner teclado=new Scanner(System.in);
        int opcion;
        
        
        //================= INICIALIZACION DE DATOS EN CODIGO ===========
        CentroEducativo iesRamonArcas=new CentroEducativo("[IES RAMON ALEX]");
        
        iesRamonArcas.addAlumno("Juan Antonio",18);
        iesRamonArcas.addAlumno("Alicia",17);
        iesRamonArcas.addAlumno("Juanjo",17);
        iesRamonArcas.addAlumno("Almendro",20);
        iesRamonArcas.addAlumno("Jose Juan",21);
        iesRamonArcas.addAlumno("Alvaro",20);
        
        iesRamonArcas.addGrupo("DAW1");
        iesRamonArcas.addGrupo("DAW2");
        
        //================================================================
        
        
         //**********************comienzo del menu ********************
        do{
            System.out.println("");System.out.println("");
            System.out.println("*****************************");
            System.out.println("PROGRAMA MATRICULACION");
            // -- IMPRIMIR EL NOMBRE DEL CENTRO EDUCATIVO AQÚI --
            System.out.println("*****************************");
            System.out.println("1. Listado total del alumno");
            System.out.println("2. Listado total de grupos");
            System.out.println("3. Matricular alumno");
            System.out.println("4. Info detallada alumno");
            System.out.println("5. Salir del sistema");
            
            System.out.print("\nIntroduce una opcion: ");
            opcion=Integer.parseInt(teclado.nextLine());
            
            switch (opcion){
                case 1:
                       System.out.println("\n");
                       iesRamonArcas.listarAlumnos();
                       
                        break;
                case 2:
                        System.out.println("\n");
                        iesRamonArcas.listarGrupos();
                      
                        break;        
                case 3:
                        System.out.print("\nIntroduce ID alumno: ");
                        int idAlumno=Integer.parseInt(teclado.nextLine());
                        System.out.print("Nombre de la clase: ");
                        String nombreGrupo=teclado.nextLine();
                        if (iesRamonArcas.obtenerGrupo(nombreGrupo)==null) {
                            System.out.println("ERROR grupo no encontrado");
                        }else{
                            iesRamonArcas.matricular(iesRamonArcas.obtenerAlumno(idAlumno),
                                    iesRamonArcas.obtenerGrupo(nombreGrupo));
                        }
                        break;
                case 4: 
                        System.out.print("\nIntroduce ID alumno: ");
                        idAlumno=Integer.parseInt(teclado.nextLine());
                        if (iesRamonArcas.obtenerAlumno(idAlumno)==null) {
                            System.out.println("ERROR alumno no encontrado");
                        }else{
                            iesRamonArcas.obtenerAlumno(idAlumno).
                                    imprimirFicha(iesRamonArcas.obtenerAlumno(idAlumno));
                        }
                        
                        break;
                case 5: System.out.println("bye bye");
                        break;
                default:
                        System.out.println("ERROR: opcion incorrecta");
            }
        }while (opcion!=5);
    }
    
}
