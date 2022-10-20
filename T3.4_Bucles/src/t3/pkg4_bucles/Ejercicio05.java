/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg4_bucles;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
          int numpos=0;
          int numneg=0;
          int numcer=0;
          
          System.out.print("Indica la cantidad de numeros: ");
          int cantnum=Integer.parseInt(s.nextLine());
          for(int i=0;i<cantnum;i++){
              System.out.print("Dime un número: ");
              int num=Integer.parseInt(s.nextLine());
              
              if(num>0){
                  numpos++;
              }
              if(num<0){
                  numneg++;
              }
              if(num==0){
                  numcer++;
              }
              
          }
          System.out.println("Numeros mayores que 0: "+numpos);
          System.out.println("Numeros menores que 0: "+numneg);
          System.out.println("Numeros iguales que 0: "+numcer);
          
          

    }
    
}
