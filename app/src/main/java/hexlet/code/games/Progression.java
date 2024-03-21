package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progression {
    public static void progression() {
        final int minNumber = 1;
        final int maxNumber = 100;
        final int minStep = 1;
        final int maxStep = 10;
        final int minProgressionLength = 6;
        final int maxProgressionLength = 10;
        final int minHiddenIndex = 0;
        final int maxHiddenIndex = maxProgressionLength - 1;
        var startMess = "What number is missing in the progression?";
        var random = new Random();
        var gameData = new String[2][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var progressionLength = Utils.generateNumber(minProgressionLength, maxProgressionLength);
            var startOfProg = Utils.generateNumber(minNumber, maxNumber);
            var stepOfProg = Utils.generateNumber(minStep, maxStep);
            var hidden = Utils.generateNumber(minHiddenIndex, maxHiddenIndex);
            var prog = makeProgression(startOfProg, stepOfProg, progressionLength);
            var answer = prog[hidden];
            prog[hidden] = "..";
            String finalProg = String.join(" ", prog);
            gameData[0][i] = finalProg;
            gameData[1][i] = answer;

        }
        Engine.gameStart(startMess, gameData);
    }
    private static String[] makeProgression(int startOfProg, int stepOfProg, int progressionLength) {
        String[] progression = new String[progressionLength];
        progression[0] = Integer.toString(startOfProg);
        String answer = "";
        for (var i = 1; i < progressionLength; i++) {
            startOfProg += stepOfProg;
            progression[i] = Integer.toString(startOfProg);
        }
        return progression;
    }
}
