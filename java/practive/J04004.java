import java.util.Scanner;

class fraction1 {
    long numerator;
    long denominator;
    static Scanner sc = new Scanner(System.in);

    public void Input(Scanner sc) {
        numerator = sc.nextLong();
        denominator = sc.nextLong();
    }

    public void Output() {
        System.out.printf("%d/%d", numerator, denominator);
    }

    public long gcd(long a, long b)
    {
        if (b == 0) 
            return a;
        else return gcd(b, a % b);
    }

    public void Compact() {
        long b = gcd(numerator, denominator);
        numerator /= b;
        denominator /= b;
    }

    fraction1 Add(fraction1 b) {
        fraction1 c = new fraction1();
        c.denominator = denominator * b.denominator;
        c.numerator = numerator * b.denominator + denominator * b.numerator;
        c.Compact();
        return c;
    }
}

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fraction1 a = new fraction1();
        fraction1 b = new fraction1();
        a.Input(sc);
        b.Input(sc);
        fraction1 c = a.Add(b);
        c.Output();
    }
}