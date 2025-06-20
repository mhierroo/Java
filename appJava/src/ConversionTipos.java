public class ConversionTipos {
    public static void main(String[] args) {
        //Conversion implícita
        byte a = 1;
        int b = 15;
        int c = a + b;
        double d = 15.15;
        double e = d + b;

        System.out.println(c);
        System.out.println(e);

        //Conversion explicita
        int x = 22;
        double y = 15.015;
        int z = (int) (x + y);

        System.out.println(z);

        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j) + k; //con la clase Double.parseDouble se covierte de string a double la variable
        System.out.println(l);

    }
}
