import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05010 {
    static int t;
    static class product implements Comparable<product> {
        String name, group;
        int id;
        double profit;
        void in(Scanner sc)
        {
            id = ++ t;
            sc.nextLine();
            name = sc.nextLine();
            group = sc.nextLine();
            double d1, d2;
            d1 = sc.nextDouble();
            d2 = sc.nextDouble();
            profit = d2 - d1;
        }
        @Override
        public int compareTo(product a)
        {
            if (profit == a.profit)
                return id - a.id;
            return profit > a.profit ? -1 : 1;
        }

        void out()
        {
            System.out.printf("%d %s %s %.2f\n", id, name, group, profit);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = 0;
        int n = sc.nextInt();
        ArrayList<product> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            product x = new product();
            x.in(sc);
            a.add(x);
        }
        Collections.sort(a);
        for (product x : a)
            x.out();
    }
}

