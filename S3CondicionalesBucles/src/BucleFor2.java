import java.util.Random;

public class BucleFor2 {
    public static void main(String[] args) {
        final var n = RandomUtilities.generarRandomInt(15, 100, new Random());

        final var contador1 = contarValores1(n);
        final var contador2 = contarValores2(n);
        final var contador3 = contarValores3(n);

        System.out.printf("1er contador: %d%n", contador1);
        System.out.printf("2do contador: %d%n", contador2);
        System.out.printf("3er contador: %d%n", contador3);

    }

    static int contarValores1(int n) {
        var contador = 0;
        for (var i = 1; i < n; i++) { //secuencia
            if (i % 2 == 0) { //filtro pares
                contador++; //cuento cuantos valores de la iteracion cumplen la condicion
            }
        }
        return contador;
    }

    static int contarValores2(int n) {
        var contador = 0;
        for (var i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }
        return contador;
    }

    static int contarValores3(int n) {
        var contador = 0;

        for (var i = 1; i <= n; i++) {
            if (i % 10 == 0) { // Filtro para ver todos los multiplos de 10
                contador++;
            }
        }

        return contador;
    }
}
