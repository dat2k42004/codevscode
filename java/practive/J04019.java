import java.util.Scanner;

public class J04019 {

    public static class Point {
        double x, y;

        Point (double x, double y)
        {
            this.x = x;
            this.y = y;
        }
        static Point nextPoint(Scanner sc)
        {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            return a;
        }

        public double distance(Point a)
        {
            double x1 = x - a.x;
            double y1 = y - a.y;

            return Math.sqrt(x1 * x1 + y1 * y1);
        }
        
    }

    public static class Triangle {
        
        double A, B, C;

        Triangle(Point a, Point b, Point c)
        {   
            A = a.distance(b);
            B = a.distance(c);
            C = b.distance(c);
        }

        public boolean valid()
        {
            if ( A + B > C && A + C > B && B + C > A)
                return true;
            else    
                return false;
        }

        public String getPerimeter()
        {
            return String.format("%.3f", A + B + C);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t -- > 0)
        {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));

            if(!a.valid())
                System.out.println("INVALID");
            else 
                System.out.println(a.getPerimeter());
        }
    }
}
