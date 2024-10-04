import java.util.*;
public class J02026 {
    static void next(int[] a, int i, int cnt, String s, int k, int n)
    {
        if (cnt == k)
            System.out.println(s);
        for (int j = i; j < n; ++ j)
            next(a, j + 1, cnt + 1, s + a[j] + " ", k, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++ i)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            next(a, 0, 0, "", k, n);
        }
    }
}
