/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;


/**
 *
 * @author ps4an
 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private double altura;
    private double peso;
    private double imc;
    
    //Constructor
    public Persona(){
        
    }

    public Persona(String nombre, int edad, String dni, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
        this.imc = this.calcularIMC();
    }
    
    
    public Persona(Persona p){
        this.nombre = p.getNombre();
        this.edad = p.getEdad();
        this.dni = p.getDni();
        this.altura = p.getEdad();
        this.peso = p.getPeso();
        
    
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
        
    }

    public void setEdad(int edad) {
        //COMPROBAR QUE LA EDAD SEA CORRECTA
        if (edad <= 0) {
            System.out.println("Error, edad errónea");
        } else {
            this.edad = edad;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        this.imc = this.calcularIMC();

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.imc = this.calcularIMC();

    }

    public double getImc() {
        return imc;
    }

    
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("DNI: "+ this.dni);
        System.out.println("Altura: "+ this.altura);
        System.out.println("Peso: "+ this.peso);
        System.out.printf("IMC: %.2f\n",this.imc);
    }
    
    private double calcularIMC(){
        double imc = this.peso/(this.altura*this.altura);
        return imc;
    }
    
    
}
