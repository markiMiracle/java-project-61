package hexlet.code.games;
import java.util.Random;
import java.util.Scanner;
public class Progression {
    public static void progression() {
        Random random = new Random();
        var stepOfProg = random.nextInt(1, 11);
        var startOfProg = random.nextInt(1, 21);
        var hidden = random.nextInt(1, 11);
        System.out.println("Question: ");
        System.out.print(startOfProg);
        for (var i = 1; i < 11; i++) {
            startOfProg += stepOfProg;
            if (i == hidden) {
                System.out.print(" ... ");
                Engine.expect = startOfProg;
            } else {
                System.out.print(" " + startOfProg + " ");
            }
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        Engine.input = sc.nextInt();
        Engine.answer();
    }
}
