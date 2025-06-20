public class Metodos {
    public static void main(String[] args) {
        miMetodo("Mario", 25);
        miMetodo("Sheila", 31);

        var resultado = suma(10, 20);
        System.out.println("La suma de los 2 numeros es: " + resultado);

    }

    static void miMetodo(String nombre, int edad) {
        System.out.println("Hola " + nombre + ", tu edad es: " + edad);
    }

    static int suma(int a, int b) {
        return a + b;
    }
}
