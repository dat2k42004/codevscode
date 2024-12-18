import java.util.ArrayList;
import java.util.Scanner;

public class J05044 {

    static class income 
    {
        String id, name, posi;
        int  tempo, remain, salary, extra;

        income (String x, String y, int z, int t, int u)
        {
            id = String.format("NV%02d", u);
            name = x;
            posi = y;
            if (y.equals("GD"))
                extra = 500;
            else if (y.equals("PGD"))
                extra = 400;
            else if (y.equals("TP"))
                extra = 300;
            else if (y.equals("KT"))
                extra = 250;
            else 
                extra = 100;

            salary = z * t;
            if ((extra + salary) * 2 / 3 < 25000)
                tempo = (int) (Math.round((double)(extra + salary) * 2 / 3 / 1000.0) * 1000);
            else 
                tempo = 25000;
            remain = extra + salary - tempo;
        }
        @Override
        public String toString()
        {
            return String.format("%s %s %d %d %d %d", id, name, extra, salary, tempo, remain);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<income> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            a.add(new income(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), i + 1));
        }
        sc.nextLine();
        String s = sc.next();
        for (income x : a) 
            if (x.posi.equals(s)) 
                System.out.println(x);
    }
}
