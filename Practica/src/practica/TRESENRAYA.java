/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class TRESENRAYA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [][] bidi = {{"*","A","B","C"},{"1"," "," "," "},{"2"," "," "," "},{"3"," "," "," "}};
        
        System.out.println("EJERCICIO TRES EN RAYA:");
        System.out.println("=======================");
            int turno = selector();
            int contador;

        do  {
            contador = 0;
            
            juego(bidi,turno);
            if (turno==1) turno++;
            else turno--;
            for (int i = 0; i < bidi.length; i++) {
                for (int j = 0; j < bidi[i].length; j++) {
                    if (bidi[i][j].equals("X") || bidi[i][j].equals("O")) {
                        contador++;
                        if (contador == 9) {
                            System.out.println("EMPATE");
                            break;
                        }
                    }
                }
            }
            
        } while(!ganar(bidi,turno) && contador < 9);
        

    }
    public static int selector(){
        Scanner s = new Scanner(System.in);
        System.out.println("JUGADOR 1, CARA O CRUZ");
        String jug1 = s.nextLine();  
        String jug2 = "";
        jug1 = jug1.toLowerCase();

        if (jug1.equals("cara")) {
            System.out.println("JUGADOR 2, TE TOCA CRUZ");
            jug2 = "cruz";
        } else {
            System.out.println("JUGADOR 2, TE TOCA CARA");
            jug2 = "cara";
        }
        System.out.println("Comienza el giro de la moneda:");
        int numero = 0;
    String[] faces = {" / ", " \\ "};
    for (int i = 0; i < 10; i++) {
      for (String face : faces) {
        System.out.print("\r" + face);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
    System.out.print("\r   ");
  
        System.out.println("");
        int random = (int)(Math.random()*2);
        String [] moneda = {"cara","cruz"};
        System.out.println("Ha salido "+moneda[random]);
        try {
                    Thread.sleep(1*1000);
                } 
            catch (Exception e){
                    System.out.println(e);
                }
        if (jug1.equals("cara") && jug2.equals("cruz") && moneda[random].equals("cara")) {
            System.out.println("Sale el jugador 1");
            numero = 1;
            return numero;
        }
        else if (jug1.equals("cruz") && jug2.equals("cara") && moneda[random].equals("cruz")) {
            System.out.println("Sale el jugador 1");
            numero = 1;
            return numero;
        }
        else if (jug1.equals("cruz") && jug2.equals("cara") && moneda[random].equals("cara")) {
            System.out.println("Sale el jugador 2");
            numero = 2;
            return numero;
        }
        else  {
            System.out.println("Sale el jugador 2");
            numero = 2;
            return numero;
        }
        
    }
    public static void juego(String [][]tablero, int comienza){
        Scanner s = new Scanner (System.in);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(" " + tablero[i][j] + " |");
            }
        System.out.println();
        System.out.println("----------------");
        }
        System.out.println("Jugador "+comienza+ " indica la fila y la columna");
        System.out.print("Ingresa la fila: ");
        int fila = Integer.parseInt(s.nextLine());
        int columna = 0;
        System.out.print("Ingresa la columna: ");
        String entrada = s.nextLine();
        entrada = entrada.toUpperCase();
        if (entrada.equals("A"))columna = 1;
        else if (entrada.equals("B"))columna = 2;
        else if (entrada.equals("C"))columna = 3;
        if (jugadaValida(tablero,fila,columna)==true){
            if (comienza==1 ) {
                tablero[fila][columna] = "X";
            } else {
                tablero[fila][columna] = "O";
            }
        } else {
            System.out.println("\033[31mUBICACIÓN ERRONEA, SALTO DE TURNO\033[0m");
        }
         
        
    }
    public static boolean jugadaValida(String[][]tablero,int fila, int columna){
        if (fila>=1 && fila<=3 && columna>=1 && columna<=3 && !tablero[fila][columna].equals("X") && !tablero[fila][columna].equals("O")) {
            return true;
        } else {
            return false;
        }
        
    } 
    public static boolean ganar(String[][]tablero, int jugador){
         if (tablero[1][1].equals("X") && tablero[1][2].equals("X") && tablero[1][3].equals("X")||
                    tablero[2][1].equals("X") && tablero[2][2].equals("X") && tablero[2][3].equals("X")||
                    tablero[3][1].equals("X") && tablero[3][2].equals("X") && tablero[3][3].equals("X")||
                    tablero[1][1].equals("X") && tablero[2][1].equals("X") && tablero[3][1].equals("X")||
                    tablero[1][2].equals("X") && tablero[2][2].equals("X") && tablero[3][2].equals("X")||
                    tablero[1][3].equals("X") && tablero[2][3].equals("X") && tablero[3][3].equals("X")||
                    tablero[1][1].equals("X") && tablero[2][2].equals("X") && tablero[3][3].equals("X")||
                    tablero[1][3].equals("X") && tablero[2][2].equals("X") && tablero[3][1].equals("X")) {
                    for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                           System.out.print(" " + tablero[i][j] + " |");
                       }
                    System.out.println();
                    System.out.println("----------------");
                   }
                System.out.println("\033[32mHa ganado el Jugador 1\033[0m");
                return true;
            }else if (tablero[1][1].equals("O") && tablero[1][2].equals("O") && tablero[1][3].equals("O")||
                    tablero[2][1].equals("O") && tablero[2][2].equals("O") && tablero[2][3].equals("O")||
                    tablero[3][1].equals("O") && tablero[3][2].equals("O") && tablero[3][3].equals("O")||
                    tablero[1][1].equals("O") && tablero[2][1].equals("O") && tablero[3][1].equals("O")||
                    tablero[1][2].equals("O") && tablero[2][2].equals("O") && tablero[3][2].equals("O")||
                    tablero[1][3].equals("O") && tablero[2][3].equals("O") && tablero[3][3].equals("O")||
                    tablero[1][1].equals("O") && tablero[2][2].equals("O") && tablero[3][3].equals("O")||
                    tablero[1][3].equals("O") && tablero[2][2].equals("O") && tablero[3][1].equals("O")) {
                    for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                           System.out.print(" " + tablero[i][j] + " |");
                       }
                        System.out.println();
                        System.out.println("----------------");
                    }
                    System.out.println("\033[32mHa ganado el Jugador 2\033[0m");
                return true;
            } 
        
           return false;
} 
    
    
}
