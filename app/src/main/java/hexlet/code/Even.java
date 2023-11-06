package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int i = 1;
        var y = "yes";
        var n = "no";
        int numberOfQuestions = 3;
        String userWord;
        var responseError = false;
        while (i <= numberOfQuestions) {
            var randomNumber = random.nextInt(1000);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            userWord = scanner.next();

            if ((randomNumber % 2 == 0 && userWord.equals(y)) || (randomNumber % 2 != 0 && userWord.equals(n))) {
                System.out.println("Correct!");
                i = i + 1;
            } else if (randomNumber % 2 != 0 && userWord.equals(y)) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName + "!");
                i = numberOfQuestions + 1;
                responseError = true;
            } else {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + userName + "!");
                i = numberOfQuestions + 1;
                responseError = true;
            }

        }
        if (!responseError) {
            System.out.println("Congratulations, " + userName + "!");
        }
        scanner.close();
    }
}
