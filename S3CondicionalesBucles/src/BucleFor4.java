import java.util.Random;

public class BucleFor4 {
    public static void main(String[] args) {
        final var n = RandomUtilities.generarRandomInt(5, 20, new Random());
        System.out.printf("Valor de variable random %d%n", n);

        final var promedio = calcularPromedio(n);
        imprimirResultado(n, promedio);

    }

    static int calcularPromedio(int n) {
        var suma = 0;
        for (var i = 1; i <= n; i++) {
            suma += i;
        }
        return suma / n;
    }

    static void imprimirResultado(int n, int promedio) {
        System.out.printf("Para un valor de %d y se tiene un valor promedio de %d%n", n, promedio);
    }
}
