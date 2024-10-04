import java.util.Scanner;
import java.util.*;
public class J02035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while ( t -- > 0 )
        {
            int n = sc.nextInt();

            Vector<Long> v = new Vector<Long>();
            long res = 1L + 1;
            for (int i = 0 ; i < n ; ++ i)
            {
                long x = sc.nextLong();
                v.add(x);
                if ( x < res ) 
                {
                    res = x;
                }
            }
            System.out.println(v.indexOf(res));
        }
    }
}
