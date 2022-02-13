package section05;

public class Exercise03 {
    private String[] names = {"jacob", "markus", "louis", "chris", "steven", "robert", "jeremy", "michael", "brandon", "john"};
    private int currentPersonIndex = 0;

    public String next() {
        String person = names[currentPersonIndex++];
        return person.substring(0,1).toUpperCase() + person.substring(1);
    }

    public static void main(String[] args) {
        Exercise03 person = new Exercise03();
        System.out.println(person.next());
        System.out.println(person.next());
        System.out.println(person.next());
    }
}
