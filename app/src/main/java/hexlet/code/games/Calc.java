package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_QUESTION;
import hexlet.code.Utils;

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
        String task = "What is the result of the expression?";
        final int maxRandomNumber = 100;
        int randomNumber1;
        int randomNumber2;
        int operatorsLength = OPERATORS.length - 1;
        String randomOperator;

        String[] questions = new String[NUMBER_OF_QUESTION];
        String[] rightAnswers = new String[NUMBER_OF_QUESTION];

        for (int y = 0; y < NUMBER_OF_QUESTION; y++) {
            randomNumber1 = Utils.isRandom(maxRandomNumber);
            randomNumber2 = Utils.isRandom(maxRandomNumber);
            randomOperator = OPERATORS[Utils.isRandom(operatorsLength)];

            questions[y] = randomNumber1 + " " + randomOperator + " " + randomNumber2;
            rightAnswers[y] = Integer.toString(calculate(randomNumber1, randomNumber2, randomOperator));
        }
        Engine.runGame(task, questions, rightAnswers);
    }
}
