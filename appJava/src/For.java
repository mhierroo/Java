public class For {
    public static void main(String[] args) {

        String[] textos = {"Hola Mundo", "User1", "User2"};

        for (int i = 0; i < 5; i++) {
            System.out.println("Hola Mundo " + i);
        }

        System.out.println("Estamos fuera del for");

        int i = 0;

        while (i < 5) {
            System.out.println("Hola Java " + i);
            i++;
        }
        System.out.println("Saliendo del loop");
    }
}
