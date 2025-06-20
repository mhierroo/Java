import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        terminal:
        while (true) {
            System.out.println("Ingresa una opción: ");
            System.out.println("1. Calculadora");
            System.out.println("2. Nasa");
            System.out.println("3. Salir");

            input = scanner.next().toLowerCase();

            switch (input) {
                case "1":
                    System.out.println("Ingrese un numero: ");
                    int a = scanner.nextInt();
                    System.out.println("Ingrese segundo numero: ");
                    int b = scanner.nextInt();
                    System.out.println("El resultado es: ");
                    System.out.println(a + b);
                    break;
                case "2":
                    System.out.println("Nasa es lo mejor ");
                    System.out.println("#");
                    System.out.println("##");
                    System.out.println("###");
                    System.out.println("#####");
                    break;
                case "3":
                    System.out.println("Saliendo del mundo");
                    break terminal;

            }
        }
    }
}
