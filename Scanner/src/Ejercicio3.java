import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var edad = ScannerManager.leerInt(scanner, "Ingrese su edad");

        final var estatura = ScannerManager.leerDouble(scanner, "Ingrese su estatura");

        scanner.nextLine(); //Limpiar el buffer

        final var nombre = ScannerManager.leerString(scanner, "Ingrese su nombre");

        scanner.close();

        imprimirResultado(nombre, edad, estatura);

    }

    static void imprimirResultado(String nombre, int edad, double estatura) {
        System.out.printf("Mi nombre es %s, Tu edad es %d y tu estatura es %.2f cm", nombre, edad, estatura);
    }
}
