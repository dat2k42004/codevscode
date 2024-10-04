import java.util.Scanner;

public class J03040 {
    public static void solve(String s)
    {
        if(s.charAt(5) < s.charAt(6) && s.charAt(6) < s.charAt(7) &&
        s.charAt(7) < s.charAt(9) && s.charAt(9) < s.charAt(10))
        {
            System.out.println("YES");
            return;
        }

        if(s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7) && 
        s.charAt(9) == s.charAt(10))
        {
            System.out.println("YES");
            return;
        }
        boolean ok = true;
        for (int i = 5; i <= 10 ; ++ i)
        {
            if(i != 8 && s.charAt(i) != '6' && s.charAt(i) != '8')
            {
                System.out.println("NO");
                ok = false;
                break;
            }
        }
        if (ok) 
        {
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while( t -- > 0 )
        {
            String s = sc.next();

            solve(s);
        }  
    }
}
