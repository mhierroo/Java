import java.util.Random;

public class EjercicioOperacionesLogicas {
    public static void main(String[] args) {
        final var random = new Random();

        final var numero = RandomUtilities.generarRandomInt(10, 200, random);

        final var condiciones1 = preguntarCondiciones1(numero);
        final var condiciones2 = preguntarCOndiciones2(numero);

        System.out.printf("El numero %d es par y mayor que 50? %b%n", numero, condiciones1);
        System.out.printf("El numero %d es multiplo de 3 o menor igual que 35? %b%n", numero, condiciones2);

    }

    static boolean preguntarCondiciones1(int numero) {
        return (numero % 2 == 0) && (numero > 50);
    }

    static boolean preguntarCOndiciones2(int numero) {
        return (numero % 3 == 0) || (numero <= 35);
    }
}
