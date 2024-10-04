
import java.util.Scanner;

public class J01022 
{

    static Scanner sc = new Scanner(System.in);

    static long[] f = new long[93];

    public static void seive()
    {
        f[1] = 1L;
        f[2] = 1L;
        for(int i = 3; i <= 92; ++ i) 
        {
            f[i] = f[i - 2] + f[i - 1];
        }
    }

    public static long find(int n, long k)
    {
        if(n == 1) return 0;
        if(n == 2)
        {
            return 1;
        }
        if(k > f[n - 2]) return find(n - 1, k - f[n - 2]);
        else return find(n - 2, k);
    }

    public static void main(String[] args) {
        seive();
        int t = sc.nextInt();
        while(t -- > 0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();

            System.out.println(find(n, k));
        }
    }
}
