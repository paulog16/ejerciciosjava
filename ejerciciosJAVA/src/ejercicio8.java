
import java.util.Scanner;
import sun.security.util.Length;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el 
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);{
        String valor;
        System.out.println("ingrese una frase");
        valor= leer.nextLine();
        if (valor.length() ==8 ){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
        
     
        
    }
    
    }
}
