import java.util.Random;

public class EjercicioTest {
    public static void main(String[] args) {
        final var random = new Random();

        final var masa = RandomUtilities.generarRandomDouble(24, 50, random);
        final var aceleracion = RandomUtilities.generarRandomDouble(3, 5, random);

        final var fuerza = calcularFuerza(masa, aceleracion);
        imprimirResultado(masa, aceleracion, fuerza);

    }

    static double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion;
    }

    static void imprimirResultado(double masa, double aceleracion, double fuerza) {
        System.out.printf("Para una masa de %.3f y aceleracion de %.3f se tieen fuerza de %.3f",
                masa, aceleracion, fuerza);
    }

}
