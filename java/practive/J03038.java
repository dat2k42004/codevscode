
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        Set<Character> ss = new HashSet<Character>();

        for (int i = 0; i < s.length(); ++ i)
        {
            ss.add(s.charAt(i));
        }

        System.out.println(ss.size());
    }
}
