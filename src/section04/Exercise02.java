package section04;

public class Exercise02 {
    public static void main(String[] args) {
        String regex = "A[bg]racada[bg]ra";

        System.out.println("Abracadabra".matches(regex));
        System.out.println("Agracadagra".matches(regex));

        // Alternative
        String regex2 = "A([bg])racada\\1ra"; // This would prevent matching Abracadagra

        System.out.println("Abracadabra".matches(regex2));
        System.out.println("Agracadagra".matches(regex2));
        System.out.println("Agracadabra".matches(regex2));
        System.out.println("Abracadagra".matches(regex2));
    }
}