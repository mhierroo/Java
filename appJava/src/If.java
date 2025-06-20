public class If {
    public static void main(String[] args) {
        var edad = 7;
        var movieClassification = "RP18";
        var isWithAdult = true;

        var isRestricted = movieClassification.contains("R");

        if (!isRestricted) {
            System.out.println("Puedes ver la peli");
        } else if (edad > 17) {
            System.out.println("Puedes ver la peli igual");
        } else if (isWithAdult) {
            System.out.println("Viene con adulto. Puede ver la peli");
        } else {
            System.out.println("No puedes ver la peli");
        }
    }
}
