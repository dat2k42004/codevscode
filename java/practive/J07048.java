import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J07048 {

    public static class product implements Comparable<product>
    {
        String id, name;
        int sell, guarantee;

        void input(Scanner sc)
        {
            id = sc.nextLine();
            name = sc.nextLine();

            sell = Integer.parseInt(sc.nextLine());
            guarantee = Integer.parseInt(sc.nextLine());

        }

        @Override
        public int compareTo(product a)
        {
            if (this.sell == a.sell)
                return this.id.compareTo(a.id);
            else if (this.sell > a.sell)
                return -1;
            return 1;
        }

        void output()
        {
            System.out.printf("%s %s %d %d\n", id, name, sell, guarantee);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));

        ArrayList<product> a = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; ++ i)
        {
            product x = new product();
            x.input(sc);
            a.add(x);
        }

        Collections.sort(a);

        for (product x : a) 
            x.output();
    }
}
