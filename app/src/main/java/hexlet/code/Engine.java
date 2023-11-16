package hexlet.code;

import java.util.Scanner;

public class Engine {
    /*  Сделала в каждом классе по два массива (с вопросами и правильными ответами) и цикл к ним.
    Читала, что многие не любят массивы и циклы в коде,  но мне они кажутся довольно удобными,
    если не злоупотреблять. В любом случае, можно обойтись и без них, но тогда придется
    создавать кучу переменных, делить метод в Engine и т.п. Варианты есть, но мне они кажутся
    менее удобными. В любом случае, если надо - переделаю.) */
    private static final Scanner SCANNER = new Scanner(System.in);
    private static String userName;
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = SCANNER.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void gameShell(String task, String[] questions, String[] rightAnswers) {
        boolean responseError = false;
        final int numberOfQuestions = 2;
        int i = 0;
        System.out.println(task);
        while (i <= numberOfQuestions) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = SCANNER.next();
            if (userAnswer.equals(rightAnswers[i])) {
                System.out.println("Correct!");
                i = i + 1;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + rightAnswers[i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                responseError = true;
                break;
            }
        }
        if (!responseError) {
            System.out.println("Congratulations, " + userName + "!");
        }
        SCANNER.close();
    }
}
