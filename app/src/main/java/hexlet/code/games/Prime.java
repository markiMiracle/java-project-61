package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
public class Prime {
    public static void prime() {
        var startMess = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var gameData = new String[2][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var number = Utils.generateNumber(-182, 182);
            gameData[0][i] = Integer.toString(number);
            if (isPrime(number)) {
                gameData[1][i] = "yes";
            } else {
                gameData[1][i] = "no";
            }
        }
        Engine.gameStart(startMess, gameData);
    }
    public static boolean isPrime(int num) {
        var listOfDel = new ArrayList<Integer>();
        if (num > 1) {
            for (var i = 1; i < num; i++) {
                if (num % i == 0) {
                    listOfDel.add(i);
                }
            }
        } else {
            for (var i = -1; i > num; i--) {
                if (num % i == 0) {
                    listOfDel.add(i);
                }
            }
        }

        return listOfDel.size() == 1;
    }

}
