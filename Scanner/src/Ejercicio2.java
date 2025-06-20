import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Ingrese edad: ");
        final var edad = scanner.nextInt();


        System.out.print("Ingrese estatura: ");
        final var estatura = scanner.nextDouble();

        scanner.nextLine(); //Limpiar el buffer

        System.out.print("Ingrese su nombre: ");
        final var nombre = scanner.nextLine();

        scanner.close();

        imprimirResultado(nombre, edad, estatura);

    }

    static void imprimirResultado(String nombre, int edad, double estatura) {
        System.out.printf("Mi nombre es %s, Tu edad es %d y tu estatura es %.2f cm", nombre, edad, estatura);
    }
}
