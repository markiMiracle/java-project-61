package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void calc() {
        final int minNumber = 1;
        final int maxNumber = 100;
        var startMessage = "What is the result of the expression?";
        String[][] gameData = new String[2][Engine.ROUNDS];
        final char[] operators = {'+', '-', '*'};
        for (var i = 0; i < Engine.ROUNDS; i++) {
            int indexOperator = Utils.generateNumber(0, 2);
            int number1 = Utils.generateNumber(minNumber, maxNumber);
            int number2 = Utils.generateNumber(minNumber, maxNumber);
            var operator = operators[indexOperator];
            var expression = number1 + " " + operator + " " + number2;
            var answer = calculate(operator, number1, number2);
            gameData[0][i] = expression;
            gameData[1][i] = Integer.toString(answer);
        }
        Engine.gameStart(startMessage, gameData);
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
