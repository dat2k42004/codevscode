
import java.util.Scanner;

public class J01013 
{
    static  int[] f = new int[2000001];

    public static void seive()
    {
        for(int i = 2; i * i <= 2000000; ++i)
        {
            if(f[i] == 0)
            {
                for(int j = i * i; j <= 2000000; j += i)
                {
                    f[j] = i;
                }
            }
        }
        for(int i = 2; i <= 2000000; ++i) 
        {
            if(f[i] == 0) 
                f[i] = i;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        seive();
        int t = sc.nextInt();
        long res = 0L;
        while (t -- > 0)
        {
            int n = sc.nextInt();
            while(n != 1)
            {
                res += f[n];
                n /= f[n];
            }
        }
        System.out.print(res);
        
    }
}
