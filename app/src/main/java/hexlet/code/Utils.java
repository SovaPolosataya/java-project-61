package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();

    public static int generateRandomNumber(int number) {
        int randomNumber = RANDOM.nextInt(number);
        return randomNumber;
    }
    public static int generateRandomNumber(int minNumber, int maxNumber) {
        int randomNumber = RANDOM.nextInt(minNumber, maxNumber);
        return randomNumber;
    }
}
