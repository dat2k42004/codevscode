import java.util.Scanner;
class Point1
{
    double x, y;
    void set(Scanner sc)
    {
        x = sc.nextDouble();
        y = sc.nextDouble();
    }


    double distance(Point1 a)
    {
        double x1 = x - a.x;
        double y1 = y - a.y;

        return Math.sqrt(x1 * x1 + y1 * y1);
    }

    double check(Point1 a, Point1 b)
    {
        double A = this.distance(a);
        double B = this.distance(b);
        double C = a.distance(b);

        if (A + B > C && A + C > B && B + C > A)
            return A + B + C ;
        return -1;
    }
}
public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t -- > 0)
        {
            Point1 a = new Point1();
            Point1 b = new Point1();
            Point1 c = new Point1();

            a.set(sc);
            b.set(sc);
            c.set(sc);

            double res = a.check(b, c);

            if (res == -1)
                System.out.println("INVALID");
            else
                System.out.printf("%.3f\n", res);
        }
    }
}
