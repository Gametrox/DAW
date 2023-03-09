/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ps4an
 */
public class ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bd_Empresa bd = new Bd_Empresa();
        Empresa e = new Empresa("","","");
        ArrayList <Empresa> lista = new ArrayList();
        Empresa a = new Empresa("B12345678","Nike Inc.","Oregon(USA)");
        Empresa b = new Empresa("B00044562","Apple Inc.","California(USA)");
        Empresa c = new Empresa("B11111111","Nitro S.L.","Murcia(SPA)");
        
        bd.addEmpresa(a);
        bd.addEmpresa(b);
        bd.addEmpresa(c);
        
        e = bd.buscarCIF("B00044562");
        if (e!=null) {
            e.imprimir();
        } else {
            System.out.println("Error");
            
        }
        e = bd.buscarCIF("B00000001");
        if (e!=null) {
            e.imprimir();
        } else {
            System.out.println("Error");
        }
        lista = bd.buscarNombre("Ni");
        for (Empresa empresa : lista) {
            empresa.imprimir();
        }
        
        
        
        
        }

    }