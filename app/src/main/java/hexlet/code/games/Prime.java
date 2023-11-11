package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Prime {
    public static void primeGame() {
        Random random = new Random();

        Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String rightAnswer = null;
        String yes = "yes";
        String no = "no";
        int numberOfQuestions = 3;
        int randomNumber;

        while (Engine.i <= numberOfQuestions) {
            randomNumber = random.nextInt(100);
            if (randomNumber < 2) {
                rightAnswer = no;
            }
            for (int j = 2; j <= randomNumber / 2; j++) {
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
