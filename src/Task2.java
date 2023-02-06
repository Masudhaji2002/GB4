import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));

        Deque<Integer> result = sum(d1, d2);
        System.out.println(result);
    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0;
        while (!d1.isEmpty() || !d2.isEmpty() || carry > 0) {
            int num1 = d1.isEmpty() ? 0 : d1.removeLast();
            int num2 = d2.isEmpty() ? 0 : d2.removeLast();
            int sum = num1 + num2 + carry;
            result.addLast(sum % 10);
            carry = sum / 10;
        }
        return result;
    }
}

