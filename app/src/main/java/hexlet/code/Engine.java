package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static final int NUMBER_OF_QUESTION = 3;

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = SCANNER.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void runGame(String task, String[][] questionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = SCANNER.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(task);

        for (int i = 0; i < NUMBER_OF_QUESTION; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = SCANNER.next();
            if (userAnswer.equals(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");

        SCANNER.close();
    }
}
