package hexlet.code.games;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Progression {
    public static void progression() {
        var startMess = "What number is missing in the progression?";
        var random = new Random();
        var questions = new ArrayList<String>();
        var answers = new ArrayList<String>();
        for (var i = 0; i < 3; i++) {
            var startOfProg = random.nextInt(100);
            var stepOfProg = random.nextInt(1, 11);
            var hidden = random.nextInt(1, 11);
            questions.add(getProg(startOfProg, stepOfProg, hidden).get(0));
            answers.add(getProg(startOfProg, stepOfProg, hidden).get(1));
        }
        Engine.gameStart(startMess, questions, answers);
    }
    public static List<String> getProg(int startOfProg, int stepOfProg, int hidden) {
        var prog = startOfProg + "";
        var answer = "";
        for (var i = 1; i < 11; i++) {
            startOfProg += stepOfProg;
            if (i == hidden) {
                prog += " ...";
                answer = Integer.toString(startOfProg);
            } else {
                prog += " " + startOfProg;
            }
        }
        return List.of(prog, answer);
    }
}
