import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        stringToDouble("$54,505.34");

    }

    public static void stringToDouble (String newString) {

        double newNumber = Double.parseDouble(newString.replaceAll("[$,]",""));
        newNumber += 45.23;
        System.out.println(newNumber);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf.format(newNumber));

    }

}
