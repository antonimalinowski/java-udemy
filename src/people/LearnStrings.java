package people;

public class LearnStrings {
    public static void main(String[] args) {
        String phoneNumber = "  (763)  872 -  6633 ".strip();

        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);
    }

    public static String parseAreaCode(String phoneNumber) {
        int openingBrackets = phoneNumber.indexOf("(");
        int closingBrackets = phoneNumber.indexOf(")");
        String cleanNumber = phoneNumber.substring(openingBrackets + 1, closingBrackets);

        return cleanNumber;
    }

    public static String parseExchange(String phoneNumber) {
        int whiteSpaceId = phoneNumber.indexOf(" ");
        int dashId = phoneNumber.indexOf("-");
        String strippedNumber = phoneNumber.substring(whiteSpaceId + 1, dashId).strip();

        return strippedNumber;
    }

    public static String parseLineNumber(String phoneNumber) {
        int dashId = phoneNumber.indexOf("-");
        String strippedNumber = phoneNumber.substring(dashId + 1).strip();

        return strippedNumber;
    }
}
