import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Ingrese edad: ");
        final var edad = scanner.nextInt();

        System.out.printf("Ingrese estatura: ");
        final var estatura = scanner.nextDouble();

        scanner.close();

        imprimirResultado(edad, estatura);

    }

    static void imprimirResultado(int edad, double estatura) {
        System.out.printf("Tu edad es %d y tu estatura es %.2f cm", edad, estatura);
    }
}
