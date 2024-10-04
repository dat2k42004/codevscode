
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class J07050 {
    static int t;
    public static class item implements Comparable<item>
    {
        String id, name, group;
        double sell, buy, profit;

        void input(Scanner sc)
        {
            name = sc.nextLine();
            group = sc.nextLine();
            buy = Double.parseDouble(sc.nextLine());
            sell = Double.parseDouble(sc.nextLine());

            profit = sell - buy;
            t ++ ;
            String s = Integer.toString(t);
            if (s.length() < 2) 
                s = "0" + s;
            id = "MH" + s;
        }

        @Override
        public int compareTo(item a)
        {
            if ( this.profit > a.profit )
                return -1;
            return 1;
        }

        void output()
        {
            System.out.printf("%s %s %s %.2f\n", id, name, group, profit);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));

        int n = Integer.parseInt(sc.nextLine());
        t = 0;

        Vector<item> v = new Vector<>();

        for(int i = 0; i < n; ++ i)
        {
            item x = new item();

            x.input(sc);
            v.add(x);
        }
        Collections.sort(v);

        for(item x : v) 
            x.output();
    }
}
