/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandrocanovasgarcia_examen_estricturada1;

/**
 *
 * @author ps4an
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] cuadrado = new int [10][10];
        
        for (int i = 0; i < 10; i++) {
            int digit = (int)(Math.random()*10);
            cuadrado[i][i]=digit;
            for (int j = 0; j < 10; j++) {
            int digitdos = (int)(Math.random()*10);
               cuadrado[i][j]=digit;
                System.out.print(cuadrado[i][j]);
 
            }
               
            
        }
        
    }
    
}
