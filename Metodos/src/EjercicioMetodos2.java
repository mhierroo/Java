import java.util.Random;

public class EjercicioMetodos2 {
    public static void main(String[] args) {
        Random random = new Random();

        final var velocidadIni = RandomUtilities.generarRandomDouble(10, 30, random);
        final var aceleracion = RandomUtilities.generarRandomDouble(2, 5, random);
        final var tiempo = RandomUtilities.generarRandomInt(3, 5, random);

        final var velocidadFinal = calcularVelocidadFinal(velocidadIni, aceleracion, tiempo);
        imprimirResultado(velocidadIni, aceleracion, tiempo, velocidadFinal);

    }

    static double calcularVelocidadFinal(double velocidadIni, double aceleracion, int tiempo) {
        return velocidadIni + aceleracion * tiempo;
    }

    static void imprimirResultado(double velocidadIni, double aceleracion, int tiempo, double velocidadFinal) {
        System.out.printf("Para una velocidad inicial de %.3f, una aceleracion de %.3f y un tiempo de %d " +
                "se tiene una velocidad final de %.3f", velocidadIni, aceleracion, tiempo, velocidadFinal);
    }
}
