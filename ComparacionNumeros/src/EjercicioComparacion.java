public class EjercicioComparacion {
    public static void main(String[] args) {
        final var a = 10;
        final var b = -30;

        final var aEsnegativo = esNegativo(a); //boolean
        final var bEsnegativo = esNegativo(b);

        imprimirResultado(a, aEsnegativo);
        imprimirResultado(b, bEsnegativo);

    }

    static boolean esNegativo(int numero) {
        return numero < 0;
    }

    static void imprimirResultado(int numero, boolean esNegativo) {
        System.out.printf("El numero %d es negativo? %b%n", numero, esNegativo);
    }
}
