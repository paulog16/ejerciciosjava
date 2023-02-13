
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
public class ejercicio6 {

    /**
      Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);{
        int num;
    System.out.println("ingrese un numero");
        num=leer.nextInt();
        if( num%2==0){
            System.out.println("es par");
            
        }else
            System.out.println("es impar");
        
    }
    
}
}