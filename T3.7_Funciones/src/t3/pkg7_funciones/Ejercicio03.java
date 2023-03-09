/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg7_funciones;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        

        System.out.println("Indica la fecha con espacios [D|M|A]: ");
       
        int day=Integer.parseInt(s.next());
        int month=Integer.parseInt(s.next());
        int year=Integer.parseInt(s.next());
        
        if (esCorrecta(day, month, year)==0) System.out.println("\033[32mLa fecha es correcta");
        if (esCorrecta(day, month, year)==1) System.out.println("\033[31mDIA INCORRECTO");
        if (esCorrecta(day, month, year)==2) System.out.println("\033[31mMES INCORRECTO");
        if (esCorrecta(day, month, year)==3) System.out.println("\033[31mAÑO INCORRECTO");
        
       
        }
    public static int esCorrecta(int day, int month,int year){
        
        
        if (year < 2500 && year>1500) {
            switch (month){
                case 1,3,5,7,8,10,12:

                    if(day>0 && day<32)
                        return 0;
                    else{
                        return 1;
                    }
                case 4,6,9,11:
                    if (day>0 && day<31){
                        return 0;
                    }else{
                        return 1;
                    }

                case 2:
                    if (Year.of(year).isLeap()){
                        if (day>0 && day<30){
                        return 0;
                        }else{
                        return 1;
                        }

                    }else if (day>0 && day<29){
                        return 0;
                    }else{
                        return 1;
                    }
                   default:
                       return 2;
            }
        }
        return 3;
        
        
        
    }
    
}
