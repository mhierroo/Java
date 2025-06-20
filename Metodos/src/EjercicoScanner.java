import java.util.Scanner;

public class EjercicoScanner {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Ingrse su edad: ");
        final var edad = scanner.nextInt();

        System.out.print("Ingrese su estatura: ");
        final var estatura = scanner.nextDouble();

        scanner.close();

        imprimirResultado(edad, estatura);
    }

    static void imprimirResultado(int edad, double estatura) {
        System.out.printf("TU edad es de %d y tu estatura es de %.2f cm%n", edad, estatura);
    }
}
