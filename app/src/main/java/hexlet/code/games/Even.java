package hexlet.code.games;
import static hexlet.code.Engine.*;
public class Even {
    public static void evenGame() {
        greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (i <= numberOfQuestions) {
            int randomNumber = random.nextInt(1000);
            if (randomNumber % 2 == 0) {
                rightAnswer = yes;
            } else {
                rightAnswer = no;
            }
            question = Integer.toString(randomNumber);
            evaluationOfAnswers();
        }
        congratulations();
    }
}
