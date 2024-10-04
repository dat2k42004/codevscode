import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05068 {
    static class store
    {
        String id, name;
        long cost, tax, sum;

        store (String x, long y)
        {
            id = x;
            if (x.endsWith("BP"))
                name = "British Petro";
            else if (x.endsWith("ES"))
                name = "Esso";
            else if (x.endsWith("SH"))
                name = "Shell";
            else if (x.endsWith("CA"))
                name = "Castrol";
            else if (x.endsWith("MO"))
                name = "Mobil";
            else
                name = "Trong Nuoc";
            if (x.startsWith("X"))
                cost = 128000;
            else if (x.startsWith("D"))
                cost = 11200;
            else 
                cost = 9700;
            sum = 1l * cost * y;
            if (x.endsWith("TN"))
                tax = 0l;
            else
            {
                if (x.startsWith("X"))
                tax = (long) Math.round((double) sum * 0.03);
                else if (x.startsWith("D"))
                    tax = (long) Math.round((double) sum * 0.035);
                else if (x.startsWith("N"))
                    tax = (long) Math.round((double) sum * 0.02);
            }   
            sum += tax;
        }
        @Override
        public String toString()
        {
            return String.format("%s %s %d %d %d", id, name, cost, tax, sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<store> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            a.add(new store(sc.next(), sc.nextLong()));
        }
        Collections.sort(a, new Comparator<store>(){
            @Override
            public int compare(store x, store y)
            {
                return x.sum >= y.sum ? -1 : 1;
            }
        });
        for (store x : a)
            System.out.println(x);
    }
}