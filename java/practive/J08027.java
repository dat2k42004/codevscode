
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class J08027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '<') {
                if (!left.isEmpty()) {
                    right.addFirst(left.removeLast());
                }
            } else if (ch == '>') {
                if (!right.isEmpty()) {
                    left.addLast(right.removeFirst());
                }
            } else if (ch == '-') {
                if (!left.isEmpty()) {
                    left.removeLast();
                }
            } else {
                left.addLast(ch);
            }
        }

        StringBuilder output = new StringBuilder();
        for (char ch : left) {
            output.append(ch);
        }
        for (char ch : right) {
            output.append(ch);
        }

        System.out.println(output.toString());
    }
}
