
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User10
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scan.nextInt();

        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(10);
        }

        System.out.print("Ingrese el número a buscar: ");
        int num = scan.nextInt();

        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                System.out.println("Se encontró el número en la posición " + (i + 1));
                cont++;
            }
        }

        if (cont == 0) {
            System.out.println("No se encontró el número en el vector.");
        } else if (cont == 1) {
            System.out.println("El número se encontró una sola vez en el vector.");
        } else {
            System.out.println("El número se encontró " + cont + " veces en el vector.");
        }
    }
}
/*. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido*/
