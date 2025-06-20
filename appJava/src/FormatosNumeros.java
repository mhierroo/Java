import java.text.NumberFormat;
import java.util.Locale;

public class FormatosNumeros {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("es-AR");
        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance();
        String result = numberFormat.format(1099.9);
        System.out.println(result);

        NumberFormat porcentaje = NumberFormat.getPercentInstance();
        System.out.println(porcentaje.format(0.15));

    }
}
