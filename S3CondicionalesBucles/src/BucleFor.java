import java.util.Random;

public class BucleFor {
    public static void main(String[] args) {
        final var numeroAleatorio = RandomUtilities.generarRandomInt(5, 20, new Random());
        mostrarNumero1(numeroAleatorio);
        mostrarNumeros2(numeroAleatorio);
        mostrarNumero3(numeroAleatorio);


    }

    static void mostrarNumero1(int n) {
        for (var i = 1; i < n; i++) {
            System.out.printf("%d", i);
        }
        System.out.println(); // enter en consola para separararlo

    }

    static void mostrarNumeros2(int n) {
        for (var i = 1; i <= n; i++) {
            System.out.printf("%d", i);
        }
        System.out.println();
    }

    static void mostrarNumero3(int n) {
        for (var i = n; i >= 1; i--) {
            System.out.printf("%d", i);
        }
        System.out.println();
    }
}
