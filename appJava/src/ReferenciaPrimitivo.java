import java.awt.*;

public class ReferenciaPrimitivo {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = point1;
        point2.x = 15;

        System.out.println(point1);

        String a = new String("Hola Mundo");
        String b = a;
        String c = a.toUpperCase();

        System.out.println(a);
        System.out.println(c);


    }

}
