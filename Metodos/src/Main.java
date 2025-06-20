import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final var random = new Random();

        final var randomInt = RandomUtilities.generarRandomInt(20, 100, random);
        final var randomDouble = RandomUtilities.generarRandomDouble(25, 50, random);

        System.out.printf("El valor de randomInt es %d%n", randomInt);
        System.out.printf("El valor de randomDouble es %.2f%n", randomDouble);
    }
}