import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05042 {
    static class rank implements Comparable<rank> {
        String name;
        int num, sub;

        rank(String a, int x, int y)
        {
            name = a;
            num = x;
            sub = y;
        }
        
        @Override
        public int compareTo(rank a)
        {
            if (num == a.num)
            {
                if (sub == a.sub)
                    return name.compareTo(a.name);
                else 
                    return sub - a.sub;
            }
            return a.num - num;
        }
        @Override
        public String toString()
        {
            return name + " " + num + " " + sub;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<rank> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            sc.nextLine();
            a.add(new rank(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a);
        for (rank x : a)
            System.out.println(x);
    }
}
