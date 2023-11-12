package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
public class Progression {
    public static void progressionGame() {
        Random random = new Random();

        Engine.greeting();
        System.out.println("What number is missing in the progression?");

        String rightAnswer = "";
        int numberOfQuestions = 3;
        int randomNumber;
        int randomProgressionStep;
        int unknownNumber;
        int progressionLength = 10;

        while (Engine.i <= numberOfQuestions) {
            randomNumber = random.nextInt(1, 30);
            randomProgressionStep = random.nextInt(2, 9);
            unknownNumber = random.nextInt(1, 10);
            System.out.print("Question: ");
            for (int j = 1; j <= progressionLength; j++) {
                if (j == unknownNumber) {
                    rightAnswer = Integer.toString(randomNumber);
                    System.out.print(".." + " ");
                    randomNumber += randomProgressionStep;
                }
                System.out.print(randomNumber + " ");
                randomNumber += randomProgressionStep;
            }
            System.out.println("");
            Engine.evaluationOfAnswers(rightAnswer);
        }
        Engine.congratulations();
    }
}
