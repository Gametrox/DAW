/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg7_funciones;

import java.time.Year;
import java.util.Scanner;
import static t3.pkg7_funciones.Ejercicio03.esCorrecta;

/**
 *
 * @author ps4an
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String month = "";
        int dia = 0;
        int mes = 0;
        int ano = 0;
        
        System.out.print("Indica una fecha separada de la siguiente manera DD/MM/AA : ");
        month = s.nextLine();
        String [] fecha = month.split("/");
        dia = Integer.parseInt(fecha[0]);
        mes = Integer.parseInt(fecha[1]);
        ano = Integer.parseInt(fecha[2]);
        
        if (esCorrecta(dia, mes, ano)==1) System.out.println("\033[31mDIA INCORRECTO");
        else if (esCorrecta(dia, mes, ano)==2) System.out.println("\033[31mMES INCORRECTO");
        else if (esCorrecta(dia, mes, ano)==3) System.out.println("\033[31mAÑO INCORRECTO");
        else if (esCorrecta(dia, mes, ano)==0) System.out.println(fechaCorrecta(dia, mes, ano));
        
        
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
    public static String fechaCorrecta(int day, int month, int year){
            String fechaExtendida = "";
            String [] meses = {
                "","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
            
            fechaExtendida = String.format("\033[32m%d de %s del %d",day,meses[month],year);
            return fechaExtendida;

    
        
    }


}
