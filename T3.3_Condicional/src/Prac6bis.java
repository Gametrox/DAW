
import java.time.Year;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Prac6bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
            int day, month, year;
        
        System.out.print("Indica la fecha separada por espacios [D|M|A]: ");
        day=Integer.parseInt(s.next());
        month=Integer.parseInt(s.next());
        year=Integer.parseInt(s.next());
        
            boolean dateOK=true;
           

        if (year<=1900 && year>=2500){
            dateOK=false;
            System.out.println("ERROR en el año");
        }else{
            System.out.println("El año es CORRECTO");
        }
        switch (month){
            case 1,3,5,7,8,10,12:
                if(day>0 && day<32){
                    System.out.println("El dia es CORRECTO");
                }else{
                    dateOK=false;
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
                        dateOK=false;
                        System.out.println("El dia es INCORRECTO");
                    }
                    System.out.println("El mes es CORRECTO");

                }else if (day>0 && day<29){
                    System.out.println("El dia es CORRECTO");
                }else{
                    dateOK=false;
                    System.out.println("El dia es INCORRECTO");
                }
                System.out.println("El mes es CORRECTO");
            break;
            default:
                dateOK=false;
                System.out.println("el mes es INCORRECTO");
        }
        if(dateOK=true){
            System.out.println("La fecha es CORRECTA");
        }else{
            System.out.println("La fecha es INCORRECTA");
        }
    }
    
}
