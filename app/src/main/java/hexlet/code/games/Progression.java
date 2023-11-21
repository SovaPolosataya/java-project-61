package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_QUESTION;
import java.util.Arrays;

public class Progression {
    private static final String TASK = "What number is missing in the progression?";

    public static int[] generateProgression(int randomNumber, int randomProgressionStep, int progressionLength) {
        int[] sequences = new int[progressionLength];

        for (int j = 0; j < progressionLength; j++) {
            sequences[j] = randomNumber;
            randomNumber += randomProgressionStep;
        }
        return sequences;
    }

    public static void progressionGame() {
        final int progressionLength = 10;
        final int maxRandomNumber = 30;
        final int maxRandomProgressionStep = 9;
        final int maxUnknownNumber = 9;
        int randomProgressionStep;
        int unknownNumber;
        int randomNumber;
        int rightAnswer;
        int flagOfMissingNumber = -1;
        String question;

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTION][2];

        for (int y = 0; y < NUMBER_OF_QUESTION; y++) {
            randomNumber = Utils.generateRandomNumber(1, maxRandomNumber);
            randomProgressionStep = Utils.generateRandomNumber(2, maxRandomProgressionStep);
            unknownNumber = Utils.generateRandomNumber(maxUnknownNumber);

            int[] sequences = generateProgression(randomNumber, randomProgressionStep, progressionLength);
            rightAnswer = sequences[unknownNumber];
            sequences[unknownNumber] = flagOfMissingNumber;

            question  = Arrays.toString(sequences).replaceAll("[\\[\\],]", "")
                    .replace("-1", "..");

            questionsAndAnswers[y][0] = question;
            questionsAndAnswers[y][1] = Integer.toString(rightAnswer);
        }
        Engine.runGame(TASK, questionsAndAnswers);
    }
}
