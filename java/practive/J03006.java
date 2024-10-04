
import java.util.Scanner;

public class J03006 {
    public static void solve(String s)
    {
        boolean ok = true;

        int l = 0, r = s.length() - 1;
        while (l < r)
        {
            if ((s.charAt(l) - '0') % 2 == 1) 
            {
                ok = false;
                break;
            }
            if(s.charAt(l) != s.charAt(r))
            {
                ok = false;
                break;
            }
            l ++;
            r --;
        }

        if(ok && (s.charAt(s.length() / 2) - '0') % 2 == 0)
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
