import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J05062 {

    static class bourse {
        String name, status;
        double gpa;
        bourse(String s, double x, double y) {
            gpa = x;
            name = s;
            if (x >= 3.6 && y >= 90)
                status = "XUATSAC";
            else if (x >= 3.2 && y >= 80)
                status = "GIOI";
            else if (x >= 2.5 && y >= 70)
                status = "KHA";
            else 
                status = "KHONG";
        }
        @Override 
        public String toString () {
            return name + ": " + status;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        ArrayList<Double> b = new ArrayList<>();
        bourse[] a = new bourse[n];
        for (int i = 0; i < n; ++ i) {
            sc.nextLine();
            String s = sc.nextLine();
            double r = sc.nextDouble();
            int x = sc.nextInt();
            a[i] = new bourse(s, r, x);
        }
        for (int i = 0; i < n; ++ i) {
            if (a[i].status.compareTo("KHONG") != 0) 
                b.add(a[i].gpa);
        }
        Collections.sort(b);
        double res;
        if (t > b.size())
            res = b.get(0);
        else 
            res = b.get(b.size() - t); 
        for (int i = 0; i < n; ++ i) {
            if (t >= 0 && a[i].status.compareTo("KHONG") != 0 && a[i].gpa >= res) {
                if (t > 0 )
                    t -- ;
                System.out.println(a[i]);
            }
            else {
                a[i].status = "KHONG";
                System.out.println(a[i]);
            }
        }
    }
}
