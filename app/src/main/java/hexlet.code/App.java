package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static String name;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n"
                    + "3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner sc = new Scanner(System.in);
        var numOfTheGame = sc.nextInt();
        System.out.println("Your choice: " + numOfTheGame + "\n");
        if (numOfTheGame == 1) {
            greet();
        } else if (numOfTheGame == 2) {
            greet();
            Even.even();
        } else if (numOfTheGame == 3) {
            greet();
            Calc.calc();
        } else if (numOfTheGame == 4) {
            greet();
            GCD.gcd();
        } else if (numOfTheGame == 5) {
            greet();
            Progression.progression();
        } else if (numOfTheGame == 6) {
            greet();
            Prime.prime();
        } else {
            System.out.println("Leave the game...");
        }
    }
    public static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
