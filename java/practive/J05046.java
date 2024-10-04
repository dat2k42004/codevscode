
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05046 {

    static class product 
    {
        String id, name;
        int discount, cost;

        product (String x, String y, int a, int b)
        {
            name = x;
            id = y;
            cost = a * b;
            if (a > 10) 
                discount = (int) cost / 20;
            else if (a >= 8)
                discount = (int) cost / 50;
            else if (a >= 5)
                discount = (int) cost / 100;
            else 
                discount = 0;
            cost -= discount;
        }

        @Override
        public String toString()
        {
            return String.format("%s %s %d %d", id, name, discount, cost);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<product> a = new ArrayList<>();
        HashMap<String, Integer> m = new HashMap<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            String x = sc.nextLine();
            int a1 = sc.nextInt();
            int b = sc.nextInt();
            String res[] = x.trim().split("\\s+");
            String y = "";
            for (int j = 0; j < 2; ++ j)
            {
                y += res[j].substring(0, 1).toUpperCase();
            }
            if (m.containsKey(y))
            {
                int tmp = m.get(y) + 1;
                m.put(y, tmp);
                y = y + String.format("%02d", tmp);
            }
            else
            {
                m.put(y, 1);
                y = y + String.format("%02d", 1);
            }
            a.add(new product(x, y, a1, b));
        }
        for (product x : a)
            System.out.println(x);
    }
}

