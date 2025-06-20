import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad:");
        byte number = scanner.nextByte();
        System.out.println("Tu edad es: " + number);
        
    }
}
