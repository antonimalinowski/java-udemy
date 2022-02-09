package section04;

public class Exercise05 {
    public static void main(String[] args) {
        String email = "john.mitchell@jmitchell.com";

        String regex = "\\w+\\.?\\w*@(\\w+\\.)+\\w+";

        System.out.println(email.matches(regex));
    }
}
