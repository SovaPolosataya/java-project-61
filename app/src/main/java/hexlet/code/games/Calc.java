package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final String[] OPERATORS = {"+", "-", "*"};
    public static int calculate(int randomNumber1, int randomNumber2, String operator) {
        int answer = 0;
        switch (operator) {
            case "+":
                answer = randomNumber1 + randomNumber2;
                break;
            case "-":
                answer = randomNumber1 - randomNumber2;
                break;
            case "*":
                answer = randomNumber1 * randomNumber2;
                break;
            default:
                break;
        }
        return answer;
    }
    public static void calcGame() {
        Random random = new Random();

        Engine.greeting();
        String task = "What is the result of the expression?";

        final int maxRandomNumber = 100;
        final int tasksNumber = 3;
        int randomNumber1;
        int randomNumber2;
        String randomOperator;

        String[] questions = new String[tasksNumber];
        String[] rightAnswers = new String[tasksNumber];
        for (int y = 0; y < tasksNumber; y++) {
            randomNumber1 = random.nextInt(maxRandomNumber);
            randomNumber2 = random.nextInt(maxRandomNumber);
            randomOperator = OPERATORS[random.nextInt(OPERATORS.length - 1)];
            questions[y] = randomNumber1 + " " + randomOperator + " " + randomNumber2;
            rightAnswers[y] = Integer.toString(calculate(randomNumber1, randomNumber2, randomOperator));
        }
        Engine.gameShell(task, questions, rightAnswers);
    }
}
