import java.util.Random;

public class EjercicioMetodo4 {
    public static void main(String[] args) {
        Random random = new Random();

        final var radio = RandomUtilities.generarRandomInt(10, 25, random);
        final var area = calcularArea(radio);
        final var perimetro = calcularPerimetro(radio);
        imprimirResultado(radio, area, perimetro);


    }

    static double calcularArea(int radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    static double calcularPerimetro(int radio) {
        return Math.PI * radio;
    }


    static void imprimirResultado(int radio, double area, double perimetro) {
        System.out.printf("Para un radio de %d se tiene un perímetro de %.3f y un area de %.3f", radio, area, perimetro);
    }
}
