import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        //pedir al usuario un numero
        System.out.print("Ingresa un numero entero: ");
        int numero = scanner.nextInt();

        //determinar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero " + " es par");
        } else {
            System.out.println("El numero " + " es impar");
        }

        scanner.close();

    }

    static void imprimirResultado(int numero1, int numero2) {
        System.out.println("El numero es %d");
        ;
    }
}
