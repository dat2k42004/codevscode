
import java.util.Scanner;

public class J01006 {
    public static  long[] f = new long[93];

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
            int n = sc.nextInt();

            System.out.println(f[n]);
            --t;
        }
    }
}
