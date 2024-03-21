package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int exitNumber = 0;
        final int greetNumber = 1;
        final int evenNumber = 2;
        final int calcNumber = 3;
        final int gcdNumber = 4;
        final int progressionNumber = 5;
        final int primeNumber = 6;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner sc = new Scanner(System.in);
        var numOfTheGame = sc.nextInt();
        System.out.println("Your choice: " + numOfTheGame + "\n");
        if (numOfTheGame == exitNumber) {
            System.out.println("Leave the game...");
            System.exit(0);
        } else if (numOfTheGame == greetNumber) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            var name = sc.next();
            System.out.println("Hello, " + name + "!");
        } else if (numOfTheGame == evenNumber) {
            Even.even();
        } else if (numOfTheGame == calcNumber) {
            Calc.calc();
        } else if (numOfTheGame == gcdNumber) {
            GCD.gcdGame();
        } else if (numOfTheGame == progressionNumber) {
            Progression.progression();
        } else if (numOfTheGame == primeNumber) {
            Prime.prime();
        } else {
            throw new RuntimeException("Unknown game number: " + "\'" + numOfTheGame + "\'");
        }
    }
}
