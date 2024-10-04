import java.util.Scanner;

public class J02008 {

    public static long gcd(long a, long b)
    {
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t -- > 0)
        {
            int n = sc.nextInt();

            long res = 1;
            for(int i = 1; i <= n; ++i)
            {
                res = 1L * (res * i) / gcd(res, i);
            }
            System.out.println(res);
        }
    }    
}
