package hexlet.code.games;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Prime {
    public static void prime() {
        List primes = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
                53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131,
                137, 139, 149, 151, 157, 163, 167, 173, 179, 181);
        Random random = new Random();
        var number = random.nextInt(1, 182);
        System.out.println("Question: " + number);
        if (primes.contains(number)) {
            Engine.expect2 = "yes";
        } else {
            Engine.expect2 = "no";
        }
        Scanner sc = new Scanner(System.in);
        Engine.input2 = sc.next();
        Engine.answer2();
    }

}
