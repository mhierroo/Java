import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        final var min = 20;
        final var max = 100;
        final var random = new Random();

        final var radio = random.nextInt(max - min + 1) + min;
        final var area = Math.PI * Math.pow(radio, 2);
        final var perimetro = 2 * Math.PI * radio;

        System.out.printf("Para un radio de %d se tiene un perimetro de %.3f y un area de %.3f%n", radio, perimetro, area);


        final var cateto1 = (max - min) * random.nextDouble() + min;
        final var cateto2 = (max - min) * random.nextDouble() + min;

        var hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.printf("Para los catettos %.3f y %.3f tenemos una hipotenusa de %.3f%n", cateto1, cateto1, hipotenusa);


    }
}
