package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

import static hexlet.code.games.Engine.exit;

public class App {
    public static void main(String[] args) {
        public static void gameChoosing() {
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
            if (numOfTheGame == 1) {
                Cli.greeting();
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
            }
            }
        }
    }
}