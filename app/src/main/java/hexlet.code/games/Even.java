package hexlet.code.games;
import java.util.Scanner;
public class Even {
    public static void even() {
        var number = (int) (Math.random() * 100);
        var expectic = "";
        System.out.println("Question : " + number);
        Scanner sc = new Scanner(System.in);
        Engine.expect2 = number % 2 == 0 ? "yes" : "no";
        Engine.input2 = sc.next();
        Engine.answer2();
    }
}
