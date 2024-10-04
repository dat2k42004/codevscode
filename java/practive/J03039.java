
import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while ( t -- > 0 )
        {
            BigInteger a, b;
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();
            
            if (a.equals(a.gcd(b)) || b.equals(a.gcd(b)))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
