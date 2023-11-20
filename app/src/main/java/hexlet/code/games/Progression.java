package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_QUESTION;
import java.util.Arrays;

public class Progression {
    public static int[] isProgression(int randomNumber, int randomProgressionStep, int progressionLength) {
        int[] sequences = new int[progressionLength];

        for (int j = 0; j < progressionLength; j++) {
            sequences[j] = randomNumber;
            randomNumber += randomProgressionStep;
        }
        return sequences;
    }
    public static void progressionGame() {
        String task = "What number is missing in the progression?";
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

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTION][NUMBER_OF_QUESTION];

        for (int y = 0; y < NUMBER_OF_QUESTION; y++) {
            randomNumber = Utils.isRandom(1, maxRandomNumber);
            randomProgressionStep = Utils.isRandom(2, maxRandomProgressionStep);
            unknownNumber = Utils.isRandom(maxUnknownNumber);

            int[] sequences = isProgression(randomNumber, randomProgressionStep, progressionLength);
            rightAnswer = sequences[unknownNumber];
            sequences[unknownNumber] = flagOfMissingNumber;

            question  = Arrays.toString(sequences).replaceAll("[\\[\\],]", "")
                    .replace("-1", "..");

            questionsAndAnswers[y][0] = question;
            questionsAndAnswers[y][1] = Integer.toString(rightAnswer);
        }
        Engine.runGame(task, questionsAndAnswers);
    }
}
