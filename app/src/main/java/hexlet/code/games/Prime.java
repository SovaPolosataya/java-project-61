package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_QUESTION;

public class Prime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isPrime(int randomNumber) {
        if (randomNumber < 2) {
            return false;
        }
        for (int j = 2; j <= randomNumber / 2; j++) {
            if (randomNumber % j == 0) {
                return false;
            }
        } return true;
    }
    public static void primeGame() {
        int randomNumber;
        final int maxRandomNumber = 100;

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTION][2];

        for (int y = 0; y < NUMBER_OF_QUESTION; y++) {
            randomNumber = Utils.generateRandomNumber(maxRandomNumber);

            questionsAndAnswers[y][0] = Integer.toString(randomNumber);
            questionsAndAnswers[y][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.runGame(TASK, questionsAndAnswers);
    }
}
