import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números
        System.out.print("Ingresa el primer número: ");
        int A = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int B = scanner.nextInt();

        // Asegurar que A sea menor que B
        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }

        // Calcular la suma del rango usando un bucle for
        int suma = 0;
        for (int i = A; i <= B; i++) {
            suma += i;
        }

        // Mostrar el resultado
        System.out.println("La suma de los números entre " + A + " y " + B + " es: " + suma);

        // Cerrar el Scanner
        scanner.close();
    }
}
