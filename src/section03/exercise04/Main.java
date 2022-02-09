package section03.exercise04;

public class Main {
    public static void main(String[] args) {
        String text = "    alphabet ".strip();
        String lastChar = text.substring(text.length() - 1);
        String modifiedText = text.replace(lastChar, lastChar.toUpperCase());

        System.out.println(modifiedText);
    }
}
