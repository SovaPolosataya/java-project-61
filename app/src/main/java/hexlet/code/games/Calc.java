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
        int numberOfQuestions = 3;
        int randomNumber1;
        int randomNumber2;

        while (Engine.i <= numberOfQuestions) {
            randomNumber1 = random.nextInt(100);
            randomNumber2 = random.nextInt(100);
            randomForTheSymbol = random.nextInt(3);

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

            Engine.evaluationOfAnswers(rightAnswer);
        }
        Engine.congratulations();
    }

}
