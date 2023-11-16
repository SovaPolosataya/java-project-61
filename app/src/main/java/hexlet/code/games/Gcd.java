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
        String task = "Find the greatest common divisor of given numbers.";
        final int maxRandomNumber = 100;
        final int tasksNumber = 3;
        int randomNumber1;
        int randomNumber2;
        String[] questions = new String[tasksNumber];
        String[] rightAnswers = new String[tasksNumber];
        for (int y = 0; y < tasksNumber; y++) {
            randomNumber1 = random.nextInt(maxRandomNumber);
            randomNumber2 = random.nextInt(maxRandomNumber);
            questions[y] =  randomNumber1 + " " + randomNumber2;
            rightAnswers[y] = Integer.toString(nodGsd(randomNumber1, randomNumber2));
        }
        Engine.gameShell(task, questions, rightAnswers);
    }
}
