import java.util.Scanner;

public class FibonacciEjemplo {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "Ingrese cantidad numeros serie fibonacci");
        scanner.close();

        mostrarSerieFIbonacci(n);

    }

    static void mostrarSerieFIbonacci(int n) {
        //declarando los primeros numeros
        var anterior = 0;
        var actual = 1;

        //Mostrando los 2 primeros numeros
        System.out.printf("%d %d ", anterior, actual);

        //mostrando los siguientes
        for (var i = 0; i < n - 2; i++) {
            final var temp = anterior + actual;
            anterior = actual;
            actual = temp;
            System.out.printf("%d ", actual);
        }
    }
}
