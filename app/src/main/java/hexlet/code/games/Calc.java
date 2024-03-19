package hexlet.code.games;

import hexlet.code.Engine;

import java.util.List;
import hexlet.code.Utils;

public class Calc {
    public static void calc() {
        var startMess = "What is the result of the expression?";
        String[][] gameData = new String[2][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            int numOfOper = Utils.generateNumber(0, 2);
            int num1 = Utils.generateNumber(1, 100);
            int num2 =  Utils.generateNumber(1, 100);
            var expr = expression(numOfOper, num1, num2);
            gameData[0][i] = expr.get(0);
            gameData[1][i] = expr.get(1);
        }

        Engine.gameStart(startMess, gameData);
    }
    public static List<String> expression(int numOfOper, int num1, int num2) {
        var question = "";
        var answer = "";
        if (numOfOper == 1) {
            question = num1 + " + " + num2;
        } else if (numOfOper == 2) {
            question = num1 + " - " + num2;
        } else {
            question = num1 + " * " + num2;
        }
        answer = Integer.toString(calculate(question));
        List<String> expr = List.of(question, answer);
        return expr;
    }
    public static Integer calculate(String question) {
        if (question.contains("+")) {
            var mass = question.split(" ");
            return Integer.parseInt(mass[0]) + Integer.parseInt(mass[2]);
        } else if (question.contains("-")) {
            var mass = question.split(" ");
            return Integer.parseInt(mass[0]) - Integer.parseInt(mass[2]);
        } else {
            var mass = question.split(" ");
            return Integer.parseInt(mass[0]) * Integer.parseInt(mass[2]);
        }
    }
}
