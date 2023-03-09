/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg5_arrays;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dia, mes, ano;
        boolean diaCorrecto = false;
        boolean mesCorrecto = false;
        boolean anoCorrecto = false;
        
        int[]diasMes={0,31,30,28,31,30,31,30,31,31,30,31,30,31};
        String[]nombreMes={"","enero","febrero","marzo","abril","mayo","junio","julio",
        "agosto","septiembre","octubre","noviembre","diciembre"};
        
         System.out.print("Dime el dia:");
        dia=Integer.parseInt(s.nextLine());
        
        System.out.print("Dime el mes:");
        mes=Integer.parseInt(s.nextLine());
        
        System.out.print("Dime el año:");
        ano=Integer.parseInt(s.nextLine());
        
        if (ano>1900 && ano<3000){
            anoCorrecto=true;
          
        }
        
        //Comprobamos el mes
        if (mes>=1 && mes<=12){
            mesCorrecto=true;
        }
        
        //Comprobamos el dia
        if (dia >=1 && (dia <= diasMes[mes])){
            diaCorrecto=true;
        }
        //Si el año es bisiesto, el dia 29 es válido
        if (Year.of(ano).isLeap() && dia==29){
            diaCorrecto=true;
        }
        
    }
    
}
