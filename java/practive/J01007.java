
import java.util.Scanner;

public class J01007 
{
    public static long[] f = new long[93];

    public static void seive()
    {
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= 92; ++ i)
        {
            f[i] = f[i-1] + f[i-2];
        }
    }
    

    public static void main(String[] args) {
        
        seive();

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while ( t > 0 )
        {
            long n = sc.nextLong();
            
            boolean ok = false;
            for(int i = 0; i <= 92; ++ i)
            {
                if(n == f[i])
                {
                    ok = true;
                    System.out.println("YES");
                    break;
                }
            }
            if ( ! ok ) System.out.println("NO");
            -- t;
        }
    }
}
