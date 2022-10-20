/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.pkg4_bucles;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
//        int n;
//        
//        System.out.print("Indica el numero: ");
//        n=Integer.parseInt(s.nextLine());
//        
//        for(int i=1;i<=n;i++){
//            System.out.println("==============");
//            System.out.println("Tabla del: "+i);
//                for(int y=1;y<=10;y++){
//                    System.out.println(i+"*"+y+"="+(i*y));
//                }
//            
//        }
        
//FACTORIAL
//        int fact,n;
//        System.out.println("Indica el numero: ");
//        n=Integer.parseInt(s.nextLine());
//        
//        for(int i=0;i<=n;i++)
//            
        
        

//HORA
        int hora=0;
        int min=0;
        
        for(hora=0;hora<=2;hora++){
            for(min=0;min<=59;min++){
                if(min>=0&&min<=9){
                    System.out.println(hora+":0"+min);
                }else{
                    System.out.println(hora+":"+min);
                }
                try{
                    Thread.sleep(1*1000);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                
                if(hora==2 && min==0){
                     break;
                }
            }
        }            
        
        
        
        
        
        
        


    }
}
