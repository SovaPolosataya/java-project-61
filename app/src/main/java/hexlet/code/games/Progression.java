package hexlet.code.games;
import java.util.Random;
import hexlet.code.Engine;
public class Progression {
    public static void progressionGame() {
        Random random = new Random();
        Engine.greeting();
        String task = "What number is missing in the progression?";
        final int progressionLength = 10;
        final int maxRandomNumber = 30;
        final int maxRandomProgressionStep = 9;
        final int maxUnknownNumber = 10;
        final int tasksNumber = 3;
        int randomProgressionStep;
        int unknownNumber;
        int randomNumber;
        String rightAnswer = "";
        String[] questions = new String[tasksNumber];
        String[] rightAnswers = new String[tasksNumber];
        for (int y = 0; y < tasksNumber; y++) {
            randomNumber = random.nextInt(1, maxRandomNumber);
            randomProgressionStep = random.nextInt(2, maxRandomProgressionStep);
            unknownNumber = random.nextInt(1, maxUnknownNumber);
            StringBuilder sequence = new StringBuilder();
            for (int j = 1; j <= progressionLength; j++) {
                if (j == unknownNumber) {
                    rightAnswer = Integer.toString(randomNumber);
                    sequence.append(".. ");
                    randomNumber += randomProgressionStep;
                }
                sequence.append(randomNumber);
                sequence.append(" ");
                randomNumber += randomProgressionStep;
            }
            questions[y] = sequence.toString();
            rightAnswers[y] = rightAnswer;
        }
        Engine.gameShell(task, questions, rightAnswers);
    }
}
