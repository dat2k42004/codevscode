import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05029 {
    static class  business implements Comparable<business> {
        String id, name;
        int num;
        business (String x, String y, int z)
        {
            id = x;
            name = y;
            num = z;
        }
        @Override
        public int compareTo(business a)
        {
            if (num == a.num)
                return id.compareTo(a.id);
            return a.num - num;
        }
        @Override
        public String toString()
        {
            return id + " " + name + " " + num;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<business> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            String x = sc.nextLine();
            String y = sc.nextLine();
            int z = sc.nextInt();
            a.add(new business(x, y, z));
        }
        Collections.sort(a);
        int t = sc.nextInt();
        while (t -- > 0)
        {
            int a_ = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", a_, b);
            for (business x : a)
            {
                if (x.num >= a_ && x.num <= b)
                    System.out.println(x);
            }
        }
    }
}
