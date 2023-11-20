package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBER_OF_QUESTION;

public class Gcd {

    private static final String TASK = "Find the greatest common divisor of given numbers.";
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
        final int maxRandomNumber = 100;
        int randomNumber1;
        int randomNumber2;

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTION][2];

        for (int y = 0; y < NUMBER_OF_QUESTION; y++) {
            randomNumber1 = Utils.generateRandomNumber(maxRandomNumber);
            randomNumber2 = Utils.generateRandomNumber(maxRandomNumber);

            questionsAndAnswers[y][0] =  randomNumber1 + " " + randomNumber2;
            questionsAndAnswers[y][1] = Integer.toString(nodGsd(randomNumber1, randomNumber2));
        }
        Engine.runGame(TASK, questionsAndAnswers);
    }
}
