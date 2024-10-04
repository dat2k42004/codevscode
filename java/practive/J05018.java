import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class J05018 {
    static class score implements Comparable<score> {
        String name, mid_score, id, status;

        public score(String s, double[] a, int t)
        {
            id = String.format("HS%02d", t);
            name = s;
            double sum = 2.0 * a[0] + 2.0 * a[1];
            for(int i = 2; i < 10; ++ i)
                sum += a[i];
            sum = sum / 10 / 1.2;
            mid_score = String.format("%.1f", sum);
            if (sum >= 9.0)
                status = "XUAT SAC";
            else if (sum >= 8.0)
                status = "GIOI";
            else if (sum >= 7.0)
                status = "KHA";
            else if (sum >= 5.0)
                status = "TB";
            else
                status = "YEU";
        }

        @Override
        public int compareTo(score a)
        {
            if (mid_score.compareTo(a.mid_score) == 0)
                return id.compareTo(a.id);
            return -mid_score.compareTo(a.mid_score);
        }

        void out()
        {
            System.out.printf("%s %s %s %s\n", id, name, mid_score, status);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<score> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            String s = sc.nextLine();
            double[] x = new double[10];
            for (int j = 0; j < 10; ++ j)
                x[j] = sc.nextDouble();
            a.add(new score(s, x, i + 1));
        }
        Collections.sort(a);
        for (score x : a)
            x.out();
    }
}
