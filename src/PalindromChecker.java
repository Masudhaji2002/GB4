// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class PalindromChecker {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println("Is the sequence a palindrome: " + checkPalindrome(deque));
    }

    public static boolean checkPalindrome(Deque<Integer> deque) {
        if (deque.isEmpty() || deque.size() == 1) {
            return true;
        }

        int first = deque.pollFirst();
        int last = deque.pollLast();

        if (first != last) {
            return false;
        }

        return checkPalindrome(deque);
    }
}
