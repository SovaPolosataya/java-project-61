package hexlet.code.games;
import java.util.Random;
import hexlet.code.Engine;
public class Prime {
    public static String isPrime(int randomNumber) {
        String answer = "";
        if (randomNumber < 2) {
            answer = "no";
        }
        for (int j = 2; j <= randomNumber / 2; j++) {
            if (randomNumber % j == 0) {
                answer = "no";
                break;
            }
            answer = "yes";
        }
        return answer;
    }
    public static void primeGame() {
        Random random = new Random();

        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int randomNumber;
        final int tasksNumber = 3;
        final int maxRandomNumber = 100;

        Engine.greeting();
        String[] rightAnswers = new String[tasksNumber];
        String[] questions = new String[tasksNumber];

        for (int y = 0; y < tasksNumber; y++) {
            randomNumber = random.nextInt(maxRandomNumber);
            questions[y] = Integer.toString(randomNumber);
            rightAnswers[y] = isPrime(randomNumber);
        }
        Engine.gameShell(task, questions, rightAnswers);
    }
}
