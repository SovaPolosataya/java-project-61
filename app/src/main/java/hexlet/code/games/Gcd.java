package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBER_OF_QUESTION;

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
        String task = "Find the greatest common divisor of given numbers.";
        final int maxRandomNumber = 100;
        int randomNumber1;
        int randomNumber2;

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTION][NUMBER_OF_QUESTION];

        for (int y = 0; y < NUMBER_OF_QUESTION; y++) {
            randomNumber1 = Utils.isRandom(maxRandomNumber);
            randomNumber2 = Utils.isRandom(maxRandomNumber);

            questionsAndAnswers[y][0] =  randomNumber1 + " " + randomNumber2;
            questionsAndAnswers[y][1] = Integer.toString(nodGsd(randomNumber1, randomNumber2));
        }
        Engine.runGame(task, questionsAndAnswers);
    }
}
