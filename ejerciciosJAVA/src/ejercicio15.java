
import java.util.Arrays;
import java.util.Scanner;

/*
. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente.
 */

/**
 *
 * @author User10
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    int [] arreglo= new int[100];
   
        for (int i = 0; i <100; i++) {
arreglo[i]= i+1;
      }
        for (int i = arreglo.length-1; i>= 0; i--) {
            System.out.println(arreglo[+i]);
            
        }
        }
    }


