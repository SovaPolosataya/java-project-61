package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_QUESTION;


public class Even {
    public static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
    public static void evenGame() {
        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int maxRandomNumber = 1000;
        int randomNumber;

        String[] questions = new String[NUMBER_OF_QUESTION];
        String[] rightAnswers = new String[NUMBER_OF_QUESTION];

        for (int y = 0; y < NUMBER_OF_QUESTION; y++) {
            randomNumber = Utils.isRandom(maxRandomNumber);

            questions[y] = Integer.toString(randomNumber);
            rightAnswers[y] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.runGame(task, questions, rightAnswers);
    }
}
