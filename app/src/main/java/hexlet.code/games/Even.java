package hexlet.code.games;

import java.util.ArrayList;
public class Even {
    public static void even() {
        var startMess = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var gameData = new ArrayList<String>();
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var question = (int) (Math.random() * 100);
            var expect = question % 2 == 0 ? "yes" : "no";
            gameData.add(question + "_" + expect);
        }
        Engine.gameStart(startMess, gameData);
    }
}
