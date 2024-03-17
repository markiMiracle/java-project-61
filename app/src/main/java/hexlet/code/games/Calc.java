package hexlet.code.games;

import hexlet.code.Engine;

import java.util.List;
import java.util.Random;

public class Calc {
    public static void calc() {
        var startMess = "What is the result of the expression?";
        String[][] gameData = new String[2][Engine.ROUNDS];
        Random random = new Random();
        for (var i = 0; i < Engine.ROUNDS; i++) {
            int numOfOper = random.nextInt(3);
            int num1 = random.nextInt(100);
            int num2 =  random.nextInt(100);
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
            answer = getAns(question);
        } else if (numOfOper == 2) {
            question = num1 + " - " + num2;
            answer = getAns(question);
        } else {
            question = num1 + " * " + num2;
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
