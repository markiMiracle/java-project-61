package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progression {
    public static void progression() {
        var startMess = "What number is missing in the progression?";
        var random = new Random();
        var gameData = new String[2][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var progressionLength = Utils.generateNumber(6, 10);
            var startOfProg = Utils.generateNumber();
            var stepOfProg = Utils.generateNumber(1, 10);
            var hidden = Utils.generateNumber(0, progressionLength - 1);
            var prog = makeProgression(startOfProg, stepOfProg, progressionLength);
            var answer = prog[hidden];
            prog[hidden] = "..";
            String finalProg = String.join(" ", prog);
            gameData[0][i] = finalProg;
            gameData[1][i] = answer;

        }
        Engine.gameStart(startMess, gameData);
    }
    public static String[] makeProgression(int startOfProg, int stepOfProg, int progressionLength) {
        String[] progression = new String[10];
        progression[0] = Integer.toString(startOfProg);
        String answer = "";
        for (var i = 1; i < progressionLength; i++) {
            startOfProg += stepOfProg;
            progression[i] = Integer.toString(startOfProg);
        }
        return progression;
    }
}
