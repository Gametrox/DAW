
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String fraseCifrada = "";
        String frase = "";
        
        int caracter,menu;
        
        System.out.println("---CIFRAR CONTRASEÑAS---");
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Cifrar");
            System.out.println("2. Desencripar");
            System.out.println("3. Cerrar programa");
            menu = Integer.parseInt(s.nextLine());
        
            
            if (menu == 1) {
                System.out.println("Indica la frase a encriptar: ");
                frase = s.nextLine();
                for (int i = 0; i < frase.length(); i++) {
                    caracter=frase.charAt(i)+1;
                    fraseCifrada=fraseCifrada+Character.toString(caracter);
                }

                System.out.println("Frase cifrada-->\033[31m"+fraseCifrada+"\033[30m");
            } else if (menu == 2) {
                System.out.println("Escribe el mensaje cifrado: ");
                fraseCifrada = s.nextLine();
                for (int i = 0; i < fraseCifrada.length(); i++) {
                    caracter = fraseCifrada.charAt(i)-1;
                    frase = frase + Character.toString(caracter);
                }
                System.out.println("Frase desencriptada-->\033[32m"+frase+"\033[30m");
            }
            
           
        
        
    }
    
}
