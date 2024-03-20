package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n"
                    + "3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner sc = new Scanner(System.in);
        var numOfTheGame = sc.nextInt();
        System.out.println("Your choice: " + numOfTheGame + "\n");
        if (numOfTheGame == 0) {
            System.out.println("Leave the game...");
            System.exit(0);
        } else if (numOfTheGame == 1) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            var name = sc.next();
            System.out.println("Hello, " + name + "!");
        } else if (numOfTheGame == 2) {
            Even.even();
        } else if (numOfTheGame == 3) {
            Calc.calc();
        } else if (numOfTheGame == 4) {
            GCD.gcdGame();
        } else if (numOfTheGame == 5) {
            Progression.progression();
        } else if (numOfTheGame == 6) {
            Prime.prime();
        }
    }
}
