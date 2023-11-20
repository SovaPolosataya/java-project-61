package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.NUMBER_OF_QUESTION;
import hexlet.code.Utils;

public class Calc {
    private static final String TASK = "What is the result of the expression?";
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

        final int maxRandomNumber = 100;
        int randomNumber1;
        int randomNumber2;
        int operatorsLength = OPERATORS.length - 1;
        String randomOperator;

        String[][] questionsAndAnswers = new String[NUMBER_OF_QUESTION][2];

        for (int y = 0; y < NUMBER_OF_QUESTION; y++) {
            randomNumber1 = Utils.generateRandomNumber(maxRandomNumber);
            randomNumber2 = Utils.generateRandomNumber(maxRandomNumber);
            randomOperator = OPERATORS[Utils.generateRandomNumber(operatorsLength)];

            questionsAndAnswers[y][0] = randomNumber1 + " " + randomOperator + " " + randomNumber2;
            questionsAndAnswers[y][1] = Integer.toString(calculate(randomNumber1, randomNumber2, randomOperator));
        }
        Engine.runGame(TASK, questionsAndAnswers);
    }
}
