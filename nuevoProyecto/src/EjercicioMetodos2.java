import java.util.Random;

public class EjercicioMetodos2 {
    public static void main(String[] args) {
        final var random = new Random();

        final var velocidadInicial = RandomUtilities.generarRandomDouble(10, 20, random);
        final var aceleracion = RandomUtilities.generarRandomDouble(2, 2, random);
        final var tiempo = RandomUtilities.generarRandomInt(3, 5, random);

        final var velocidadFinal = calcularVelocidadFinal(velocidadInicial, aceleracion, tiempo);

        imprimirResultado(velocidadInicial, aceleracion, tiempo, velocidadFinal);

    }

    static double calcularVelocidadFinal(double velocidadInicial, double aceleracion, int tiempo) {
        return velocidadInicial + aceleracion * tiempo;
    }

    static void imprimirResultado(double velocidadInicial, double aceleracion, int tiempo, double velocidadFinal) {
        System.out.printf("Para una velocidad inicial de %.3f, una aceleracion de %.3f y un tiempo de %d " +
                        "tenemos una velociadad final de %.3f usando MRUV",
                velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }
}
