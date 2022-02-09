package section03.exercise01;

public class Person {
    private String firstname;
    private String lastName;

    public Person (String firstname, String lastName) {
        this.firstname = firstname.toUpperCase();
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Person person = new Person("michael", "smith");

        System.out.println(person.firstname);
        System.out.println(person.lastName);
    }
}
