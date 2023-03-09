
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio6bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            int day,month,year;
            
            boolean esOK=true;
            
            System.out.print("Indica el dia: ");
            day=Integer.parseInt(s.nextLine());
            
            System.out.print("Indica el mes: ");
            month=Integer.parseInt(s.nextLine());
            
            System.out.print("Indica el año: ");
            year=Integer.parseInt(s.nextLine());
            //PRIMERO COMPROBAMOS QUE LOS DIAS ESTAN DENTRO DE LOS MESES ESTABLECIDOS
            if (day<0 && day>31){
                esOK=false;
            }else if(month<0 && month>12){
                esOK=false;
            }else if(year<1900 && year>2500){
                esOK=false;
            }else{
                esOK=true;
            }
            
            if(esOK==false){
                System.out.println("La fecha es incorrecta");
            }else if (esOK==true){
            System.out.printf("La fecha es: %d/%d/%d\n",day,month,year);
            }
            
            
           
            
            
            
    }
            
        

    }

