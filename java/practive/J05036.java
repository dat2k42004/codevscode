import java.util.ArrayList;
import java.util.Scanner;


public class J05036 {
    static class product {
        String id, name, unit;
        long buy, num, deli, cost, sell;

        product(String name, String unit, int buy, int num, int t)
        {
            this.name = name;
            this.buy = buy;
            this.unit = unit;
            this.num = num;
            id = String.format("MH%02d", t);
            deli = Math.round((double) buy * num * 0.05);
            cost = buy * num + deli;
            sell = Math.round((double) cost * 0.02) + cost;
        }
        @Override
        public String toString()
        {
            return id + " " + name + " " + unit + " " + deli + " " + cost + " " + sell;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<product> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            a.add(new product(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), i + 1));
        }
        for (product x : a)
            System.out.println(x);
    }
}
