package hexlet.code.games;

import hexlet.code.Cli;

import java.util.List;
import java.util.Scanner;

public class Engine {

    public static void gameStart(String startMess, List<String> questions, List<String> answers) {
        System.out.println(startMess);
        Scanner sq = new Scanner(System.in);
        boolean index = true;
        for (var i = 0; i < 3; i++) {
            System.out.println("Question: " + questions.get(i));
            var input = sq.next();
            if (answer(input, answers.get(i))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + input + "' is wrong answer ;(. "
                        + "Correct answer was " + "'" + answers.get(i) + "'.\nLet's try again, " + Cli.name + ".");
                index = false;
                break;
            }
        }
        if (index) {
            System.out.println("Congratulations, " + Cli.name + "!");
        }
    }

    public static Boolean answer(String ans, String correctAns) {
        boolean answer = ans.equals(correctAns);
        return answer;
    }
}
