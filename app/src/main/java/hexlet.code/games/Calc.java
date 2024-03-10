package hexlet.code.games;
import java.util.*;

public class Calc {
    public static void calc() {
        var startMess = "What is the result of the expression?";
        List<String> questions = new ArrayList<>();
        List<String> answers = new ArrayList<>();
        for (var i = 0; i < 3; i++) {
            var expr = expression();
            questions.add(expr.get(0));
            answers.add(expr.get(1));
        }
        Engine.gameStart(startMess, questions, answers);
    }
    public static List<String> expression() {
        Random random = new Random();
        int numOfOper = random.nextInt(3);
        int oper1 = random.nextInt(100);
        int oper2 =  random.nextInt(100);
        var question = "";
        var answer = "";
        if (numOfOper == 1) {
            question = oper1 + " + " + oper2;
            answer = Integer.toString(oper1 + oper2);
        } else if (numOfOper == 2) {
            question = question = oper1 + " - " + oper2;
            answer = Integer.toString(oper1 - oper2);
        } else {
            question = oper1 + " * " + oper2;
            answer = Integer.toString(oper1 * oper2);
        }
        List<String> expr = List.of(question, answer);
        return expr;
    }
}
