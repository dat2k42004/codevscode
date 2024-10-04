
import java.util.Scanner;
import java.util.Stack;

public class J08023 {
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

            long res = 0l;
            Stack<Integer> s = new Stack<>();
            for (int i = 0; i < n; ++ i)
            {
                while(!s.isEmpty() && a[i] < a[s.peek()])
                {
                    int x = s.peek();
                    s.pop();
                    if(s.isEmpty())
                    {
                        res = Math.max(res, 1l * a[x] * i);
                    }
                    else
                    {
                        res = Math.max(res, 1l * a[x] * (i - s.peek() - 1));
                    }
                }
                s.push(i);
            }
            while (!s.isEmpty())
            {
                int x = s.peek();
                s.pop();
                if(s.isEmpty())
                {
                    res = Math.max(res, 1l * a[x] * n);
                }
                else
                {
                    res = Math.max(res, 1l * a[x] * (n - s.peek() - 1));
                }
            }
            System.out.println(res);
        }
    }
}

