import java.util.Scanner;

class Point
{
    double x, y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    double distance(Point a)
    {
        double x1 = (this.x - a.x) * (this.x - a.x);
        double y1 = (this.y - a.y) * (this.y - a.y);
        return Math.sqrt(x1 + y1);
    }

}
public class J04001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while ( t -- > 0 )
        {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());

            System.out.printf("%.4f\n", a.distance(b));
        }



    }
}