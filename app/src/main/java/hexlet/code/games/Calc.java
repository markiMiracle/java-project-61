package hexlet.code.games;

import hexlet.code.Engine;

import java.util.List;
import hexlet.code.Utils;

public class Calc {
    public static void calc() {
        final int minNumber = 1;
        final int maxNumber = 100;
        var startMess = "What is the result of the expression?";
        String[][] gameData = new String[2][Engine.ROUNDS];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            int numOfOper = Utils.generateNumber(0, 2);
            int num1 = Utils.generateNumber(minNumber, maxNumber);
            int num2 = Utils.generateNumber(minNumber, maxNumber);
            var expr = expression(numOfOper, num1, num2);
            gameData[0][i] = expr.get(0);
            gameData[1][i] = expr.get(1);
        }

        Engine.gameStart(startMess, gameData);
    }
    public static List<String> expression(int numOfOper, int num1, int num2) {
        char operator;
        if (numOfOper == 1) {
            operator = '+';
        } else if (numOfOper == 2) {
            operator = '-';
        } else {
            operator = '*';
        }
        var question = num1 + " " + operator + " " + num2;
        var answer = Integer.toString(calculate(operator, num1, num2));
        return List.of(question, answer);
    }
    private static Integer calculate(char operator, int number1, int number2) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }
}
