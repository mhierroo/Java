public class Arrays {
    public static void main(String[] args) {

        int[] numeros = {15, 25, 35, 55};

        int max = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        for (int num : numeros) {
            System.out.println("Número: " + num);
        }

        System.out.println("El mayor numero es: " + max);
    }
}



