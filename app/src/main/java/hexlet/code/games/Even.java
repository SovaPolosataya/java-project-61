package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static void evenGame() {
        Random random = new Random();

        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String rightAnswer;
        String yes = "yes";
        String no = "no";
        final int numberOfQuestions = 3;
        int randomNumber;
        final int maxRandomNumber = 1000;
        int i = 1;

        while (i <= numberOfQuestions) {
            randomNumber = random.nextInt(maxRandomNumber);
            if (randomNumber % 2 == 0) {
                rightAnswer = yes;
            } else {
                rightAnswer = no;
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
