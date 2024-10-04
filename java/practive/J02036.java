// import java.util.*;
import java.util.Scanner;
public class J02036 {

    public static int gcd(int a, int b)
    {
        if ( b == 0)
            return a;
        else 
            return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while ( t -- > 0 )
        {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; ++ i)
            {
                a[i] = sc.nextInt();
            }

            System.out.print(a[0] + " ");
            for(int i = 1; i < n; ++ i)
            {
                System.out.print(a[i] * a[i - 1] / gcd(a[i], a[i - 1]) + " ");
            }
            System.out.println(a[n - 1]);
        }
    }
}
