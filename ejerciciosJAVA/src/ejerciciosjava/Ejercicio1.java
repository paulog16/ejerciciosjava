/* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma
*/
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author User10
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer= new Scanner(System.in); {
   int num1 ;
   int num2 ;
   
            System.out.println("ingrese 2 numeros");
            num1= leer.nextInt();
            num2= leer.nextInt();
            int suma= (num1 + num2);
            System.out.println("el resultado es: " +suma );
   
}
}
}
