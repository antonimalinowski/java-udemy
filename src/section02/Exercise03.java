package section02;

public class Exercise03 {
    public static void main(String[] args) {
        // Create an array and initialize it with numbers, 1-10
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Alternative
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }
    }
}
