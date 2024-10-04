import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05028 {
    static class business {
        String id, name;
        int num;
        business(String i, String n, int x)
        {
            id = i;
            name = n;
            num = x;
        }
        @Override
        public String toString()
        {
            return id + " " + name + " " + num;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<business> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            String x = sc.nextLine();
            String m = sc.nextLine();
            int y = sc.nextInt();
            a.add(new business(x, m, y));
        }
        Collections.sort(a, new Comparator<business>() {
            @Override
            public int compare(business x, business y)
            {
                if (x.num == y.num)
                    return x.id.compareTo(y.id);
                return -(x.num - y.num);
            }
        });

        for (business x : a)
            System.out.println(x);
    }
}
