import java.util.Scanner;

public class EjercicioCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final var a = ScannerManager.leerInt(scanner, "Ingrese valor de a");
        final var b = ScannerManager.leerInt(scanner, "Ingrese valor de b");

        imprimirMenu();
        final var opcion = ScannerManager.leerChar(scanner, "Ingresar opcion");

        scanner.close();

        ejecutarOpcion(a, b, opcion);

    }

    static void ejecutarOpcion(int a, int b, char opcion) {
        final var resultado = switch (opcion) {
            case 'A', 'a' -> calcularSuma(a, b);
            case 'B', 'b' -> calcularResta(a, b);
            case 'C', 'c' -> calcularProducto(a, b);
            case 'D', 'd' -> calcularDivision(a, b);
            case 'E', 'e' -> calcularResto(a, b);
            default -> -1;
        };

        if (resultado != -1) {
            System.out.printf("El resultado  entre los numeros %d & %d es %d%n", a, b, resultado);
        } else {
            System.out.println("Opcion incorrecta");
        }


    }

    static void imprimirMenu() {
        System.out.println("A/a: sumar");
        System.out.println("B/b: restar");
        System.out.println("C/c: multiplicar");
        System.out.println("D/d: dividir");
        System.out.println("E/e: resto");
    }

    static int calcularSuma(int a, int b) {
        return a + b;
    }

    static int calcularResta(int a, int b) {
        return a - b;
    }

    static int calcularProducto(int a, int b) {
        return a * b;
    }

    static int calcularDivision(int a, int b) {
        return a / b;
    }

    static int calcularResto(int a, int b) {
        return a % b;
    }
}
