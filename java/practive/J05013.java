
import java.util.Arrays;
import java.util.Scanner;

public class J05013 {
    static class hire implements Comparable<hire> {
        String id, name, status;
        double avg;

        hire (String x, double a, double b, int i) {
            id = String.format("TS%02d", i);
            name = x;
            if (a > 10.0) 
                a /= 10;
            if (b > 10.0) 
                b /= 10;
            avg = Math.round((a + b) * 100.0 / 2) / 100.0;
            if (avg >= 9.5) 
                status = "XUAT SAC";
            else if (avg >= 8.0) 
                status = "DAT";
            else if (avg >= 5.0) 
                status = "CAN NHAC";
            else 
                status = "TRUOT";
        }
        @Override 
        public int compareTo(hire o) {
            return avg > o.avg ? -1 : 1;
        }

        @Override 
        public String toString() {
            return id + " " + name + " " + String.format("%.2f", avg) + " " + status;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        hire[] a = new hire[n];
        sc.nextLine();
        for (int i = 0; i < n; ++ i) {
            a[i] = new hire(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), i + 1);
        }
        Arrays.sort(a);
        for (hire x : a)
            System.out.println(x);
    }
}


