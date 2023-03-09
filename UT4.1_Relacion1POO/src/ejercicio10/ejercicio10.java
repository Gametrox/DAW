/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Coche c1 = new Coche( "VOLVO","XC60",140, TipoCombustible.DIESEL, TipoCambio.AUTOMATICO, 19);
        Coche c2;

        System.out.print("Marca: ");
        String marca = s.nextLine();
        System.out.print("Modelo: ");
        String modelo = s.nextLine();
        System.out.print("Caballos: ");
        int cv = Integer.parseInt(s.nextLine());
        
        System.out.print("Tipo de Combustible: ");
        String comb = s.nextLine();
        TipoCombustible tipocomb;

        if (comb.equalsIgnoreCase("diesel")) {
            tipocomb = TipoCombustible.DIESEL;
        }else{
            tipocomb = TipoCombustible.GASOLINA;

        }
        System.out.print("Tipo de Cambio: ");
        TipoCambio tipocamb;
        String camb = s.nextLine();
        if (camb.equalsIgnoreCase("manual")) {
            tipocamb = TipoCambio.MANUAL;
        }else{
            tipocamb = TipoCambio.AUTOMATICO;

        }
        System.out.print("Pulgadas de las ruedas: ");
        int tamRuedas = Integer.parseInt(s.nextLine());
        
        c2 = new Coche(marca,modelo,cv,tipocomb,tipocamb,tamRuedas);
        c2.imprimirFicha();
    }
    
}
