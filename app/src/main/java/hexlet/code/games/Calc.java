package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void calcGame() {
        Random random = new Random();

        Engine.greeting();
        System.out.println("What is the result of the expression?");

        int randomForTheSymbol;
        String operator;
        int answer;
        String rightAnswer;
        String question;
        final int numberOfQuestions = 3;
        int randomNumber1;
        int randomNumber2;
        final int maxRandomNumber = 100;
        final int maxRandomForTheSymbol = 3;
        int i = 1;

        while (i <= numberOfQuestions) {
            randomNumber1 = random.nextInt(maxRandomNumber);
            randomNumber2 = random.nextInt(maxRandomNumber);
            randomForTheSymbol = random.nextInt(maxRandomForTheSymbol);

            switch (randomForTheSymbol) {
                case 0:
                    operator = " + ";
                    answer = randomNumber1 + randomNumber2;
                    break;
                case 1:
                    operator = " - ";
                    answer = randomNumber1 - randomNumber2;
                    break;
                default:
                    operator = " * ";
                    answer = randomNumber1 * randomNumber2;
            }
            rightAnswer = Integer.toString(answer);
            question = randomNumber1 + operator + randomNumber2;
            System.out.println("Question: " + question);

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
