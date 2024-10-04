
import java.util.ArrayList;
import java.util.Scanner;

public class J05057 {
    static class score 
    {
        String id, name, status;
        double sum, extra;

        score (String x, String y, double a, double b, double c)
        {
            id = x;
            name = y;
            sum = a * 2.0 + b + c;
            if (id.startsWith("KV1"))
                extra = 0.5;
            else if (id.startsWith("KV2"))
                extra = 1.0;
            else if (id.startsWith("KV3"))
                extra = 2.5;
            if (sum + extra >= 24.0) 
                status = "TRUNG TUYEN";
            else 
                status = "TRUOT";
        }
        void output()
        {
            System.out.print(id + " " + name + " ");
            if ((int) extra == extra)
                System.out.printf("%d ", (int) extra);
            else 
                System.out.printf("%.1f ", extra);
            if ((int) sum == sum)
                System.out.printf("%d ", (int) sum);
            else 
                System.out.printf("%.1f ", sum);
            System.out.println(status);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<score> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            a.add(new score(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        }
        for (score x : a)
            x.output();
    }
}

