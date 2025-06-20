import java.util.Scanner;

public class EjercicioKca {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var diasemana = ScannerManager.leerString(scanner, "Ingrese día de la semana");
        scanner.close();

        imprimirResultado(diasemana, calcularKca(DiaSemana.valueOf(diasemana)));
    }

    static int calcularKca(DiaSemana diaSemana) {
        return switch (diaSemana) {
            case LUNES -> 350;
            case MARTES -> 420;
            case MIERCOLES -> 220;
            case JUEVES -> 600;
            case VIERNES -> 125;
            case SABADO -> 250;
            case DOMINGO -> 100;
        };
    }

    static void imprimirResultado(String diaSemana, int kca) {
        System.out.printf("Para el día de la %s se tienen una %dkca%n", diaSemana, kca);
    }

    enum DiaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO,
    }
}
