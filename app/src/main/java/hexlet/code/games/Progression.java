package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void progression() {
        final int minNumber = 1;
        final int maxNumber = 100;
        final int minStep = 1;
        final int maxStep = 10;
        final int minProgressionLength = 6;
        final int maxProgressionLength = 10;
        final int minHiddenIndex = 0;
        var startMessage = "What number is missing in the progression?";
        var gameData = new String[2][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var progressionLength = Utils.generateNumber(minProgressionLength, maxProgressionLength);
            var startOfProgression = Utils.generateNumber(minNumber, maxNumber);
            var stepOfProgression = Utils.generateNumber(minStep, maxStep);
            final int maxHiddenIndex = progressionLength - 1;
            var hidden = Utils.generateNumber(minHiddenIndex, maxHiddenIndex);
            var progression = makeProgression(startOfProgression, stepOfProgression, progressionLength);
            var answer = progression[hidden];
            progression[hidden] = "..";
            String finalProgression = String.join(" ", progression);
            gameData[0][i] = finalProgression;
            gameData[1][i] = answer;

        }
        Engine.gameStart(startMessage, gameData);
    }
    private static String[] makeProgression(int startOfProgression, int stepOfProgression, int progressionLength) {
        String[] progression = new String[progressionLength];
        progression[0] = Integer.toString(startOfProgression);
        for (var i = 1; i < progressionLength; i++) {
            startOfProgression += stepOfProgression;
            progression[i] = Integer.toString(startOfProgression);
        }
        return progression;
    }
}
