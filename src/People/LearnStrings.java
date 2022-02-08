package People;

public class LearnStrings {
    public static void main(String[] args) {
        String phoneNumber = "(234) 333-5551";

        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);
    }

    public static String parseAreaCode(String phoneNumber) {
        return phoneNumber.substring(1, 4);
    }

    public static String parseExchange(String phoneNumber) {
        String strippedNumber = phoneNumber.substring(phoneNumber.indexOf(" "), phoneNumber.indexOf("-")).strip();
        return strippedNumber;
    }

    public static String parseLineNumber(String phoneNumber) {
        String strippedNumber = phoneNumber.substring(phoneNumber.indexOf("-")).strip();
        return strippedNumber.replace("-", "");
    }
}
