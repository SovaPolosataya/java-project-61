package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
public class Progression {
    public static void progressionGame() {
        Random random = new Random();

        Engine.greeting();
        System.out.println("What number is missing in the progression?");

        String rightAnswer = "";
        final int numberOfQuestions = 3;
        int randomNumber;
        int randomProgressionStep;
        int unknownNumber;
        final int progressionLength = 10;
        final int maxRandomNumber = 30;
        final int maxRandomProgressionStep = 9;
        final int maxUnknownNumber = 10;
        int i = 1;

        while (i <= numberOfQuestions) {
            randomNumber = random.nextInt(1, maxRandomNumber);
            randomProgressionStep = random.nextInt(2, maxRandomProgressionStep);
            unknownNumber = random.nextInt(1, maxUnknownNumber);
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