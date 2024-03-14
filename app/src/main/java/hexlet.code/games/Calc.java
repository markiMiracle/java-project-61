package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Calc {
    public static void calc() {
        var startMess = "What is the result of the expression?";
        String[][] gameData = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var expr = expression();
            gameData[0][i] = expr.get(0);
            gameData[1][i] = expr.get(1);
        }

        Engine.gameStart(startMess, gameData);
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
            answer = getAns(question);
        } else if (numOfOper == 2) {
            question = oper1 + " - " + oper2;
            answer = getAns(question);
        } else {
            question = oper1 + " * " + oper2;
            answer = getAns(question);
        }
        List<String> expr = List.of(question, answer);
        return expr;
    }
    public static String getAns(String question) {
        if (question.contains("+")) {
            var mass = question.split(" ");
            return Integer.toString(Integer.parseInt(mass[0]) + Integer.parseInt(mass[2]));
        } else if (question.contains("-")) {
            var mass = question.split(" ");
            return Integer.toString(Integer.parseInt(mass[0]) - Integer.parseInt(mass[2]));
        } else {
            var mass = question.split(" ");
            return Integer.toString(Integer.parseInt(mass[0]) * Integer.parseInt(mass[2]));
        }
    }
}
