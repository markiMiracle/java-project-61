package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcdGame() {
        var startMess = "Find the greatest common divisor of given numbers.";
        var gameData = new String[2][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            int firstNum = Utils.generateNumber();
            int secondNum = Utils.generateNumber();
            gameData[0][i] = firstNum + " " + secondNum;
            gameData[1][i] = Integer.toString(gcd(firstNum, secondNum));
        }
        Engine.gameStart(startMess, gameData);
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
