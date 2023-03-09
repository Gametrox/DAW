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
public class Ejercicio04_Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int [] teamA = {4,5,6,7};
        int [] teamB = {4,5,6,7};
        boolean esIgual=false;
        boolean esDesigual=false;
        
        for(int i=0;i<teamA.length;i++){
           if(teamA[i]==teamB[i]){
               esIgual=true;
            }else{
                esDesigual=true;
            }
 
        }
        if(esDesigual==true){
            System.out.println("NO SON IGUALES");
        }else{
            System.out.println("SI SON IGUALES");
            
        }
        


    }
    
}
