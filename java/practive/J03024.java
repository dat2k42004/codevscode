
import java.util.Scanner;

public class J03024 {
    public static void solve(String s)
    {
        int odd = 0;

        if (s.charAt(0) == '0')
        {
            System.out.println("INVALID");
            return;
        }

        for (int i = 0 ; i < s.length() ; ++ i)
        {
            if (Character.isAlphabetic(s.charAt(i)))
            {
                System.out.println("INVALID");
                return;
            }
            else if (Character.getNumericValue(s.charAt(i)) % 2 == 1)
            {
                odd ++ ;
            }
        }
        if (s.length() % 2 == 0 && s.length() - odd > odd)
        {
            System.out.println("YES");
        }
        else if (s.length() % 2 == 1 && odd > s.length() - odd)
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
