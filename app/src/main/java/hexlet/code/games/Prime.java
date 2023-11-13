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
        int i = 1;

        while (i <= numberOfQuestions) {
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
            System.out.print("Your answer: ");
            String userAnswer = Engine.getScanner().next();

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                i = i + 1;
            } else {
                Engine.evaluationOfAnswers(userAnswer, rightAnswer);
                break;
            }
        }
        Engine.congratulations();
    }
}