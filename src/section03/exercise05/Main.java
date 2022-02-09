package section03.exercise05;

public class Main {

    public static void main(String[] args) {
        String address = "  12345   Big St.  , Alphabet City,  CA  90210  ".strip();

        String buildingNumber = address.split(" ")[0];
        String street = findStreet(address);
        String city = findCity(address);
        String state = findState(address);
        String postalCode = findPostalCode(address);

        System.out.println(buildingNumber);
        System.out.println(street);
        System.out.println(city);
        System.out.println(state);
        System.out.println(postalCode);
    }

    public static String findStreet(String address) {
        int firstSpace = address.indexOf(" ");
        int firstComma = address.indexOf(",");
        String strippedStreet = address.substring(firstSpace + 1, firstComma).strip();

        return strippedStreet;
    }

    public static String findCity(String address) {
        int firstComma = address.indexOf(",");
        int lastComma = address.lastIndexOf(",");
        String strippedCity = address.substring(firstComma + 1, lastComma).strip();

        return strippedCity;
    }

    public static String findState(String address) {
        int lastComma = address.lastIndexOf(",");
        int lastSpace = address.lastIndexOf(" ");
        String strippedState = address.substring(lastComma + 1, lastSpace).strip();

        return strippedState;
    }

    public static String findPostalCode(String address) {
        int lastSpace = address.lastIndexOf(" ");
        String strippedPostalCode = address.substring(lastSpace + 1);

        return strippedPostalCode;
    }
}
