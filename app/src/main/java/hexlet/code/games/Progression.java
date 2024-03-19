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
            var minProg = 6;
            var maxProg = 10;
            var minNum = 1;
            var maxNum = 100;
            var minStep = 1;
            var maxStep = 10;
            var progressionLength = Utils.generateNumber(minProg, maxProg);
            var startOfProg = Utils.generateNumber(minNum, maxNum);
            var stepOfProg = Utils.generateNumber(minStep, maxStep);
            var hidden = Utils.generateNumber(progressionLength - 1);
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
