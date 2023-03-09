/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

/**
 *
 * @author ps4an
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [][] notas = {{5,6,7,0},{4,2,7,0},{6,8,9,0},{10,8,9,0},{4,2,4,0}};
        String [] alumnos = {"Juan", "Celia", "Alfredo", "Maria", "Pedro"};
        double suma = 0;
        int [] suspensos = new int [3];
        int cont=0;
        
        
        //CALCULAR MEDIA
        
        //Filas de la tabla: 5   notas.length
        //Columans de la tabla: 4    notas[0].length
        
        
        for (int i = 0; i < notas.length; i++) {  //FILAS
            suma = 0;
            for (int j = 0; j < notas[0].length-1;j++) {   //COLUMNAS
                suma = suma+notas[i][j];
            }
            notas[i][3] = suma/3;
        }
        //Calcular suspensos. Recorremos por columnas
        for (int j = 0; j < notas[0].length-1; j++) {
            cont = 0;
            for (int i = 0; i < notas.length; i++) {
               if (notas[i][j]<5) {
                   cont++;
                  
                } 
            }
            suspensos[j] = cont ;
            
        }
        //Calcular el mayor
        double mayor = 0;
        String nmayor = "";
        for (int i = 0; i < notas.length; i++) {
            
            for (int j = 0; j < notas[0].length; j++) {
                if (notas[i][3]>mayor) {
                    mayor=notas[i][3];
                    nmayor=alumnos[i];
                }
            }
            
        }
        //IMPRIMIR
        System.out.println("ALUMNOS    EVA1  EVA2  EVA3  MEDIA");
        System.out.println("-----------------------------------");
        for (int i = 0; i <5; i++) {
            System.out.printf("%-11s",alumnos[i]);
            
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-6.1f",notas[i][j]);
                
            }
            System.out.println(" ");
        }
        
        System.out.println("-----------------------------------");
        System.out.print("Suspensos: ");
        for (int i = 0; i < suspensos.length; i++) {
             System.out.printf("%-7d",suspensos[i]);
        }
        System.out.println("\n\n");
        System.out.println("La nota mayor es: "+nmayor+" con una nota de: "+mayor);
        
    }
    
}
