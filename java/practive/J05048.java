import java.util.ArrayList;
import java.util.Scanner;

public class J05048 {
    static class pro 
    {
        String id;
        int in, out, cost, money, tax;
        pro (String x, int y)
        {
            id = x;
            in = y;
            if (x.startsWith("A"))
                out = (int) Math.round((double) y * 0.6);
            else 
                out = (int) Math.round((double) y * 0.7);
            
            if (x.endsWith("Y"))
                cost = 110000;
            else 
                cost = 135000;
            money = cost * out;
            if (x.startsWith("A") && x.endsWith("Y"))
                tax = (int) (money * 0.08);
            else if (x.startsWith("A") && x.endsWith("N"))
                tax = (int) (money * 0.11);
            else if (x.startsWith("B") && x.endsWith("Y"))
                tax = (int) (money * 0.17);
            else 
                tax = (int) (money * 0.22);
        }

        @Override 
        public String toString () 
        {
            return String.format("%s %d %d %d %d %d", id, in, out, cost, money, tax);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<pro> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            a.add(new pro(sc.nextLine(), sc.nextInt()));
        }
        for (pro x : a)
            System.out.println(x);
    }
}
