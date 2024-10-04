
import java.util.Scanner;

public class J01011 
{

    public static int gcd (int a, int b)
    {
        if ( b == 0 ) return a;
        else return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while( t > 0 )
        {
            int a = sc.nextInt(), b = sc.nextInt();

            System.out.println(((long) a * b / (long)gcd(a, b)) + " " + gcd(a, b));
            -- t;
        }
    }
    
}
