

import java.util.Scanner;

public class J03013 {
    

    public static void solve(String a, String b)
    {
        while (a.length() < b.length())
        {
            a = "0" + a;
        }

        String res = "";

        int mod = 0;
        for (int i = b.length() - 1; i >= 0; -- i)
        {
            int x = a.charAt(i) - '0';
            int y = b.charAt(i) - '0';
            int tmp = y - mod - x;
            if (tmp < 0)
            {
                mod = 1;
                tmp += 10;
            }
            else
            {
                mod = 0;
            }
            res = String.valueOf(tmp) + res ;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while ( t -- > 0 )
        {
            String a, b;
            a = sc.next();
            b = sc.next();

            if (a.length() < b.length())
            {
                solve(a, b);
            }
            else if (a.length() > b.length())
            {
                solve(b, a);
            }
            else
            {
                int j = -1;
                for (int i = 0; i < a.length(); ++ i)
                {
                    if(a.charAt(i) != b.charAt(i))
                    {
                        j = i;
                        break;
                    }
                }
                if ( j == -1) 
                {
                    System.out.println(0);
                }
                else if(a.charAt(j) < b.charAt(j))
                {
                    solve(a, b);
                }
                else 
                {
                    solve(b, a);
                }
            }
        }
    }
}
