
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Indica el dia: ");
        int dia=Integer.parseInt(s.nextLine());
        
        switch (dia){
            case 1:System.out.println("Lunes");
                   System.out.println("Hay programación");
            break;
            
            case 2:System.out.println("Martes");
                   System.out.println("Hay programación");
            break;
            
            case 3:System.out.println("Miercoles");
            break;
            
            case 4:System.out.println("Jueves");
                   System.out.println("Hay programación");

            break;
            
            case 5:System.out.println("Viernes");
                   System.out.println("Hay programación");

            break;
            
            case 6:System.out.println("Sabado");
            break;
            
            case 7:System.out.println("Domingo");
            break;
            
            default: System.out.println("ERROR: dia incorrecto");
                
          
    }

    }
    
}
