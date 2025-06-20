import java.util.Scanner;

public class MetodosScannerMaanger {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Ingrse su edad: ");
        final var edad = ScannerManager.leerInt(scanner, "Ingrese su edad: ");

        System.out.print("Ingrese su estatura: ");
        final var estatura = ScannerManager.leerDouble(scanner, "Ingrese su estatura: ");

        scanner.close();

        imprimirResultado(edad, estatura);
    }

    static void imprimirResultado(int edad, double estatura) {
        System.out.printf("TU edad es de %d y tu estatura es de %.2f cm%n", edad, estatura);
    }
}
