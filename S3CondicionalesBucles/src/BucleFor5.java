import java.util.Random;

public class BucleFor5 {
    public static void main(String[] args) {
        final var random = RandomUtilities.generarRandomInt(2, 10, new Random());
        System.out.printf("El valor aleatorio es %d%n", random);

        final var factorial = calcularFactorial(random);
        imprimirResultado(random, factorial);


    }

    static int calcularFactorial(int n) {
        var factorial = 1;
        for (var i = 1; i <= n; i++) {
            factorial *= i; //acumulo producto
        }

        return factorial;
    }

    static void imprimirResultado(int n, int factorial) {
        System.out.printf("El factorial de %d es %d%n", n, factorial);
    }
}
