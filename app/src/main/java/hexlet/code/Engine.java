package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void gameStart(String startMess, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        var name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(startMess);
        boolean index = true;
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var question = gameData[0][i];
            var answer = gameData[1][i];
            System.out.println("Question: " + question);
            var input = sc.next();
            if (input.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + input + "' is wrong answer ;(. "
                        + "Correct answer was " + "'" + answer + "'.\nLet's try again, " + name + "!");
                index = false;
                break;
            }
        }
        if (index) {
            System.out.println("Congratulations, " + name + "!");
        }
        sc.close();
    }

    public static class Utils {
    }
}
