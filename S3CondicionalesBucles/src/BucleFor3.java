import java.util.Random;

public class BucleFor3 {
    public static void main(String[] args) {
        Random random = new Random();
        final int n = RandomUtilities.generarRandomInt(10, 15, random); // Asumiendo que 'RandomUtilities' es una clase válida para generar números aleatorios en ese rango.
        System.out.printf("El numero aleatorio es: %d%n", n);

        final int suma1 = calcularSuma(n);
        final int suma2 = calcularSuma2(n);
        final int suma3 = calcularSuma3(n);

        System.out.printf("suma1: %d%n", suma1);
        System.out.printf("suma2: %d%n", suma2);
        System.out.printf("suma3: %d%n", suma3);
    }

    static int calcularSuma(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    static int calcularSuma2(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++) { // Corregido para incluir números pares hasta n
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    static int calcularSuma3(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) { // Corregido para incluir múltiplos de 5 hasta n
            if (i % 5 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
