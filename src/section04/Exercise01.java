package section04;

public class Exercise01 {
    public static void main(String[] args) {
        String regex = "[DbL]ark";
        String regex2 = "s?[DbLt]ark";

        System.out.println("Dark".matches(regex));
        System.out.println("bark".matches(regex));
        System.out.println("Lark".matches(regex));

        System.out.println("Dark".matches(regex2));
        System.out.println("bark".matches(regex2));
        System.out.println("Lark".matches(regex2));
        System.out.println("stark".matches(regex2));
    }
}