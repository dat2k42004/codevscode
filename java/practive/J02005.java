

import java.util.Arrays;
import java.util.Scanner;


public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        int[] a = new int[n], b = new int[m];
        int[] f = new int[1000];
        for(int i = 0; i < n; ++ i) 
        {
            a[i] = sc.nextInt();
            f[a[i]] = 1;
        }
        for(int i = 0; i < m; ++ i)
        {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        for(int i = 0; i < m; ++ i)
        {
            if(f[b[i]] == 1)
            {
                System.out.print(b[i] + " ");
                f[b[i]] = 0;
            }
        }
    }
}
