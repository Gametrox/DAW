/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class PrintF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String n1="Celia";
        String n2="Juan Jesús";
        
        int e1=23;
        int e2=18;
        
        double a1=1.73;
        double a2=1.7;
        
        System.out.print("Datos de entrada 1: ");
        System.out.printf("%s,%s,%s\n",n1,e1,a1);
        
        System.out.print("Datos de entrada 2: ");
        System.out.printf("%s,%s,%s\n",n2,e2,a2);
        System.out.println("----------------------------------------");
        
        System.out.printf("Nombre: %-15s Edad: %-3d Altura: %.2f\n",n1,e1,a1);
        System.out.printf("Nombre: %-15s Edad: %-3d Altura: %.2f\n",n2,e2,a2);
        
        
        
        
        
    }
    
}
