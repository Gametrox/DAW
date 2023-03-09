/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandrocanovasgarcia_examen_finalord1_partea;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int [] lista = new int[5];
        int num = 0;
        
        
            do {
            pintarMenu();
            num = Integer.parseInt(s.nextLine());
            
            switch (num) {
                case 1:
                    menuPotencia(s);
                    break;
                case 2:
                    media_array(lista,s);
                    break;
                case 3:
                    System.out.println("Indica un numero en binario para pasarlo a decimal: ");
                    String entrada = s.nextLine();
                    System.out.println("El número "+ entrada+" en binario es: "+binario_to_decimal(entrada));
                    break;
                case 4:
                    System.out.print("Indica un numero para saber si es capicua: ");
                    String numc = s.nextLine();
                    esCapicua(numc);
                    break;
                default:
                    System.out.println("Numero incorrecto");
                    System.out.println("Indicalo de nuevo:");
                    break;
            }
            
        } while (num!=5);

    }
    public static void pintarMenu(){
        System.out.println("Calculos matematicas");
        System.out.println("=========================");
        System.out.println("1. Potencia");
        System.out.println("2. Media de un vector");
        System.out.println("3. Binario a decimal");
        System.out.println("4. Capicua");
        System.out.println("5. Salir");
        System.out.println("Elige una opción: ");
    }
    public static void menuPotencia(Scanner s){
        System.out.println("Calculo Potencia");
        System.out.print("Indica la base: ");
        double base = Double.parseDouble(s.nextLine());
        System.out.print("Indica el exponente: ");
        double exp = Double.parseDouble(s.nextLine());
        System.out.println("El resultado es: "+potencia(base,exp));
    }
    public static double potencia(double base, double exponente){
        double resultado = base;
        if (exponente == 0) {
            resultado = 1;
        } else if (exponente < 0){
            exponente = exponente*-1;
            for (int i = 1; i < exponente; i++) {
                resultado = resultado * base;
            }
            resultado = 1/resultado;
            return resultado;
        
        }else{
            for (int i = 1; i < exponente; i++) {
                resultado = resultado * base;
            }
        }
        return resultado;
        
    }
    public static void media_array(int[]lista, Scanner s){
        double suma = 0;
        int contador = 0;
        int num = 0;
        for (int i = 0; i < lista.length; i++) {
            
            System.out.println("Indica el numero de la posicion "+(i+1)+"(-1 para salir): ");
            num = Integer.parseInt(s.nextLine());
            
            if (num==-1) {
                break;
            } else{
                lista[i] = num;
                suma = suma + lista[i];
                contador++;
            }
            
            
            
        }
        suma = suma/contador;
        System.out.printf("La media es: %.2f\n\n",suma);
    }
    public static double binario_to_decimal(String binario){
        int decimal = 0;
        int pos = 0;
        for (int i = binario.length() - 1; i >= 0; i--) {
        int digito = 1;
            if (binario.charAt(i) == '0') {
                digito = 0;
            }
         double multi = Math.pow(2, pos);
         decimal += digito * multi;
         pos++;
        }
        return decimal;

    }
    public static boolean esCapicua(String num){
        return false;
    }
    
    
}
