
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 . Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);{
        double  num,raiz;
        
        System.out.println("ingrese un numero entero");
        num=leer.nextInt();
        double doble= (num*2);
        double triple= (num*3);
        raiz= Math.sqrt(num);
        System.out.println("el doble del numero es: " +doble+ "el triple es: " +triple+ "y la raiz es: " +raiz);
        
        
        
    }
    
}
}
