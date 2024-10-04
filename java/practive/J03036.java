import java.util.Scanner;

public class J03036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; ++ i)
        {
            a[i] = sc.next();
        }
        int m = a[0].length();
        String s = a[0] + a[0];
        int[] f = new int[n];
        for (int i = 0; i < n; ++ i)
        {
            if (a[i].length() != m)
            {
                System.out.println(-1);
                return;
            }
            f[i] = s.indexOf(a[i]);
            if (f[i] == -1)
            {
                System.out.println(-1);
                return;
            }
        }
        int res = m * n;
        for (int i = 0; i < m; ++ i)
        {
            int tmp = 0;
            for (int j = 0; j < n; ++j)
            {
                tmp += (i - f[j] + m) % m;
            }
            res = Math.min(res, tmp);
        }
        System.out.println(res);
    }
}
