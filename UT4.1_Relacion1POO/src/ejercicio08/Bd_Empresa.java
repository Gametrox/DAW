/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

import java.util.ArrayList;

/**
 *
 * @author ps4an
 */
public class Bd_Empresa {
    private ArrayList <Empresa> bd;

    public ArrayList<Empresa> getBD() {
        return bd;
    }

    public void setBD(ArrayList<Empresa> bd) {
        this.bd = bd;
    }

    public Bd_Empresa() {
        bd = new ArrayList<>();
    }
    
    public void addEmpresa(Empresa e){
        bd.add(e);
        
    }
    
    public Empresa buscarCIF(String cif){
        for (Empresa empresa : bd) {
            if (empresa.getCIF().equals(cif)) {
                return empresa;
            }
        }
        return null;
    }
    
    public ArrayList <Empresa> buscarNombre(String nombre){
        ArrayList nombres = new ArrayList();
        for (Empresa empresa : bd) {
            if (empresa.getNombre().startsWith(nombre)) {
                nombres.add(empresa);
            }
        }
        return nombres;
    }
    
}
