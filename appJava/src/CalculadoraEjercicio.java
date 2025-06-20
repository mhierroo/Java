import java.util.Scanner;

public class CalculadoraEjercicio {
    public static void main(String[] args) {
        /**
         *Crear calculadora que reciba 2 numeros y luego imprima el resultado de la
         * suma de estos 2 numeros
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Esta es una aplicacion de calculadora");
        System.out.println("Ingrese el primer numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int numero3 = scanner.nextInt();

        int suma = numero1 + numero2 + numero3;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println(numero1 + numero2);

    }
}
