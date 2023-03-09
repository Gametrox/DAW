/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alejandrocanovasgarcia_examen_estricturada1;

/**
 *
 * @author ps4an
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] num = new  int[10];
        int min = 10;
        int suma = 0;
        boolean hayCinco = false;
        
        for (int i = 0; i < num.length; i++) {
            int digit = (int)(Math.random()*9+1);
            num[i]=digit;
            
            if (num[i]==num[0]) {
                System.out.print("|");
            }System.out.print(num[i]+"|");
            if (min>num[i]) {
                min=num[i];
            }
            if (num[i]%2==0) {
                suma=suma+num[i];
            }
            if (num[i]==5) {
                hayCinco=true;
            }
            
        }
        System.out.println("");
        System.out.println("El minimo es: "+min);
        System.out.println("Suma pares: "+suma);
        System.out.print("¿Aparece el 5?: ");
        if (hayCinco==true) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
        
    }
    
}
