package section02.exercise11;

public class People {
    public static final String[] peopleNames = {"Tom", "Susan", "Johnny"};

    public String[] getNames() {
        return People.peopleNames;
    }

    public static void main(String[] args) {
        People p1 = new People();

        System.out.println(p1.getNames()[0]);
        System.out.println(p1.getNames()[1]);
        System.out.println(p1.getNames()[2]);
    }
}
