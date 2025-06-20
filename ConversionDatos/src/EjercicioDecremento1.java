import java.util.Random;
import java.util.Scanner;

public class EjercicioDecremento1 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        var numero = ScannerManager.leerInt(scanner, "Ingresar numero");

        scanner.close();

        //decrementamos en 1
        numero--;

        System.out.printf("El valor del numero es : %d%n", numero);

        final var n = RandomUtilities.generarRandomInt(3, 10, new Random());

        //decremento en n
        numero -= n;

        System.out.printf("El valor del numero es %d%n", numero);
    }
}
