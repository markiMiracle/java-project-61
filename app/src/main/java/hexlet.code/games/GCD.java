package hexlet.code.games;
import java.util.ArrayList;
import java.util.Random;
public class GCD {
    public static void gcd() {
        var startMess = "Find the greatest common divisor of given numbers.";
        var gameData = new ArrayList<String>();
        Random random = new Random();
        for (var i = 0; i < Engine.ROUNDS; i++) {
            int firstNum = random.nextInt(1, 101);
            int secondNum = random.nextInt(1, 101);
            gameData.add(firstNum + " " + secondNum + "_" + getDel(firstNum, secondNum));
        }
        Engine.gameStart(startMess, gameData);
    }
    public static Integer getDel(int firstNum, int secondNum) {
        var listOfDel1 = new ArrayList<Integer>();
        var listOfDel2 = new ArrayList<Integer>();
        int del = 1;
        for (var i = 1; i <= firstNum; i++) {
            if (firstNum % i == 0) {
                listOfDel1.add(i);
            }
        }
        for (var i = 1; i <= secondNum; i++) {
            if (secondNum % i == 0) {
                listOfDel2.add(i);
            }
        }
        for (var i = listOfDel1.size() - 1; i >= 0; i--) {
            if (listOfDel2.contains(listOfDel1.get(i))) {
                del = listOfDel1.get(i);
                break;
            }
        }
        return del;
    }
}
