import java.util.Random;

public class GuessingGame {

    private final int randomNumber = new Random().nextInt(10) + 1;
    private int counter = 0;

    public String guess(int guessedNumber) {
        counter++;
        if(counter == 4 && guessedNumber != getRandomNumber()) {
            return "You didn't get it and you had four tries. Game over.";
        }
        String tryText = counter == 1 ? "try" : "tries";
        String winningMessage = String.format("You got it in %d %s!", counter, tryText);
        return guessedNumber == getRandomNumber() ? winningMessage : "You didn't get it";
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
