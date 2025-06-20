import java.util.Scanner;

public class EjercicioCapicua {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "Ingresa numero para verificar que es capicua");
        scanner.close();

        final var nInvertido = invertirNumero(n);
        final var esCapicua = esCapicua(n, nInvertido);

        System.out.printf("El numero %d es capicua? %b%n", n, esCapicua);

    }

    static int invertirNumero(int n) {
        var aux = n;
        var inverso = 0;

        while (aux != 0) {
            //residuo es constante ya que no se redeclara dentro del bucle
            final var residuo = aux % 10;
            inverso = inverso * 10 + residuo;
            aux /= 10;
        }
        return inverso;
    }

    static boolean esCapicua(int n, int nInvertido) {
        return n == nInvertido;
    }

}
