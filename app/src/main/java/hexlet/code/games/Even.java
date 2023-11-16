package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static String isEven(int randomNumber) {
        return randomNumber % 2 == 0 ? "yes" : "no";
    }
    public static void evenGame() {
        Random random = new Random();

        Engine.greeting();
        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        final int maxRandomNumber = 1000;
        final int tasksNumber = 3;
        int randomNumber;

        String[] questions = new String[tasksNumber];
        String[] rightAnswers = new String[tasksNumber];

        for (int y = 0; y < tasksNumber; y++) {
            randomNumber = random.nextInt(maxRandomNumber);
            questions[y] = Integer.toString(randomNumber);
            rightAnswers[y] = isEven(randomNumber);
        }
        Engine.gameShell(task, questions, rightAnswers);
    }
}
