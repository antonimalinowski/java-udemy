package section05;

import java.util.Random;

public class Exercise05 {
    private int sum = 0;

    public int next() {
        this.sum += new Random().nextInt(10);
        return this.sum;
    }

    public static void main(String[] args) {
        Exercise05 exercise05 = new Exercise05();
        System.out.println(exercise05.next());
        System.out.println(exercise05.next());
        System.out.println(exercise05.next());
        System.out.println(exercise05.next());
    }
}
