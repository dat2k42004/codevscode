
import java.util.ArrayList;
import java.util.Scanner;

public class J05064 {
    static class teacher 
    {
        String id, name;
        int unit, sum, extra;

        teacher (String x, String y, int z)
        {
            id = x;
            name = y;
            if (x.startsWith("HT"))
                extra = 2000000;
            else if (x.startsWith("HP"))
                extra = 900000;
            else 
                extra = 500000;
            unit = Integer.parseInt(x.substring(2));
            sum = z * unit + extra;
        }

        @Override
        public String toString()
        {
            return String.format("%s %s %d %d %d", id, name, unit, extra, sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<teacher> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            a.add(new teacher(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        int ht = 0, hp = 0;
        for (teacher x : a)
        {
            if (x.id.startsWith("HT") && ht < 1)
            {
                System.out.println(x);
                ht ++ ;
            }
            else if (x.id.startsWith("HP") && hp < 2)
            {
                System.out.println(x);
                hp ++ ;
            }
            else if (x.id.startsWith("GV"))
                System.out.println(x);
        }
    }
}

