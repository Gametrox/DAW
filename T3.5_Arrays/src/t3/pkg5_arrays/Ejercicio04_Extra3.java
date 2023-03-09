/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

/**
 *
 * @author ps4an
 */
public class Ejercicio04_Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] teamA = {1,2,3,5};
        int [] teamB = {1,3,5,2};
        char [] teamX = new char [10];
        boolean sonIguales=true;
        
        for(int i=0;i<teamA.length;i++){
           int num = teamA[i];
           teamX[num]='x';
           
           }
        for (int i = 0; i < teamB.length; i++) {
            int num=teamB[i];
           if (teamX[num]!='x'){
               sonIguales=false;
           }
        }
        
        if(sonIguales)System.out.println("Son iguales");
        else System.out.println("No lo son");
         
           
           
            
        
            
        
        
        
        
        
        }
    
    
    }
