package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Engine {
    public static boolean index = true;
    public static Integer expect;
    public static String expect2;
    public static Integer input;
    public static String input2;

    public static void gameChoosing() {
        Engine.index = true;
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n"
                + "3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner sc = new Scanner(System.in);
        var numOfTheGame = sc.nextInt();
        System.out.println("Your choice: " + numOfTheGame);
        Cli.greeting();
        if (numOfTheGame == 2) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        } else if (numOfTheGame == 3) {
            System.out.println("What is the result of the expression, " + Cli.name + "?");
        } else if (numOfTheGame == 4) {
            System.out.println("Find the greatest common divisor of given numbers, " + Cli.name + ".");
        } else if (numOfTheGame == 5) {
            System.out.println("What number is missing in the progression, " + Cli.name + "?");
        } else if (numOfTheGame == 6) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no', " + Cli.name);
        }
        for (var i = 0; i < 3; i++) {
            if (!index || numOfTheGame == 1) {
                break;
            }
            if (numOfTheGame == 1) {
                Cli.greeting();
                index = false;
            } else if (numOfTheGame == 2) {
                Even.even();
            } else if (numOfTheGame == 3) {
                Calc.calc();
            } else if (numOfTheGame == 4) {
                GCD.gcd();
            } else if (numOfTheGame == 5) {
                Progression.progression();
            } else if (numOfTheGame == 6) {
                Prime.prime();
            } else {
                exit();
                break;
            }
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
            gameChoosing();
        }
    }

    public static void answer2() {
        if (Engine.expect2.equals(Engine.input2)) {
            System.out.println("Correct!");
        }  else if (Engine.input2.equals("yes")) {
            System.out.println("'yes' is wrong answer ;(. "
                    + "Correct answer was 'no'.\nLet's try again, " + Cli.name + ".");
            Engine.gameChoosing();
            Engine.index = false;
        } else {
            System.out.println("'yes' is wrong answer ;(. "
                    + "Correct answer was 'no'.\nLet's try again, " + Cli.name + ".");
            Engine.index = false;
        }
    }
}
