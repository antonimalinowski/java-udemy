import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessingGameTest {

    public static final int GAME_RANDOMNESS_RETRIES = 100;
    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum);
        assertEquals("You got it in 1 try!", message);
    }

    @Test
    public void testOneWrongNegGuessSituation() {
        String message = game.guess(-5);
        assertEquals("You didn't get it - you are too low", message);
    }

    @Test
    public void testOneWrongPosGuessSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum + 1);
        assertEquals("You didn't get it - you are too high", message);
    }

    @Test
    public void testRandomNumberGeneration() {
        // 1 2 3 4 5 6 7 8 9 10
        // 1 1 1 1 0 0 1 1 0  1 -> 10
        int[] randomNumCount = new int[11];
        for(int counter = 0; counter < GAME_RANDOMNESS_RETRIES; counter++) {
            GuessingGame localGame = new GuessingGame();
            int randomNum = localGame.getRandomNumber();
            randomNumCount[randomNum] = 1;
        }

        int sum = 0;
        for(int counter = 0; counter < 11; counter++) {
            sum += randomNumCount[counter];
        }
        assertEquals(10, sum);
    }

    @Test
    public void testTenWrongGuesses() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        String message = game.guess(-3);
        assertEquals("Sorry, you are limited to only 4 tries. Your game is over.", message);
    }

    @Test
    public void testFourWrongGuesses() {
        makeThreeWrongGuesses();
        String message = game.guess(-3);
        assertEquals("You didn't get it and you've had 4 tries. Game over.", message);
    }

    private void makeThreeWrongGuesses() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
    }

    @Test
    public void testThreeWrongGuessesAndOneCorrect() {
        makeThreeWrongGuesses();
        int correctAnswer = game.getRandomNumber();
        String message = game.guess(correctAnswer);
        assertEquals("You got it in 4 tries!", message);
    }

    @Test
    public void testTwoWrongGuessesAndOneCorrect() {
        game.guess(-3);
        game.guess(-3);
        int correctAnswer = game.getRandomNumber();
        String message = game.guess(correctAnswer);
//        assertTrue(message.contains("3"), "Should indicate 3 tries");
//        assertTrue(message.contains("You got it"), "Should indicate that we got the right number");
        assertEquals("You got it in 3 tries!", message);
    }
}
