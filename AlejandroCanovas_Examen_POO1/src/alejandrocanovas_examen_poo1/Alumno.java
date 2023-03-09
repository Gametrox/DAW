/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alejandrocanovas_examen_poo1;

/**
 *
 * @author ps4an
 */
public class Alumno {
    private static int contador = 100;
    private int id;
    private String nombre;
    private int edad;
    private boolean matriculado;
    private Grupo grupo;

    public Alumno(String nombre, int edad) {
        contador++;
        this.nombre = nombre;
        this.edad = edad;
        this.id = contador;
        this.grupo = null;
        this.matriculado = false;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Alumno.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

       

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    public void imprimirFicha(Alumno a){
        System.out.println("==== FICHA DEL ALUMNO ====");
        System.out.println("ID: "+this.id);
        System.out.println("NOMBRE: "+this.nombre);
        System.out.println("EDAD: "+this.edad);
        if (matriculado==false) System.out.println("CLASE: SIN MATRICULAR");
        else System.out.println("CLASE: "+this.grupo.getNombre());
        System.out.println("==========================");
    }
    public String aCadena(){
        if (this.matriculado==true) {
            String cadena = String.format("ID: %d - %s - %s",
                    this.id,
                    this.nombre,
                    this.grupo.getNombre()
              );
            return cadena;
        }
        String cadena = String.format("ID: %d - %s - SIN MATRICULAR",
                this.id,
                this.nombre
          );
        return cadena; 
        }
                  

}
    

