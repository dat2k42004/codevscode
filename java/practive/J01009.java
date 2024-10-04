
import java.util.Scanner;

public class J01009 
{ 
    public static long[] f = new long[21];

    public static void seive()
    {
        f[1] = 1;
        for(int i = 2; i <= 20; ++ i)
        {
            f[i] = f[i-1] * i;
        }
    }
    
    public static void main(String[] args) {
        
        seive();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long res = 0;
        for(int i = 1; i <= n; ++ i) res += f[i];
        System.out.print(res);

    }
}
