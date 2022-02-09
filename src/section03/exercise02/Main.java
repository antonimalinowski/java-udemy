package section03.exercise02;

public class Main {
    public static void main(String[] args) {
        String sentence = "My cat does really not like my bird. What a weird cat. I love my cat though. Not more than my dog";
        sentence = sentence.replace("cat", "dog");

        System.out.println(sentence);
    }
}
