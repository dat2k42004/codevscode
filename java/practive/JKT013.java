
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0)
        {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            ArrayList<String> a = new ArrayList<>();
            q.add("6");
            q.add("8");
            while (!q.isEmpty())
            {
                String x = q.peek();
                q.poll();
                if (x.length() < n)
                {
                    q.add(x + "6");
                    q.add(x + "8");
                }
                a.add(x);
            }
            System.out.println(a.size());
            for (int i = a.size() - 1; i >= 0; -- i)
                System.out.print(a.get(i) + ' ');
            System.out.println();
        }
    }
}
