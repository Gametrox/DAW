
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String nombre, apellido1, apellido2;
        
        System.out.println("Indica tu nombre: ");
        nombre=s.nextLine();
        System.out.println("Indica tu primer apellido: ");
        apellido1=s.nextLine();
        System.out.println("Indica tu segundo apellido: ");
        apellido2=s.nextLine();
        
        if(nombre.indexOf(' ')!=-1){
            char iniN1=nombre.charAt(0);
            int positBlanc=nombre.indexOf(' ');
            char iniN2=nombre.charAt(positBlanc+1);
            char iniAP=apellido1.charAt(0);
            char iniAP2=apellido2.charAt(0);
            System.out.println(""+iniN1+iniN2+iniAP+iniAP2);

        } else {
            char iniN1=nombre.charAt(0);
            char iniAP=apellido1.charAt(0);
            char iniAP2=apellido2.charAt(0);
            System.out.println(""+iniN1+iniAP+iniAP2);
        }

    }
    
}
