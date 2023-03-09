/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        String [] alumnos = {"Francisco","Marcos","Laura","Marta","Pedro"};
        double []primerTrim = {7,8,4,5,6};
        double []segundoTrim = {4,9,10,5,5};
        double []tercerTrim = {1,10,8,2,3};
        
        double mediaAlumno;
        double sumaPrimerTrim = 0;
        double sumaSegundoTrim = 0;
        double sumaTercerTrim = 0;
        int posicion;
        
        System.out.println("Listado de alumnos");
        System.out.println("******************");
        for (int i = 1; i < alumnos.length+1; i++) {
            System.out.printf("%d. %s\n",i,alumnos[i-1]);
        }
        System.out.print("Dime la posición del alumno a buscar: ");
        posicion = Integer.parseInt(s.nextLine());
         
        mediaAlumno = (primerTrim[posicion-1] + segundoTrim[posicion-1] + tercerTrim[posicion-1]) / 3;
        System.out.println("\n\n---------- media del alumno ----------\n");
        System.out.printf("La media de %s es %.2f",alumnos[posicion],mediaAlumno);
        
        System.out.println("\n\n---------- medias del grupo ----------\n");
        for (int i = 0; i < primerTrim.length; i++) {
             sumaPrimerTrim = sumaPrimerTrim + primerTrim[i];   
             sumaSegundoTrim = sumaSegundoTrim + segundoTrim[i];
             sumaTercerTrim = sumaTercerTrim + tercerTrim[i];   
        }
         System.out.println("La media del primer trimestre de todo el grupo es: "+(sumaPrimerTrim / (primerTrim.length)));
         System.out.println("La media del segundo trimestre de todo el grupo es: "+(sumaSegundoTrim / (segundoTrim.length)));
         System.out.println("La media del tercer trimestre de todo el grupo es: "+(sumaTercerTrim / (tercerTrim.length)));
         
     
        
    }
    
}
