package section04;

public class Exercise03 {
    public static void main(String[] args) {
        String regex = "A(?:[bg])racada[bg]ra";

        System.out.println("Abracadabra".matches(regex));
        System.out.println("Agracadagra".matches(regex));

    }
}
