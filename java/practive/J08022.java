
import java.util.Scanner;
import java.util.Stack;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] f = new int[n];
            for (int i = 0; i < n; ++ i)
            {
                a[i] = sc.nextInt();
                f[i] = -1;
            }
            Stack<Integer> s = new Stack<>();
            for (int i = 0; i < n; ++ i)
            {
                while(!s.isEmpty() && a[i] > a[s.peek()])
                {
                    f[s.peek()] = a[i];
                    s.pop();
                }
                s.push(i);
            }
            for (int i = 0; i < n; ++ i)
                System.out.printf("%d ", f[i]);
            System.out.println();
        }
    }
}


