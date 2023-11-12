package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final Scanner scanner = new Scanner(System.in);
    private static String userName;
    private static boolean responseError = false;
    public static int i = 1;
    private static final int numberOfQuestions = 3;

    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void evaluationOfAnswers(String answerToTheQuestion) {

        System.out.print("Your answer: ");
        String userAnswer = scanner.next();

        if (userAnswer.equals(answerToTheQuestion)) {
            System.out.println("Correct!");
            i = i + 1;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answerToTheQuestion + "'.");
            System.out.println("Let's try again, " + userName + "!");
            responseError = true;
            i = numberOfQuestions + 1;
        }
    }
    public static void congratulations() {

        if (!responseError) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }
}
