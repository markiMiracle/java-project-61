package hexlet.code.games;
import java.util.Random;
import java.util.Scanner;
public class Calc {
    public static void calc() {
        Random random =  new Random();
        int numOfOper = random.nextInt(3);
        int firstOper = random.nextInt(100);
        int secondOper =  random.nextInt(100);
        Engine.expect = 0;
        if (numOfOper == 0) {
            Engine.expect = firstOper + secondOper;
            System.out.println("Question: " + firstOper + " + " + secondOper);
        } else if (numOfOper == 1) {
            Engine.expect = firstOper - secondOper;
            System.out.println("Question: " + firstOper + " - " + secondOper);
        } else {
            Engine.expect = firstOper * secondOper;
            System.out.println("Question: " + firstOper + " * " + secondOper);
        }
        Scanner sc = new Scanner(System.in);
        Engine.input = sc.nextInt();
        System.out.println("Your answer: " + Engine.input);
        Engine.answer();
    }
}
