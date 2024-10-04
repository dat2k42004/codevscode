import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07008 {

    

    public static void next(int i, int cnt, int[] a, int[] ans, int n, TreeSet<String> ts, String s)
    {
        if (cnt > 1)
            ts.add(s);
        if (cnt == n)
            return;
        for (int j = i; j < n; ++ j)
        {
            if(cnt == 0)
                ans[cnt] = a[j];
            else if (a[j] > ans[cnt - 1])
                ans[cnt] = a[j];
            else
                continue;
            next(j + 1, cnt + 1, a, ans, n, ts, s + Integer.toString(ans[cnt]) + " ");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; ++ i)
            a[i] = sc.nextInt();

        TreeSet<String> ts = new TreeSet<>();

        int[] ans = new int[n];


        next(0, 0, a, ans, n, ts, "");

        ts.forEach(s -> System.out.println(s)); 
    }
}
