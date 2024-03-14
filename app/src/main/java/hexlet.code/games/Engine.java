package hexlet.code.games;

import hexlet.code.App;

import java.util.List;
import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void gameStart(String startMess, String[][] gameData) {
        System.out.println(startMess);
        Scanner sq = new Scanner(System.in);
        boolean index = true;
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var question = gameData[0][i];
            var answer = gameData[1][i];
            System.out.println("Question: " + question);
            var input = sq.next();
            if (input.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + input + "' is wrong answer ;(. "
                        + "Correct answer was " + "'" + answer + "'.\nLet's try again, " + App.name + ".");
                index = false;
                break;
            }
        }
        if (index) {
            System.out.println("Congratulations, " + App.name + "!");
        }
        sq.close();
    }
}
