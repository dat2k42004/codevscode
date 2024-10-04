import java.util.Scanner;
class Point3
{
    double x, y;

    public void set(Scanner sc)
    {
        x = sc.nextDouble();
        y = sc.nextDouble();
    }

    public double distance(Point3 a)
    {
        double x1 = x - a.x;
        double y1 = y - a.y;

        return Math.sqrt(x1 * x1 + y1 * y1);
    }

    public double checkdistance(Point3 a, Point3 b)
    {
        double A = this.distance(a);
        double B = this.distance(b);
        double C = a.distance(b);

        if ( A + B > C && A + C > B && B + C > A )
            return Math.pow(A * B * C / Math.sqrt((A + B + C) * (A + B - C) * (-A + B + C) * (A - B + C)), 2) * Math.PI;
        else 
            return -1;
    }
    

}
public class J04010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t -- > 0 )
        {
            Point3 a = new Point3();
            Point3 b = new Point3();
            Point3 c = new Point3();

            a.set(sc);
            b.set(sc);
            c.set(sc);
            double res = a.checkdistance(b, c);
            if (res == -1) 
                System.out.println("INVALID");
            else
                System.out.printf("%.3f\n", res);
        }
    }

}
