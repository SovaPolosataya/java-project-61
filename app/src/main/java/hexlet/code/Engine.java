package hexlet.code;

import java.util.Scanner;

public class Engine {

    /* 1. scanner.close() вынесла из default;
    *  2. Типы циклов поменяла. На самом деле, хотела это сделать еще в прошлый раз, т.к.
    *     там известное и небольшое кол-во итераций, но забыла((
    *  3. Проверку убрала;
    *  4. Метод переназвала;
    *  5. Переменную numberOfQuestions вынесла в атрибут класса;
    *  6. Переводы строки были, но перед прошлой проверки убрала их из-за codeclimate,
    *     ему не нравились размеры методов. Вернула все обратно;
    *  7. Создала класс Utils с методом для рандома. Т.к. иногда требуется ввести два значения,
    *     начальное и конечное, то через перегрузку сделала и с одним, и с двумя параметрами;
    *  8. isPrime и isEven теперь возвращают boolean;
    *  9. Приветствие теперь вызывается runGame'ом;
    *  10. Вынесла создание прогрессии в отдельный метод. Единственное, возникли дополнительные
    *      сложности (много лишних строчек) с переносом ее в String (т.к. у меня все массивы
    *      стринговые). Может, сразу создавать  массив с прогрессией в String?*/

    private static final Scanner SCANNER = new Scanner(System.in);
    public static final int NUMBER_OF_QUESTION = 3;
    private static String userName;
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = SCANNER.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void runGame(String task, String[] questions, String[] rightAnswers) {

        Engine.greeting();

        System.out.println(task);

        for (int i = 0; i < NUMBER_OF_QUESTION; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = SCANNER.next();
            if (userAnswer.equals(rightAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + rightAnswers[i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");

        SCANNER.close();
    }
}
