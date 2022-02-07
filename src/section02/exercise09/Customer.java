package section02.exercise09;

public class Customer {
    private String name;
    private float deposit;

    public Customer(String name, float deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Goerge", 1234.56f);
    }
}
