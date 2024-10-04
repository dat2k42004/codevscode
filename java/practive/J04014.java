import java.util.Scanner;

public class J04014 {

    public static class fraction {

        long numinator, demoninator;

        void set(Scanner sc) {
            numinator = sc.nextInt();
            demoninator = sc.nextInt();
        }

        public long gcd(long a, long b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

        fraction calcu_add(fraction a) {
            fraction c = new fraction();
            c.numinator = numinator * a.demoninator + demoninator * a.numinator;
            c.demoninator = demoninator * a.demoninator;
            c.numinator *= c.numinator;
            c.demoninator *= c.demoninator;

            long res = gcd(c.demoninator, c.numinator);
            c.numinator /= res;
            c.demoninator /= res;
            return c;
        }

        fraction calcu_mul(fraction a, fraction b)
        {
            fraction c = new fraction();
            c.numinator = numinator * a.numinator * b.numinator;
            c.demoninator = demoninator * a.demoninator * b.demoninator;
            long res = gcd(c.demoninator, c.numinator);
            c.numinator /= res;
            c.demoninator /= res;
            return c;
        }
        void get() {
            System.out.printf("%d/%d", numinator, demoninator);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            fraction a = new fraction();
            fraction b = new fraction();

            a.set(sc);
            b.set(sc);

            fraction c = a.calcu_add(b);
            fraction d = a.calcu_mul(b, c);
            c.get();
            System.out.print(' ');
            d.get();
            System.out.println();
        }
    }
}
