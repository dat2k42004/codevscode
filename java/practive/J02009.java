
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList <Integer> a = new ArrayList<>(n);
        ArrayList <Integer> b = new ArrayList<>(n);

        for (int i = 0; i < n; ++ i)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a.add(x);
            b.add(y);
        }

        for(int i = 0; i < n - 1; ++ i)
        {
            for(int j = i + 1; j < n; ++ j)
            {
                if(a.get(i) > a.get(j) || (a.get(i) == a.get(j) && b.get(i) > b.get(j)))
                {
                    Collections.swap(a, i, j);
                    Collections.swap(b, i, j);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; ++ i)
        {
            res = Math.max(res, a.get(i));
            res += b.get(i);
        }

        System.out.println(res);
    }
}
