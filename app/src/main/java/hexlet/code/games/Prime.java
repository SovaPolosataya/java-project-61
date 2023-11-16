package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Prime {
    public static String isPrime(int randomNumber) {
        String answer = "";
        if (randomNumber < 2) {
            answer = "no";
        }
        for (int j = 2; j < randomNumber / 2; j++) {
            if (randomNumber % j == 0) {
                answer = "no";
                break;
            }
            answer = "yes";
        }
        return answer;
    }
    public static void primeGame() {
        Random random = new Random();

        Engine.greeting();
        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        final int maxRandomNumber = 100;
        final int tasksNumber = 3;
        int randomNumber;

        String[] questions = new String[tasksNumber];
        String[] rightAnswers = new String[tasksNumber];
        for (int y = 0; y < tasksNumber; y++) {
            randomNumber = random.nextInt(maxRandomNumber);
            questions[y] = Integer.toString(randomNumber);
            rightAnswers[y] = isPrime(randomNumber);
        }
        Engine.gameShell(task, questions, rightAnswers);
    }
}
