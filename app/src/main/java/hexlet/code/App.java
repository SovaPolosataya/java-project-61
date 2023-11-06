package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        //var number = scanner.next();
        System.out.print("Your choice: ");
        var number = scanner.next();
        if (number.equals("1")) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            String userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
        } if (number.equals("2")) {
            Even.evenGame();
        } else {
            scanner.close();
        }
    }
}
