
import java.util.Scanner;

public class J03025 {
    public static void solve(String s)
    {
        int l = 0, r = s.length() - 1;
        int cnt = 0;
        while (l < r)
        {
            if ( s.charAt(l) != s.charAt(r))
            {
                cnt ++ ;
            }
            if( cnt >=2 )
            {
                System.out.println("NO");
                return;
            }
            l ++ ;
            r -- ;
        }
        if ( cnt == 0 && s.length() % 2 == 1)
        {
            System.out.println("YES");
        }
        else if (cnt == 1)
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

        while ( t -- > 0 )
        {
            String s = sc.next();

            solve(s);
        } 
    }
}
