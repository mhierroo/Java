public class Comparadores {
    public static void main(String[] args) {
//        var a = 15;
//        var b = 10;
//
//        System.out.println(a == b); //Igual a=b
//        System.out.println(a != b); //Distinto a de b
//        System.out.println(a > b);
//        System.out.println(a >= b);

//        boolean c = true;
//        boolean d = false;
//
//        boolean e = c || d; //or, devuelve si a o b es true
//        boolean f = c && d; //and, devuelve si c y d son iguales
//
//        System.out.println(e);
//        System.out.println(f);
//
//        boolean x = !c;  // transforma c de true a false
//        System.out.println(x);

        boolean isAdult = true;
        boolean isActive = false;
        boolean isPremium = true;
        boolean isOn = true;
        boolean hasFunds = true;

        String cupon = "Tienes un cupón";

        boolean promo = cupon.equals("ultimate_java") || cupon.equals("Tienes un cupón");

        boolean canPurchase = isAdult && isActive && hasFunds;
        System.out.println(promo);
        System.out.println(canPurchase);
    }
}
