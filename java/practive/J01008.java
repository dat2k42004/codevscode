
import java.util.Scanner;

public class J01008 {

    public static void solve(int n)
    {
        for(int i = 2; i <= Math.sqrt(n); ++ i)
        {
            if(n % i == 0)
            {
                int res = 0;
                while ( n % i == 0)
                {
                    res ++ ;
                    n /= i;
                }
                System.out.print(i + "(" + res + ") ");
            }
        }
        if(n > 1) System.out.print(n + "(" + 1 + ")");
        System.out.println();
    }
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int  t = sc.nextInt();

        for( int i = 1; i <= t; ++ i)
        {
            int n = sc.nextInt();

            System.out.print("Test " + i + ": ");
            solve(n);
        }
    }
}
// Test 1: 2(2) 3(1) 5(1)  