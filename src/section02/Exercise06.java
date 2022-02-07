package section02;

public class Exercise06 {

    // Create a method that can be called (without creating an instance of its class)
    public static void method() {
        System.out.println("No need for class instance to run");
    }

    public static void main(String[] args) {
        Exercise06.method();
    }
}
