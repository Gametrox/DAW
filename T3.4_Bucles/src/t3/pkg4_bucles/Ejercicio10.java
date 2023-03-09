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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
        double num1, num2;
        int operando;
        String default1=("Indica el primer numero: ");
        String default2=("Indica el segundo numero: ");
        
        do{
            System.out.println("===========CALCULADORA===========");
            System.out.println("(1)Suma");
            System.out.println("(2)Resta");
            System.out.println("(3)Multiplicacion");
            System.out.println("(4)Division");
            System.out.println("(5)Salir");
        do{
            System.out.print("Indica la opcion de cálculo: ");
            operando=Integer.parseInt(s.nextLine());
        }while(operando<1 || operando>5);
        
            switch (operando){
                case 1:
                    System.out.print(default1);
                    num1=Integer.parseInt(s.nextLine());
                    System.out.print(default2);
                    num2=Integer.parseInt(s.nextLine());
                    double resultado = num1+num2;
                    System.out.println("El resultado es: "+resultado);
                break;
                case 2:
                    System.out.print(default1);
                    num1=Integer.parseInt(s.nextLine());
                    System.out.print(default2);
                    num2=Integer.parseInt(s.nextLine());
                    double resultado2 = num1-num2;
                    System.out.println("El resultado es: "+resultado2);
                break;
                case 3:
                    System.out.print(default1);
                    num1=Integer.parseInt(s.nextLine());
                    System.out.print(default2);
                    num2=Integer.parseInt(s.nextLine());
                    double resultado3 = num1*num2;
                    System.out.println("El resultado es: "+resultado3);
                break;
                case 4:
                    System.out.print(default1);
                    num1=Integer.parseInt(s.nextLine());
                    System.out.print(default2);
                    num2=Integer.parseInt(s.nextLine());
                    double resultado4 = num1/num2;
                    System.out.println("El resultado es: "+resultado4);
                break;
                case 5:
                    System.out.println("---===Fin del programa===---");
                 break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }        


        }while(operando!=5);
    }
    
}
