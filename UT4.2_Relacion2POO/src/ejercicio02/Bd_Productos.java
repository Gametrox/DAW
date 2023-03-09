/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author ps4an
 */
public class Bd_Productos {
    private ArrayList<Producto> bd = new ArrayList();

    public Bd_Productos() {
        
    }

    public ArrayList<Producto> getBd() {
        return bd;
    }

    public void setBd(ArrayList<Producto> bd) {
        this.bd = bd;
    }
    
    public void add(String descripcion, double precio){
        Producto p = new Producto(descripcion,precio);
        bd.add(p);
        
    }
    
    public Producto buscar(String ref){
        for (Producto producto : bd) {
            if (producto.getRef().equalsIgnoreCase(ref)) {
                return producto;
            }
        }
    return null;
    }
    
    public void listarProducto(){
        for (Producto producto : bd) {
            System.out.println(producto.aCadena());
        }
    }
}
