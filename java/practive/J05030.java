import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05030 {
    static int t;
    static class score implements Comparable<score> {
        String name, id, clas;
        double d1, d2, d3, sum;

        score(String x, String y, String z, double a, double b, double c)
        {
            id = x;
            name = y;
            clas = z;
            d1 = a;
            d2 = b;
            d3 = c;
            sum = d1 + d2 + d3;
        }

        @Override
        public int compareTo(score a)
        {
            return id.compareTo(a.id);
        }

        @Override
        public String toString()
        {
            return String.format("%d %s %s %s %.1f %.1f %.1f", ++t, id, name, clas, d1, d2, d3);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<score> a = new ArrayList<>();
        t = 0;
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            a.add(new score(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(a);
        for (score x : a)
            System.out.println(x);
    }
}

