package section02;

public class Exercise05 {
    public static void main(String[] args) {
        Exercise05 e05 = new Exercise05();
        e05.wordList("car", "bike", "train", "plane");
        e05.wordList("Michael", "Susan");
        e05.wordList("red", "blue", "orange", "purple", "green", "black");
    }

    // Write a method that allows you to pass any number of Strings as parameter inputs without
    //using an array.
    public void wordList(String... words) {}
}
