import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var radio = ScannerManager.leerDouble(scanner, "Introducir radio");
        imprimirConsola();
        final var option = ScannerManager.leerChar(scanner, "Ingrese la opcion");

        if (validarInput(option)) {
            if (option == 'A') {
                mostrarArea(calcularArea(radio));
            } else if (option == 'B') {
                mostrarPerimetro(calcularPerimetro(radio));
            } else if (option == 'C') {
                mostrarArea(calcularArea(radio));
                mostrarPerimetro(calcularPerimetro(radio));
            }
        } else {
            System.out.println("OPCION INCORRECTA");
        }


        scanner.close();
    }

    static void imprimirConsola() {
        System.out.println("A: Calcular área");
        System.out.println("B: Calcular perímetro");
        System.out.println("C: Calcular ambos");
    }

    static boolean validarInput(char option) {
        return (option == 'A') || (option == 'B') || (option == 'C'); //valida que sea A,b o c
    }

    static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    static void mostrarArea(double area) {
        System.out.printf("EL area es %.2f%n", area);
    }

    static void mostrarPerimetro(double perimetro) {
        System.out.printf("El perimetro es %.2%n", perimetro);
    }
}
