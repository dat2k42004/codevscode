
import java.util.ArrayList;
import java.util.Scanner;

public class J05069 {
    static class clb
    {
        String id, name;
        int cost;
        clb (String x, String y, int z)
        {
            id = x;
            name = y;
            cost = z;
        }
        int getcost()
        {
            return cost;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<clb> a = new ArrayList<>();

        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            a.add(new clb(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        int t = sc.nextInt();
        while (t -- > 0)
        {
            sc.nextLine();
            String s = sc.next();
            int res = sc.nextInt();
            for (clb x : a)
            {
                if (s.substring(1, 3).compareTo(x.id) == 0)
                {
                    System.out.printf("%s %s %d\n", s, x.name, res * x.cost);
                }
            }
        }
    }
}

