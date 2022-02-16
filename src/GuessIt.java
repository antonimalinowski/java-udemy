import java.util.Random;

public class GuessIt {

    public static final int MAX_ALLOWED_TRIES = 3;

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        String guessedNumStr = null;
        byte guessesCounter;
        for (guessesCounter = 1; guessesCounter <= MAX_ALLOWED_TRIES; guessesCounter++) {
            guessedNumStr = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
            if (guessedNumStr.matches("-?\\d{1,2}")) {
                int guessedNum = Integer.parseInt(guessedNumStr);
                if (guessedNum == randomNum) {
                    String tryText = guessesCounter == 1 ? "try" : "tries";
                    System.out.printf("The random number was %d. You got it in %d %s!%n", randomNum, guessesCounter, tryText);
                    break;
                } else {
                    System.out.printf("You didn't get it!%n", randomNum);
                }
            }
        }
        if (guessesCounter >= MAX_ALLOWED_TRIES) {
            System.out.format("You've had %d incorrect guesses. The random number was %d. Better luck next time!", guessesCounter - 1, randomNum);
        }
    }
}
