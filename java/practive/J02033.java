import java.util.Arrays;
import java.util.Scanner;

public class J02033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; ++ i)
        {
            a[i] = sc.nextInt();
            if (a[i] < 0)
                cnt ++ ;
        }
        Arrays.sort(a);
        for (int i = 0; i < Math.min(cnt, k); ++ i)
        {
            a[i] = - a[i];
        }
        Arrays.sort((a));
        if (k > cnt)
        {
            k -= cnt;
            if (k % 2 == 1)
                a[0] = - a[0];
        }
        long res = 0;
        for (int i = 0; i < n; ++i)
            res += (long) a[i];
        System.out.println(res);
    }
}