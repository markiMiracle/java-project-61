package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcdGame() {
        final int minNumber = 1;
        final int maxNumber = 100;
        var startMessage = "Find the greatest common divisor of given numbers.";
        var gameData = new String[2][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.generateNumber(minNumber, maxNumber);
            int secondNumber = Utils.generateNumber(minNumber, maxNumber);
            gameData[0][i] = firstNumber + " " + secondNumber;
            gameData[1][i] = Integer.toString(gcd(firstNumber, secondNumber));
        }
        Engine.gameStart(startMessage, gameData);
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
