package hexlet.code.games;

import java.util.List;
public class Even {
    public static void even() {
        var startMess = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var question1 = (int) (Math.random() * 100);
        var question2 = (int) (Math.random() * 100);
        var question3 = (int) (Math.random() * 100);
        var expect1 = question1 % 2 == 0 ? "yes" : "no";
        var expect2 = question2 % 2 == 0 ? "yes" : "no";
        var expect3 = question3 % 2 == 0 ? "yes" : "no";
        var answers = List.of(expect1, expect2, expect3);
        var questions = List.of(Integer.toString(question1), Integer.toString(question2), Integer.toString(question3));
        Engine.gameStart(startMess, questions, answers);
    }
}
