package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Prime {
    public static void primeGame() {
        Random random = new Random();

        Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String rightAnswer = "";
        String yes = "yes";
        String no = "no";
        final int numberOfQuestions = 3;
        int randomNumber;
        final int maxRandomNumber = 100;

        while (Engine.i <= numberOfQuestions) {
            randomNumber = random.nextInt(maxRandomNumber);
            if (randomNumber < 2) {
                rightAnswer = no;
            }
            for (int j = 2; j < randomNumber; j++) {
                if (randomNumber % j == 0) {
                    rightAnswer = no;
                    break;
                }
                rightAnswer = yes;
            }
            System.out.println("Question: " + randomNumber);
            Engine.evaluationOfAnswers(rightAnswer);
        }
        Engine.congratulations();
    }

}
