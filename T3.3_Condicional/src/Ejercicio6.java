
import java.util.Scanner;
import java.time.Year;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
            int day,month,year;
            
        System.out.println("Indica la fecha con espacios [D|M|A]: ");
        day=Integer.parseInt(s.next());
        month=Integer.parseInt(s.next());
        year=Integer.parseInt(s.next());
        
        switch (month){
            case 1,3,5,7,8,10,12:
                
                if(day>0 && day<32){
                    System.out.println("El dia es CORRECTO");
                }else{
                    System.out.println("El dia es INCORRECTO");
                }
                System.out.println("El mes es CORRECTO");
            break;                
            case 4,6,9,11:
                if (day>0 && day<31){
                    System.out.println("El dia es CORRECTO");
                }else{
                    System.out.println("El dia es INCORRECTO");
                }
                System.out.println("El mes es CORRECTO");

            break;                
            case 2:
                if (Year.of(year).isLeap()){
                    if (day>0 && day<30){
                        System.out.println("El dia es CORRECTO");
                    }else{
                        System.out.println("El dia es INCORRECTO");
                    }
                    System.out.println("El mes es CORRECTO");

                }else if (day>0 && day<29){
                    System.out.println("El dia es CORRECTO");
                }else{
                    System.out.println("El dia es INCORRECTO");
                }
                System.out.println("El mes es CORRECTO");
            break;
            default:
                System.out.println("el mes es INCORRECTO");
        }
        if(year>=1900 && year<=2500){
            System.out.println("El año es CORRECTO");
        }else{
            System.out.println("El año es INCORRECTO");
        }
                
        

    }
    
}
