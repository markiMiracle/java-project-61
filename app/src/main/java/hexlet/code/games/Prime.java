package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void prime() {
        final int minNumber = 1;
        final int maxNumber = 100;
        var startMessage = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var gameData = new String[2][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var number = Utils.generateNumber(minNumber, maxNumber);
            gameData[0][i] = Integer.toString(number);
            gameData[1][i] = isPrime(number) ? "yes" : "no";
        }
        Engine.gameStart(startMessage, gameData);
    }
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i += 1) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
