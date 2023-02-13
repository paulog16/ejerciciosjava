import java.util.Locale;
import java.util.Scanner;


public class ejercicio12_ {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux , aux1, aux2, correcta, incorrecta;
        correcta=0;
        incorrecta=0;
        aux1=0;
        aux2=0;
        String cadena;
        
        System.out.println("ingrese una cadena de 5 caracters");
        System.out.println("el primer caracter tiene que ser x y la ultima una o:");
        
        System.out.println("ingrese una cadena de caracteres correcta");
        cadena = leer.nextLine();
        
      while(!cadena.equals("&&&&&")){
          int longitud = cadena.length();
          
          if( cadena.substring(0,1).equalsIgnoreCase("x") && (cadena.endsWith("o")) && (longitud==5)){
              correcta++;
              
          }else{
              incorrecta++;
          }
          System.out.println("ingrese una cadena de caracteres correcta");
          cadena = leer.nextLine();
          
          
      }
      System.out.println(" cadenas correctas:"+correcta);
      System.out.println("cadena incorrecta:"+incorrecta);     
    }
    
}
