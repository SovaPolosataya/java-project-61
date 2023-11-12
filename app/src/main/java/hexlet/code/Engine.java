package hexlet.code;

import java.util.Scanner;

public class Engine {

    static Scanner scanner = new Scanner(System.in);
    static String userName;
    static String userAnswer;
    static String rightAnswer;
    static boolean responseError = false;
    public static int i = 1;
    static int numberOfQuestions = 3;

    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void evaluationOfAnswers(String rightAnswer2) {

        System.out.print("Your answer: ");
        userAnswer = scanner.next();

        if (userAnswer.equals(rightAnswer2)) {
            System.out.println("Correct!");
            i = i + 1;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
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
