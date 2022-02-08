package People;

public class LearnStrings {
    public static void main(String[] args) {
        String text = "apple";

        // Different ways to concatenate String
        String firstPart = text.substring(0, 1);
        String secondPart = text.substring(1);
        String capitalFirstLetter = firstPart.toUpperCase();
        int capacity = capitalFirstLetter.length() + secondPart.length();

//        String newText = text.substring(0, 1).toUpperCase() + text.substring(1);

//        String newText = capitalFirstLetter.concat(secondPart);

//        String newText = new StringBuilder(capacity)
//                .append(capitalFirstLetter)
//                .append(secondPart)
//                .toString();

        System.out.format("%s", capitalFirstLetter + secondPart);

//        System.out.println(newText);
    }
}
