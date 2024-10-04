
import java.util.Scanner;

public class J01018 
{
    static Scanner sc = new Scanner(System.in);

    public static void solve()
    {
        String s = sc.next();

        int res = 0;
        boolean ok = true;
        for(int i = 0; i < s.length() - 1; ++ i)
        {
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 2)
            {
                ok = false;
                break;
            }
            res += s.charAt(i) - '0';
        }
        if(!ok) System.out.println("NO");
        else
        {
            res += s.charAt(s.length() - 1) - '0';
            if(res % 10 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();

        while(t -- > 0)
        {
            solve();
        }
    }
    
}
