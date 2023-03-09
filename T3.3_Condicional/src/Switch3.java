
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Switch3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
        String color;
        int edad;
        System.out.print("Indica el color del semaforo con Verde, Rojo y Ambar: ");
        color=s.nextLine();
        
        switch (color){
            case "Verde": System.out.println("Puedes pasar");
            break;
            
            case"Ambar": System.out.print("Indica tu edad: ");
                edad=Integer.parseInt(s.nextLine());
                if(edad>20){
                    System.out.println("Acelera y pasa");
                }else{
                    System.out.println("Eres menor, para!!");
                }
            break;
            
            case "Rojo": System.out.println("STOP");
            break;
            
            default: System.out.println("Indica un color correcto");
            break;
          
    }

    }
        
        
    }
    
