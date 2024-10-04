import java.util.Scanner;
class Point2
{
    double x, y;

    public void set(Scanner sc)
    {
        x = sc.nextDouble();
        y = sc.nextDouble();
    }

    public double distance(Point2 a)
    {
        double x1 = x - a.x;
        double y1 = y - a.y;

        return Math.sqrt(x1 * x1 + y1 * y1);
    }

    public double checkdistance(Point2 a, Point2 b)
    {
        double A = this.distance(a);
        double B = this.distance(b);
        double C = a.distance(b);

        if ( A + B > C && A + C > B && B + C > A )
            return Math.sqrt((A + B + C) * (A + B - C) * (-A + B + C) * (A - B + C)) * 1 / 4;
        else 
            return -1;
    }
    

}
public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t -- > 0 )
        {
            Point2 a = new Point2();
            Point2 b = new Point2();
            Point2 c = new Point2();

            a.set(sc);
            b.set(sc);
            c.set(sc);
            double res = a.checkdistance(b, c);
            if (res == -1) 
                System.out.println("INVALID");
            else
                System.out.printf("%.2f\n", res);
        }
    }

}
