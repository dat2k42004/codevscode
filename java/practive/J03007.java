
import java.util.Scanner;

public class J03007 {
    
    public static void solve(String s)
    {
        int l = 0, r = s.length() - 1;
        boolean ok = true;

        if (s.charAt(l) != '8' || s.charAt(r) != '8') ok = false;

        if (!ok)
        {
            System.out.println("NO");
            return;
        }

        int res = 0;
        while (l < r)
        {
            if(s.charAt(l) != s.charAt(r)) 
            {
                ok = false;
                System.out.println("NO");
                return;
            }
            res += 2 * (s.charAt(l) - '0');
            l ++;
            r --;
        }
        if (l == r) 
        {
            res += s.charAt(l) - '0';
        }
        if(res % 10 == 0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t -- > 0)
        {
            String s = sc.next();

            solve(s);
        }
    }
}
