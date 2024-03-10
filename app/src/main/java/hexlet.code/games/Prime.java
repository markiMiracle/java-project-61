package hexlet.code.games;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Prime {
    public static void prime() {
        var startMess = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        List<Integer> primes = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
                53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131,
                137, 139, 149, 151, 157, 163, 167, 173, 179, 181);
        var questions = new ArrayList<String>();
        var answers = new ArrayList<String>();
        Random random = new Random();
        for (var i = 0; i < 3; i++) {
            var number = random.nextInt(1, 182);
            questions.add(Integer.toString(number));
            if (primes.contains(number)) {
                answers.add("yes");
            } else {
                answers.add("no");
            }
        }
        Engine.gameStart(startMess, questions, answers);
    }

}
