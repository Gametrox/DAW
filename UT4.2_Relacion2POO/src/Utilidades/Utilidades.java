/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.util.ArrayList;

/**
 *
 * @author ps4an
 */
public class Utilidades {
    private ArrayList <String> codigos = new ArrayList();
    
    public static boolean checkEmail(String email){
        boolean tieneArroba = false;
        boolean estaPerfecto = false;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@') {
                tieneArroba = true;
            } 
            if (tieneArroba == true) {
                if (email.charAt(i)=='.') {
                    estaPerfecto=true;
                }
            }
        }
        
        if (estaPerfecto) {
            return true;
        } else {
            System.out.println("Email incorrecto");
            return false;

        }
        
    };
    public static String generarCodigoLibro(){
        StringBuilder sb = new StringBuilder();
        
        char letra1=(char)((int)(Math.random() * 26 + 65));
        char letra2=(char)((int)(Math.random() * 26 + 65));
        int digito1=(int)(Math.random()*10);
        int digito2=(int)(Math.random()*10);
        int digito3=(int)(Math.random()*10);
        
        sb.append(letra1);
        sb.append(letra2);
        sb.append(digito1);
        sb.append(digito2);
        sb.append(digito3);
        
        String codigo = sb.toString();
        
        return codigo;
    }
}
