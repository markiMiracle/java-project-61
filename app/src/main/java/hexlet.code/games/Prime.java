package hexlet.code.games;
import java.util.ArrayList;
import java.util.Random;
public class Prime {
    public static void prime() {
        var startMess = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var gameData = new String[Engine.ROUNDS][Engine.ROUNDS];
        Random random = new Random();
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var number = random.nextInt(1, 182);
            gameData[0][i] = Integer.toString(number);
            if (primeOrNot(number)) {
                gameData[1][i] = "yes";
            } else {
                gameData[1][i] = "no";
            }
        }
        Engine.gameStart(startMess, gameData);
    }
    public static Boolean primeOrNot(int num) {
        var listOfDel = new ArrayList<Integer>();
        for (var i = 1; i < num; i++) {
            if (num % i == 0) {
                listOfDel.add(i);
            }
        }
        return listOfDel.size() == 1;
    }

}
