import java.util.Scanner;

public class J04011 {
    public static class Vector {
        int x, y, z;

        Vector direction_Vector(Vector a)
        {
            Vector c = new Vector();
            c.x = y * a.z - z * a.y;
            c.y = z * a.x - x * a.z;
            c.z = x * a.y - y * a.x;
            return c;
        }

        public int scalar(Vector a)
        {
            int res = x * a.x + y * a.y + z * a.z;
            return res;
        }
        
    }

    public static class Point3D extends Vector {
    
        int x1, y1, z1;


        Point3D(int a, int b, int c)
        {
            x1 = a;
            y1 = b;
            z1 = c;
        }

        Vector calcu_Vector(Point3D a)
        {
            Vector c = new Vector();
            c.x = x1 - a.x1;
            c.y = y1 - a.y1;
            c.z = z1 - a.z1;
            return c;
        }

        public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4)
        {
            Vector ab = p1.calcu_Vector(p2);
            Vector ac = p1.calcu_Vector(p3);
            Vector ad = p1.calcu_Vector(p4);

            Vector n = ab.direction_Vector(ac);

            int res = n.scalar(ad);

            if (res == 0) 
                return true;
            else 
                return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t -- > 0)
        {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            
            
            if (Point3D.check(p1, p2, p3, p4))
                System.out.println("YES");
            else 
                System.out.println("NO");
            
        }
    }
}
