import java.util.Scanner;
public class J01024 
{
    static Scanner sc = new Scanner(System.in);

    public static void solve()
    {
        String s = sc.next();
        boolean ok = true;
        for(int i = 0; i < s.length(); ++ i)
        {
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') 
            {
                ok = false;
                System.out.println("NO");
                break;
            }
        }
        if(ok) System.out.println("YES");
    }

    public static void main(String[] args) {
        int t = sc.nextInt();

        while( t -- > 0)
        {
            solve();
        }
    }
    
}
