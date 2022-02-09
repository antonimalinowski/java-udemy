import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String regex = """
# This is my regex to parse the parts of a phone number
((?<countryCode>\\d{1,2})[-,.\\s]?)? # Get's country code
(\\(?(?<areaCode>\\d{3})\\)?[-,.\\s]?) # Get's area code
((?<exchange>\\d{3})[-,.\\s]?) # Get's exchange
(?<lineNumber>\\d{4}) # Get's line number
""";
        String phoneNumber = "(231) 333-2538";

//        System.out.println(phoneNumber.matches(regex));

        Pattern pat = Pattern.compile(regex, Pattern.COMMENTS);
        Matcher mat = pat.matcher(phoneNumber);

        if(mat.matches()) {
            System.out.format("Country code: %s\n", mat.group("countryCode"));
            System.out.format("Area code: %s\n", mat.group("areaCode"));
            System.out.format("Exchange: %s\n", mat.group("exchange"));
            System.out.format("Line number: %s\n", mat.group("lineNumber"));

        }
    }
}
