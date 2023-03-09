/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

/**
 *
 * @author ps4an
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] num = new int [3][6];
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;
        
        System.out.println("Esta matriz tiene "+num.length+" filas.");
        System.out.println("Esta matriz tiene "+num[0].length+" colunnas.\n\n");
        
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                System.out.print(" "+num[fila][columna]+" ");    
            }
        System.out.println("");
        }
     
    
    
    
    }  
}    
