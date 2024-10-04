import java.util.Scanner;

public class J02028 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while ( t -- > 0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            boolean res = false;
            for(int i = 0; i < n; ++ i)
            {
                a[i] = sc.nextLong();
                if (a[i] == 0)
                    res = true;
            }
            if(k == 0)
            {
                if (res)
                    System.out.println("YES");
                else    
                    System.out.println("NO");
                continue;
            }
            boolean ok = false;
            long sum = 0;
            int l = 0;
            for (int r = 0; r < n; ++ r)
            {
                sum += a[r];
                while(sum > k && l <= r)
                {
                    sum -= a[l];
                    l ++;
                }
                if(sum == k)
                {
                    ok = true;
                    break;
                }
            }
            if (ok) 
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}