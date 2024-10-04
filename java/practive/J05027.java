import java.util.ArrayList;
import java.util.Scanner;

public class J05027 {
    static class teacher {
        String id, name, sub;
        teacher(String n, String s, int t)
        {
            id = String.format("GV%02d", t);
            name = n;
            String res[] = s.split("\\s+");
            sub = "";
            for (String x : res)
                sub += x.substring(0, 1).toUpperCase();
        }
        @Override
        public String toString()
        {
            return id + " " + name + " " + sub;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<teacher> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            String m = sc.nextLine();
            String s = sc.nextLine();
            a.add(new teacher(m, s, i + 1));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while (t -- > 0)
        {
            String s = sc.nextLine();
            String x = s.toLowerCase();
            String y = x.substring(0, 1).toUpperCase() + x.substring(1);
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n", s);
            for (teacher i : a)
            {
                if (i.name.indexOf(x) > -1 || i.name.indexOf(y) > -1)
                    System.out.println(i);
            }
        }
    }
}

