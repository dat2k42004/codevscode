
import java.util.Scanner;

public class J03008 {
    
    public static void solve(String s)
    {
        boolean ok = true;

        int l = 0, r = s.length() - 1;

        while(l <= r)
        {
            if(s.charAt(l) != s.charAt(r))
            {
                ok = false;
                System.out.println("NO");
                return;
            }
            char x = s.charAt(l);
            if(x != '2' && x != '3' && x != '5' && x != '7')
            {
                ok = false;
                System.out.println("NO");
                return;
            }
            l ++;
            r --;
        }
        if (ok)
        {
            System.out.println("YES");
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
