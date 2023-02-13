
import java.util.Locale;
import java.util.Scanner;

public class ejercicio11_2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opciones = 0;
        boolean condicion = false;

        do {
            System.out.println("MENU");
            System.out.println("1-SUMA");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-SALIR");

            System.out.println("elija una opcion");

            opciones = leer.nextInt();
            switch (opciones) {
                case 1:
                    suma();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    condicion = salir();
                    break;
                default:
                    System.out.println("ingrese una opcion correcta");
            }

        } while (opciones != 5 || condicion);
        System.out.println("EL PROGRAMA A FINALIZADO");
    }

    private static void suma() {
        Scanner leer = new Scanner(System.in);

        System.out.println("OPERACION DE SUMA");
        System.out.println("INGRESE EL PRIMER NUMERO");
        int num1 = leer.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        int num2 = leer.nextInt();
        int resultado = num1 + num2;

        System.out.println("el resultado es:" + resultado);
    }

    private static void restar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("OPERACION DE RESTA");
        System.out.println("INGRESE EL PRIMER NUMERO");
        int num1 = leer.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        int num2 = leer.nextInt();
        int resultado = num1 - num2;

        System.out.println("el resultado es:" + resultado);
    }

    private static void multiplicar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("OPERACION DE MULTIPLICACION");
        System.out.println("INGRESE EL PRIMER NUMERO");
        int num1 = leer.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        int num2 = leer.nextInt();
        int resultado = num1 * num2;

        System.out.println("el resultado es:" + resultado);
    }

    private static void dividir() {
        Scanner leer = new Scanner(System.in);
        System.out.println("OPERACION DE DIVIDIR");
        System.out.println("INGRESE EL PRIMER NUMERO");
        int num1 = leer.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        int num2 = leer.nextInt();
        int resultado = num1 / num2;

        System.out.println("el resultado es:" + resultado);
    }

    private static boolean salir() {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Está seguro que desea salir del programa (S/N)? ");
        String afirmacion = leer.next().toUpperCase();

        return afirmacion.equals("N");

    }

}
