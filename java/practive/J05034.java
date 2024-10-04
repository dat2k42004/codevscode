import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05034 {
    static class interm implements Comparable<interm> {
        String id, name, clas, email, company;
        int num;

        interm(String x, String y, String z, String t, String u, int v)
        {
            id = x;
            name = y;
            clas = z;
            email = t;
            company = u;
            num = v;
        }

        @Override
        public int compareTo(interm a)
        {
            return name.compareTo(a.name);
        }
        @Override
        public String toString()
        {
            return num + " " + id + " " + name + " " + clas + " " + email + " " + company;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<interm> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            a.add(new interm(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), i + 1));
        }
        Collections.sort(a);
        int t = sc.nextInt();
        while(t -- > 0)
        {
            String s = sc.next();
            for (interm x : a)
                if (x.company.equals(s))
                    System.out.println(x);
        }
    }
}

