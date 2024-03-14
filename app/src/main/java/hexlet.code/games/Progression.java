package hexlet.code.games;
import java.util.ArrayList;
import java.util.Random;

public class Progression {
    public static void progression() {
        var startMess = "What number is missing in the progression?";
        var random = new Random();
        var gameData = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var startOfProg = random.nextInt(100);
            var stepOfProg = random.nextInt(1, 11);
            var hidden = random.nextInt(1, 11);
            var prog = getProg(startOfProg, stepOfProg);
            var answer = prog[hidden];
            prog[hidden] = "...";
            String finalProg = String.join(" ", prog);
            gameData[0][i] = finalProg;
            gameData[1][i] = answer;

        }
        Engine.gameStart(startMess, gameData);
    }
    public static String[] getProg(int startOfProg, int stepOfProg) {
        String[] prog = new String[10];
        prog[0] = Integer.toString(startOfProg);
        String answer = "";
        for (var i = 1; i < 10; i++) {
            startOfProg += stepOfProg;
            prog[i] = Integer.toString(startOfProg);
        }
        return prog;
    }
}
