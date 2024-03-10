package hexlet.code.games;

import hexlet.code.Cli;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Engine {
    public static boolean index = true;
    public static Integer expect;
    public static String expect2;
    public static Integer input;
    public static String input2;

    public static void gameStart(String startMess, List<String> questions, List<String> answers) {
        for (var i = 0; i < 3; i++) {

        }
        if (index && numOfTheGame != 1) {
            System.out.println("Congratulations, " + Cli.name + "!");
            index = false;
        }
    }

    public static void exit() {
        index = false;
        System.out.println("Leave the game...");
    }

    public static void answer() {
        if (Engine.expect.equals(Engine.input)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + Engine.input + "' is wrong answer ;(. "
                    + "Correct answer was " + "'" + Engine.expect + "'" + ".\nLet's try again, " + Cli.name + ".");
            Engine.index = false;
        }
    }

    public static void answer2() {
        if (Engine.expect2.equals(Engine.input2)) {
            System.out.println("Correct!");
        }  else if (Engine.input2.equals("yes")) {
            System.out.println("'yes' is wrong answer ;(. "
                    + "Correct answer was 'no'.\nLet's try again, " + Cli.name + ".");
            Engine.index = false;
        } else {
            System.out.println("'no' is wrong answer ;(. "
                    + "Correct answer was 'yes'.\nLet's try again, " + Cli.name + ".");
            Engine.index = false;
        }
    }
}
