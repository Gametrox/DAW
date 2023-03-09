/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

/**
 *
 * @author ps4an
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int [5][5];
        int sumaFil,sumaCol;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz [i][j] = (int)(Math.random()*10);
                System.out.print(" "+matriz[i][j]+" ");
            }
        System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            sumaFil=0;
            for (int j = 0; j < 5; j++) {
                sumaFil = sumaFil+matriz[i][j];
            }
            System.out.println("Suma de fila "+(i+1)+"-> "+sumaFil);
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            sumaCol = 0;
            for (int j = 0; j < 5; j++) {
                sumaCol = sumaCol + matriz[i][j];
            }
        System.out.println("Suma de columna "+(i+1)+"-> "+sumaCol);
        }
    }
    
}

















