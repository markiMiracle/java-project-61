package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n"
                    + "3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner sc = new Scanner(System.in);
        var numOfTheGame = sc.nextInt();
        System.out.println("Your choice: " + numOfTheGame + "\n");
        if (numOfTheGame == 1) {
            Cli.greeting();
        } else if (numOfTheGame == 2) {
            Cli.greeting();
            Even.even();
        } else if (numOfTheGame == 3) {
            Cli.greeting();
            Calc.calc();
        } else if (numOfTheGame == 4) {
            Cli.greeting();
            GCD.gcd();
        } else if (numOfTheGame == 5) {
            Cli.greeting();
            Progression.progression();
        } else if (numOfTheGame == 6) {
            Cli.greeting();
            Prime.prime();
        } else {
            System.out.println("Leave the game...");
        }
    }
}
