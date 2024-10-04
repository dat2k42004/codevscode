import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05032 {
    static class age implements Comparable<age> {
        String name, res;
        age (String s)
        {
            String[] tmp = s.split("\\s+");
            name = tmp[0];
            res = tmp[1].substring(6) + tmp[1].substring(3, 5) + tmp[1].substring(0, 2);
        }
        @Override
        public int compareTo(age x)
        {
            return - res.compareTo(x.res);
        }
        @Override
        public String toString()
        {
            return name;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<age> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            a.add(new age(sc.nextLine()));
        }
        Collections.sort(a);
        System.out.println(a.get(0));
        System.out.println(a.get(n - 1));
    }
}
