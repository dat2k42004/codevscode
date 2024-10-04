
import java.util.Scanner;
import java.util.Stack;

public class JKT014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t -- > 0)
        {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; ++ i)
            {
                a[i] = sc.nextInt();
            }

            Stack<Integer> s = new Stack<>();
            for (int i = 0; i < n; ++ i)
            {
                while (!s.isEmpty() && a[i] >= a[s.peek()])
                {
                    s.pop();
                }
                if(s.isEmpty())
                {
                    System.out.print((i + 1) + " ");
                }
                else
                {
                    System.out.print((i - s.peek()) + " ");
                }
                s.push(i);
            }
            System.out.println();
        }
    }
}
