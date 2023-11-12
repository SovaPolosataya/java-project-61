package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static String userName;
    public static int i = 1;
    private static boolean responseError = false;
    private static final int numberOfQuestions = 3;

    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = SCANNER.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void evaluationOfAnswers(String answer) {

        System.out.print("Your answer: ");
        String userAnswer = SCANNER.next();

        if (userAnswer.equals(answer)) {
            System.out.println("Correct!");
            i = i + 1;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
            System.out.println("Let's try again, " + userName + "!");
            responseError = true;
            i = numberOfQuestions + 1;
        }
    }
    public static void congratulations() {

        if (!responseError) {
            System.out.println("Congratulations, " + userName + "!");
        }
        SCANNER.close();
    }
}
