import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String regex = "((?<countryCode>\\d{1,2})[-,.\\s]?)?((?<areaCode>\\d{3})[-,.\\s]?)((?<exchange>\\d{3})[-,.\\s]?)(?<lineNumber>\\d{4})";
        String phoneNumber = "12.346.532.5347";

        System.out.println(phoneNumber.matches(regex));

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(phoneNumber);

        if(mat.matches()) {
            System.out.format("Country code: %s\n", mat.group("countryCode"));
            System.out.format("Area code: %s\n", mat.group("areaCode"));
            System.out.format("Exchange: %s\n", mat.group("exchange"));
            System.out.format("Line number: %s\n", mat.group("lineNumber"));

        }
    }
}
