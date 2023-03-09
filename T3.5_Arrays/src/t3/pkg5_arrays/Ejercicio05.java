/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;


/**
 *
 * @author ps4an
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] list = {9,8,7,6};
        
        boolean creci=false;
        boolean desce=false;
        
        for(int i = 1 ;i < list.length ;i++){
            if (list[i]>list[i-1]) creci=true;
            if (list[i]<list[i-1]) desce=true;  
        }
        if (creci==true && desce==false) System.out.println("Es creciente");
 
        if (desce==true && creci==false) System.out.println("Es descendiente");
        
        if (desce==true && creci==true) System.out.println("Está desordenada");
        
        
        
        
        
        
        
        
        
    }
    
}
