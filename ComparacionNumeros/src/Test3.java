public class Test3 {
    public static void main(String[] args) {
        int[] numero = {10, 20, 30, 40};

        System.out.println(numero[1]);
        System.out.println(numero[3]);

        //Para usar los arrays por bucle

        int[] numeros = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en indice " + i + ": " + numeros[i]);

        }

        for (int num : numeros) {
            System.out.println("Numero: " + num);
        }

    }

}
