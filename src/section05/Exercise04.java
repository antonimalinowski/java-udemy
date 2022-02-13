package section05;

public class Exercise04 {
    private int[] waitTime = {13, 49, 90, 130, 175, 181, 255, 310, 330, 359};
    private int currentIndex = 0;

    public int next() {
        return waitTime[currentIndex++] / 90;
    }

    public static void main(String[] args) {
        Exercise04 time = new Exercise04();
        System.out.println(time.next());
        System.out.println(time.next());
        System.out.println(time.next());
        System.out.println(time.next());
    }
}
