
import java.util.ArrayList;
import java.util.Scanner;

public class J05050 {
    static class bill_electric 
    {
        String id;
        int unit, cost, extra, sum;

        bill_electric (String x, int a, int b, int t)
        {
            id = String.format("KH%02d", t);
            if (x.equals("KD"))
                unit = 3;
            else if (x.equals("NN"))
                unit = 5;
            else if (x.equals("TT"))
                unit = 4;
            else 
                unit = 2;
            cost = (b - a) * unit * 550;
            if (b - a > 100)
                extra = cost;
            else if (b - a >= 50)
                extra = (int) Math.ceil((double) cost * 0.35);
            else 
                extra = 0;
            sum = cost + extra;
        }

        @Override 
        public String toString()
        {
            return String.format("%s %d %d %d %d", id, unit, cost, extra, sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<bill_electric> a = new ArrayList<>();
        for (int i = 1; i <= n; ++ i)
        {
            sc.nextLine();
            a.add(new bill_electric(sc.nextLine(), sc.nextInt(), sc.nextInt(), i));
        }
        for (bill_electric x : a)
            System.out.println(x);
    }    
}

