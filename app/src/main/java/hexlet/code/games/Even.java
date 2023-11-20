package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_QUESTION;


public class Even {

    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
    public static void evenGame() {
        final int maxRandomNumber = 1000;
        int randomNumber;

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTION][2];

        for (int y = 0; y < NUMBER_OF_QUESTION; y++) {
            randomNumber = Utils.generateRandomNumber(maxRandomNumber);

            questionsAndAnswers[y][0] = Integer.toString(randomNumber);
            questionsAndAnswers[y][1] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.runGame(TASK, questionsAndAnswers);
    }
}
