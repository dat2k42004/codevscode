import java.util.Arrays;
import java.util.Scanner;

public class J02027 {  
    static int find(int l, int r, int[] a, int x)
    {
        if (l > r)
            return l;
        int m = (l + r) / 2;
        if(a[m] > x)
            return find(l, m - 1, a, x);
        else    
            return find(m + 1, r, a, x);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++ i)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            long res = 0;
            for (int i = 1; i < n; ++ i)
            {
                int j = find(0, i - 1, a, a[i] - k);
                res += (long) (i - j); 
            }
            System.out.println(res);
        }
    }
}