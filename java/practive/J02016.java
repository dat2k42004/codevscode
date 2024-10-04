
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while ( t -- > 0 )
        {
            int n = sc.nextInt();

            ArrayList<Long> a = new ArrayList<>(n);

            for (int i = 0; i < n; ++ i)
            {
                long x = sc.nextLong();
                a.add(x * x);
            }
            Collections.sort(a);

            boolean ok = false;

            for (int i = 2; i < n; ++ i)
            {
                int l = 0, r = i - 1;
                while(l < r)
                {
                    if (a.get(l) + a.get(r) == a.get(i))
                    {
                        ok = true;
                        break;
                    }
                    else if(a.get(l) + a.get(r) > a.get(i))
                    {
                        r -- ;
                    }
                    else
                    {
                        l ++ ;
                    }
                }
                if (ok)
                {
                    break;
                }
            }
            if(ok)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
    }
}
