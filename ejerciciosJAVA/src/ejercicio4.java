
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        double num;
        System.out.println("ingrese una cantidad de grados centigrados");
        num= leer.nextDouble();
        double f= 32 + (9 * num / 5);
        System.out.println("la respuesta es " +f);
    }
    
}
