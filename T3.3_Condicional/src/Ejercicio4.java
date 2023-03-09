
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // int hora;
        LocalTime localTime=LocalTime.now();
        int hora=localTime.getHour();
        
        System.out.print("Indica la hora actual en formato 24h: ");
       // hora=Integer.parseInt(s.nextLine());
        System.out.println("Son las: "+hora);
        if(hora>=6 && hora<=12){
            System.out.println("BUENOS DIAS");
        }else if(hora>=13 && hora<=20){
            System.out.println("BUENAS TARDES");
        }else if((hora>=21 && hora<=24)||(hora<=5 && hora>=0)){
            System.out.println("BUENAS NOCHES");
        }
        
    }
    
}
