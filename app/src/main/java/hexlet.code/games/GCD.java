package hexlet.code.games;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class GCD {
    public static void gcd() {
        Random random = new Random();
        int firstNum = random.nextInt(1, 101);
        int secondNum = random.nextInt(1, 101);
        var listOfDel1 = new ArrayList<Integer>();
        var listOfDel2 = new ArrayList<Integer>();
        var expect = 0;
        System.out.println("Question: " + firstNum + " " + secondNum);
        for (var i = 1; i <= firstNum; i++) {
            if (firstNum % i == 0) {
                listOfDel1.add(i);
            }
        }
        for (var i = 1; i <= secondNum; i++) {
            if (secondNum % i == 0) {
                listOfDel2.add(i);
            }
        }
        for (var i = listOfDel1.size() - 1; i >= 0; i--) {
            if (listOfDel2.contains(listOfDel1.get(i))) {
                expect = listOfDel1.get(i);
                break;
            }
        }
        Scanner sc = new Scanner(System.in);
        Engine.input = sc.nextInt();
        System.out.println("Your answer: " + Engine.input);
        Engine.answer();
    }
}
