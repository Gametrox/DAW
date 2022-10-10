/**
 *
 * @author alejandro.canovas
 */
public class TipoDatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //**************************************************************************************
        // Tipos numéricos
        
        int unEntero=5; //tipo de número entero corto
        System.out.println("Tipo unentero:"+unEntero);
        
        long unLong=192993; //tipo de número entero largo
        System.out.println("Tipo entero largo "+unLong);
        
        float unfloat=3.14f; //Caracter tipo numero pero con decimales "IMPORTANTE PONER LA 'F' AL FINAL"
        System.out.println("Valor float "+unfloat);
        
        double undouble=3.14151633;
        System.out.println("Valor con decimales pero más preciso "+undouble);
        System.out.printf("Valor de y double :%.3f\n\n",undouble);
        
        
        //**************************************************************************************
        // Cadenas y caracteres
        String cadena="Bajo esta cadena de caracteres pongo mi nombre:";//String se usa con la S mayúscula y se usa para cadenas de texto
        System.out.println(cadena);      
            char letra1='A';//char es para caracter unitario y se usa '' en lugar de ""
            char letra2='L';
            char letra3='E';
            char letra4='X';
        
        System.out.println("Mi nombre es "+letra1+letra2+letra3+letra4+"\n\n");
        
        //**************************************************************************************
        // Booleanos (True or False)
        
        boolean esCorrecto=true;
        boolean esFalso=false;
        
        System.out.println(esCorrecto);
        System.out.println(esFalso+"\n\n");
        
       
        //**************************************************************************************
        // Operaciones aritméticas básicas (Suma, resta, multiplicación, división...)
                
        int x=8;
        int y=6;
        int z=0;
        int resultado;
        
        // Al poner la variable resultado varias veces, conseguimos que con cada operación, se cambie su resultado para la siguiente línea
        resultado=x+y;
        System.out.println("Resultado de sumar x e y es:"+resultado);

        resultado=x*y;
        System.out.println("Resultado de multiplicar x e y es:"+resultado);

        resultado=(x+y-3)*2;
        System.out.println("Resultado de (x+y-3)*2 es:"+resultado);

        resultado=x+y*3;
        System.out.println("Resultado de x+y*3 es:"+resultado);
        
        double resultado2=x/y;
        System.out.println("Resultado de la división entre x/y es: "+resultado2);
        
        resultado2=(double)x/y;
        System.out.printf("Resultado de la división entre x/y es: %.3f\n",resultado2);
        
                //System.out.println("Division entre cero"+y/z); ***Divisiónentre 0 que da error***
        
        //**************************************************************************************
        // 
        
    }
    
}
