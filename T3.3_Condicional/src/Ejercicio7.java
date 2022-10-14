
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num1, num2;
        int operando;
        
        System.out.print("Indica el primer numero: ");
        num1=Integer.parseInt(s.nextLine());
        System.out.print("Indica el segundo numero: ");
        num2=Integer.parseInt(s.nextLine());
        System.out.println("==================================");
        System.out.println("(1)Suma");
        System.out.println("(2)Resta");
        System.out.println("(3)Multiplicacion");
        System.out.println("(4)Division");
        System.out.println("(5)Salir");
        System.out.print("Ahora indica la opcion de calculo: ");
        operando=Integer.parseInt(s.nextLine());
        
        switch (operando){
            case 1:
                double resultado = num1+num2;
                System.out.println("El resultado es: "+resultado);
            break;
            case 2:
                double resultado2 = num1-num2;
                System.out.println("El resultado es: "+resultado2);
            break;
            case 3:
                double resultado3 = num1*num2;
                System.out.println("El resultado es: "+resultado3);
            break;
            case 4:
                double resultado4 = num1/num2;
                System.out.println("El resultado es: "+resultado4);
            break;
            case 5:
                System.out.println("Fin del programa");
             break;
            default:
                System.out.println("OPCION INCORRECTA");
        }

        
        
    }
    
}
