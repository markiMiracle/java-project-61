package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void even() {
        final int minNumber = 1;
        final int maxNumber = 100;
        var startMess = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var gameData = new String[2][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var question = Utils.generateNumber(minNumber, maxNumber);
            var expect = question % 2 == 0 ? "yes" : "no";
            gameData[0][i] = Integer.toString(question);
            gameData[1][i] = expect;
        }
        Engine.gameStart(startMess, gameData);
    }
}
