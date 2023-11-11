package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static int nodGsd(int a, int b) {
        int max = a;
        int min = b;
        int remainder;
        int nod = 0;
        if (b > a) {
            max = b;
            min = a;
        }
        while (min != 0 && max != 0) {
            remainder = max % min;
            if (remainder != 0) {
                max = min;
                min = remainder;
            } else {
                nod = min;
                break;
            }
        } return nod;
    }
    public static void gcdGame() {
        Random random = new Random();

        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");

        String rightAnswer;
        String question;
        int numberOfQuestions = 3;
        int randomNumber1;
        int randomNumber2;

        while (Engine.i <= numberOfQuestions) {
            randomNumber1 = random.nextInt(100);
            randomNumber2 = random.nextInt(100);
            question = randomNumber1 + " " + randomNumber2;
            rightAnswer = Integer.toString(nodGsd(randomNumber1, randomNumber2));
            System.out.println("Question: " + question);

            Engine.evaluationOfAnswers(rightAnswer);
        }
        Engine.congratulations();
    }
}