import java.util.Scanner;

public class EjercicioScanner2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        final var nombre = scanner.nextLine();

        System.out.println("Ingresa tu edad: ");
        final var edad = scanner.nextInt();

        System.out.println("Ingresa tu estatura: ");
        final var estatura = scanner.nextDouble();

        scanner.close();

        imprimirResultado(nombre, edad, estatura);

    }

    static void imprimirResultado(String nombre, int edad, double estatura) {
        System.out.printf("Mi nombre es %s, tengo %d y mido %.2f cm%n", nombre, edad, estatura);
    }
}
