import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05053 {
    static class order
    {
        String name, id, num;
        int discount, cost;
        order (String x, String y, int a, int b)
        {
            name = x;
            id = y;
            num = y.substring(1, 4);
            cost = a * b;
            if (y.endsWith("1"))
                discount = (int) Math.round((double) cost * 0.5);
            else if (y.endsWith("2"))
                discount = (int) Math.round((double) cost * 0.3);
            cost -= discount;
        }

        @Override
        public String toString()
        {
            return String.format("%s %s %s %d %d", name, id, num, discount, cost);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<order> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            a.add(new order(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<order>(){
            @Override
            public int compare(order x, order y)
            {
                return x.num.compareTo(y.num);
            }
        });
        for (order x : a)
            System.out.println(x);
    }
}