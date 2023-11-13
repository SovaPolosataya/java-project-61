package hexlet.code;

import java.util.Scanner;

public class Engine {

    // У меня все было так красиво...
    // если бы не дурацкий линтер в проверке на ГитХабе. Тоска-печаль(
    private static final Scanner SCANNER = new Scanner(System.in);
    private static String userName;
    private static boolean responseError = false;

    public static Scanner getScanner() {
        return SCANNER;
    }
    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = SCANNER.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void evaluationOfAnswers(String answerFromUser, String answer) {
            System.out.println("'" + answerFromUser + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
            System.out.println("Let's try again, " + userName + "!");
            responseError = true;

    }
    public static void congratulations() {

        if (!responseError) {
            System.out.println("Congratulations, " + userName + "!");
        }
        SCANNER.close();
    }
}
