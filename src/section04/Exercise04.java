package section04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise04 {
    public static void main(String[] args) {
        String address = "Prosta St. 30, 04-789 Brzegi, Poland";

        String regex = "(?<streetName>\\w+\\s\\w+\\W?)\\s(?<streetNum>\\d+).*?(?<postalCode>\\d{2}\\s?-\\s?\\d{3})\\s(?<city>\\w+).*?(?<country>\\w+)\\b";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(address);

        mat.find();
        System.out.println(mat.group("streetName"));
        System.out.println(mat.group("streetNum"));
        System.out.println(mat.group("postalCode"));
        System.out.println(mat.group("city"));
        System.out.println(mat.group("country"));

    }
}