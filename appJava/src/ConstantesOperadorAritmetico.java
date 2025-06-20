public class ConstantesOperadorAritmetico {
    public static void main(String[] args) {
        final String empresa = "Hola Mundo!";  //para definir constantes se le añade el final delante del string
        System.out.println(empresa);

        int a = 2 + 2;
        int b = 2 - 2;
        int c = 3 * 3;
        int m = 4 % 3; // te indica cuántas veces entra el 3 en 4
        float d = 10f / 3f; // con la letra f se le indica que es flotante y nos dará los decimales despues de la ,
        double w = 10.0 / 3.0;

        System.out.println(m);
        System.out.println(d);
        System.out.println(w);

        int x = 5;
        int y = x++;
        //++x por delante de la x primero suma el valor de 1 antes de imprimir en consola
        //x++ por detrás de la x imprime el valor y luego suma por lo que no se mostrará diferencia si se imprime
//
        System.out.println(x);
        System.out.println(y);

    }
}
