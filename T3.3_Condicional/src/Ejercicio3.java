
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ps4an
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double nota1, nota2,nota3;
        System.out.print("Indica la primera nota: ");
        nota1 = Double.parseDouble(s.nextLine());
        System.out.print("Indica la segunda nota: ");
        nota2 = Double.parseDouble(s.nextLine());
        System.out.print("Indica la tercera nota: ");
        nota3 = Double.parseDouble(s.nextLine());
        
        double media = ((nota1*0.30)+(nota2*0.30)+(nota3*0.40));
        System.out.println("Tu nota media es: "+media);
        if (media==0){
            System.out.println("Nota no valida");
        }else if(media>10){
              System.out.println("Nota no valida");
        }else if(media<5){
            System.out.println("Suspenso");
        }else if(media>=5 && media <6){
            System.out.println("Suficiente");
        }else if(media>=6 && media <7){
            System.out.println("BIEN");
        }else if(media>=7 && media <8){
            System.out.println("NOTABLE");
        }else if(media>=8 && media <9){
            System.out.println("SOBRESALIENTE");
        }else if(media>=9 && media<10){
            System.out.println("SOBRESALIENTE");
        }else if(media==10){
            System.out.println("MATRICULA DE HONOR");
        }



    }
    
}
