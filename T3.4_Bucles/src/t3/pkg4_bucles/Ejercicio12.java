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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            String mail;
            boolean arroba = false;
            boolean punto = false;
            int posArroba = 0;
            int posPunto = 0;
            
        System.out.print("---Pulsa (ENTER) para cerrar---\nIndica tu correo electrónico: ");
        mail = s.nextLine();

        
        do{
            for (int i = 0; i < mail.length(); i++) {
                if (mail.charAt(i) == '@') {
                    arroba = true;
                    posArroba = i;
                }
                //COMPROBAMOS SI ES UN PUNTO Y GUARDAMOS SU POSICION EN LA CADENA
                if (mail.charAt(i) == ('.')) {
                        punto = true;
                        posPunto = i;
                }
            }
            //COMPROBAR QUE EL ARROBA ESTA ANTES DEL PUNTO
            if (arroba==true && punto==true && posArroba<posPunto) {
                System.out.println("Correo electrónico correcto");
            } else {
                System.out.println("ERROR Orden incorrecto");
            }
            if(arroba==false){
                System.out.println("ERROR Falta [@]");
            }
            if(punto==false){
                System.out.println("ERROR Falta [.]");
            }
            System.out.print("---Pulsa (ENTER) para cerrar---\nIndica tu correo electrónico: ");
            mail = s.nextLine();
            
            //Reseteo de cibtadores y booleanos
            arroba = false;
            punto = false;
            posArroba = 0;
            posPunto = 0;
        }while(!mail.equals(""));
    }
}
