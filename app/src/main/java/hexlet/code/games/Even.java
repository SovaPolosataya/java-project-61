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
        int numberOfQuestions = 3;
        int randomNumber;

        while (Engine.i <= numberOfQuestions) {
            randomNumber = random.nextInt(1000);
            if (randomNumber % 2 == 0) {
                rightAnswer = yes;
            } else {
                rightAnswer = no;
            }

            System.out.println("Question: " + randomNumber);
            Engine.evaluationOfAnswers(rightAnswer);
        }
        Engine.congratulations();
    }
}
