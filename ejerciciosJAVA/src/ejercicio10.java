
import java.util.Scanner;

/*
. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial.

/**
 *
 * @author User10
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);{
        int suma=0;
        int limite;
        int num;
        System.out.println("ingrese un limite de numeros");{
        limite=leer.nextInt();
        
        for (int i = 0; i < limite; i++) {
            System.out.println("ingrese numeros");
        num=leer.nextInt();
        suma=suma+num;
        
        }
        System.out.println("el resultado de la suma es "+suma);
       
                
        
             
    }
    
}
}
}