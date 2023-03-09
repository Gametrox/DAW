
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
            String user;
            String pass;
        System.out.println("PANTALLA DE ACCESO");
        System.out.println("------------------");
        System.out.print("Indica el usuario: ");
        user = s.nextLine();
        System.out.print("Ahora la contraseña: ");
        pass = s.nextLine();
        
        //Metodo 1, condicion doble
//        if(user.equals("root") && pass.equals("toor")){
//            System.out.println("Has entrado al sistema");
//        }else{
//            System.out.println("Error en el acceso");
//        }
//        
        //Metodo 2, if anidado
//        if(user.equals("root")){
//            if(pass.equals("toor"))
//                System.out.println("Login correcto");
//        }else{
//            System.out.println("Error en el acceso");
//        }
        //Metodo 3, booleano
        boolean userOK = false;
        boolean passOK = false;
        
        if (user.equals("root")){
            userOK=true;
        }
        if (pass.equals("toor")){
            passOK=true;
        }
        
        if(userOK==true && passOK==true){
            System.out.println("Acceso correcto");
        }else if(userOK==false && passOK==true){
            System.out.println("Usuario incorrecto");
        }else if(userOK==true && passOK==false){
            System.out.println("Pass incorrecto");
        }else{
            System.out.println("Acceso denegado");
        }
        
        
        

    }
    
}
