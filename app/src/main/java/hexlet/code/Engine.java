package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static String userName;
    public static String userAnswer;
    public static String rightAnswer;
    public static boolean responseError = false;
    public static String yes = "yes";
    public static String no = "no";
    public static String question;
    public static int i = 1;
    public static int numberOfQuestions = 3;

    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void evaluationOfAnswers() {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        userAnswer = scanner.next();

        if (userAnswer.equals(rightAnswer)) {
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
