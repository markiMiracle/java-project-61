package hexlet.code;
import hexlet.code.games.Engine;
import java.util.Scanner;
public class Cli {
    public static String name;
    public static void greeting() {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Hello, " + name + "!\nAre you ready to start?");
        Engine.gameChoosing();
    }
}
