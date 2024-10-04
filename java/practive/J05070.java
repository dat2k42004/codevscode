
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05070 {
    static class clb implements Comparable<clb>
    {
        String id, name, match;
        int cost, revenue;
        clb (String x, String y, int z)
        {
            id = x;
            name = y;
            cost = z;
        }
        int getcost()
        {
            return cost;
        }
        @Override
        public int compareTo(clb a)
        {
            if (revenue == a.revenue)
                return name.compareTo(a.name);
            return a.revenue - revenue;
        }
        @Override
        public String toString()
        {
            return match + " " + name + " " + revenue;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<clb> a = new ArrayList<>();

        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            a.add(new clb(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        int t = sc.nextInt();
        ArrayList<clb> b = new ArrayList<>();
        while (t -- > 0)
        {
            sc.nextLine();
            String s = sc.next();
            int res = sc.nextInt();
            for (clb x : a)
            {
                if (s.substring(1, 3).compareTo(x.id) == 0)
                {
                    x.revenue = res * x.getcost();
                    x.match = s;
                    b.add(x);
                }
            }
        }
        Collections.sort(b);
        for (clb x : b)
            System.out.println(x);
    }
}


