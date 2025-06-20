import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var montoInicial = ScannerManager.leerDouble(scanner, "Ingresar monto inicial");
        scanner.close();

        imprimirResultado(montoInicial, calcularMonto(montoInicial));

    }

    static double calcularMonto(double montoInicial) {
        final var aumento1 = (montoInicial % 2 == 0) ? montoInicial * 0.1 : 0; //sies par se le aumenta el 10%
        final var aumento2 = (montoInicial % 3 == 0) ? 500 : 0; // si es multiplo de 3 se le aumenta 500
        final var aumento3 = (montoInicial > 500) ? 300 : 0; // si es mayor que 500 se le suma 300
        return aumento3 + aumento2 + aumento1;
    }

    static void imprimirResultado(double montoInicial, double montoFInal) {
        System.out.printf("Para el prestamo inicial %.2f se le cobrara un monto final de %.2f", montoInicial, montoFInal);
    }
}
