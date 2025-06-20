import java.util.Random;
import java.util.Scanner;

public class EjercicioDados1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var numeroJugador = ScannerManager.leerInt(scanner, "Escriba numero jugador entre 1 y 6: ");

        if (validarNumero(numeroJugador)) {
            final var numeroAleatorio = RandomUtilities.generarRandomInt(1, 6, new Random());
        } else
            System.out.println("Numero no válido, intente de nuevo");


        scanner.close();

    }

    static boolean validarNumero(int numeroJugador) {
        return (numeroJugador >= 1) && (numeroJugador <= 6);
    }

    static void mostrarMesnsajeGanador(int numeroJugador, int numeroAleatorio) {
        System.out.println("el numero aleatorio es: " + numeroAleatorio);

        if (numeroJugador == numeroAleatorio) {
            System.out.println("Ganaste!!!");
        } else
            System.out.println("Perdiste!!");
    }
}
