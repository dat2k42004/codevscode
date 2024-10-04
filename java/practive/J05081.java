import java.util.Scanner;
import java.util.Vector;
import java.util.Comparator;
import java.util.Collections;

public class J05081 {
    static int t = 0;

    public static class product {

        String id, name, unit;
        int buy, sell, profit;

        public void set(Scanner sc) {
            t++;
            String s = Integer.toString(t);
            while (s.length() < 3)
                s = "0" + s;
            s = "MH" + s;
            id = s;
            name = sc.nextLine();
            unit = sc.nextLine();
            buy = Integer.parseInt(sc.nextLine());
            sell = Integer.parseInt(sc.nextLine());
            profit = sell - buy;
        }

        public void get() {
            System.out.printf("%s %s %s %d %d %d\n", id, name, unit, buy, sell, profit);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Vector<product> v = new Vector<>();

        for (int i = 0; i < n; ++ i)
        {
            product a = new product();
            a.set(sc);
            v.add(a);
        }

        Collections.sort(v, new Comparator<product>()
        {
            @Override
            public int compare(product a, product b)
            {
                if (a.profit > b.profit) 
                    return -1;
                else if (a.profit == b.profit)
                    if (a.id.compareTo(b.id) < 0)
                        return -1;
                
                return 1;
            }
        });

        for (int i = 0; i < n; ++ i)
        {
            v.get(i).get();
        }
}}

