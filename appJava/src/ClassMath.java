public class ClassMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-15)); // da el valor absoluto
        System.out.println(Math.ceil(10.0001));  //da el valor superior despues de la ,
        System.out.println(Math.floor(10.9999)); // da el valor inferior despues de la ,
        System.out.println(Math.max(15, 22)); //devuelve el numero de mayor valor
        System.out.println(Math.min(15, 22)); //devuelve el numero de menor valor
        System.out.println(Math.round(17.5)); //Redondea al más cercano

        double random = Math.random();
        System.out.println(random * 100); //para que este entre 1 y 100 random
        System.out.println((int) (random * 100));

    }
}
