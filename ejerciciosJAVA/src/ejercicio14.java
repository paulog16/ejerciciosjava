
import java.util.Scanner;

/*
. Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */

/**
 *
 * @author User10
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        int valor;{
        System.out.println("ingrese una cantidad de euros");{
        valor = leer.nextInt();
        System.out.println("el valor en libras es "+valor*0.86+" euros");
         System.out.println("el valor en libras es "+valor*1.28611+" euros");
          System.out.println("el valor en libras es "+valor*129.852+" euros");
    }
    
}
} }