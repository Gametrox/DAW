/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instituto;

import java.time.LocalDate;

/**
 *
 * @author ps4an
 */
public class Trabajador extends Persona {
    private LocalDate fecha_inicio;

    public Trabajador(LocalDate fecha_inicio, int ci, String nombre) {
        super(ci, nombre);
        this.fecha_inicio = fecha_inicio;
    }
   
    
    
}
