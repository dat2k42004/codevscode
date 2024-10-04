import java.util.Scanner;
class fraction
{
    long numerator, demoninator;

    public void set(Scanner sc)
    {
        this.numerator = sc.nextLong();

        this.demoninator = sc.nextLong();
    }

    public long gcd(long a, long b)
    {
        if ( b == 0 )
            return a;
        else return gcd(b, a % b);
    }

    public long lcm(long a, long b)
    {
        return a * b / gcd(a, b);
    }

    public void get()
    {
        long res = gcd(numerator, demoninator);
        System.out.print(numerator / res + "/" + demoninator / res);
    }
}
public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        fraction a = new fraction();

        a.set(sc);

        a.get();
    }
}
