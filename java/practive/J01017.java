
import java.util.Scanner;

public class J01017 
{
    static  Scanner sc = new Scanner(System.in);
    public static void solve()
    {
        String s = sc.next();
        boolean ok = true;
        for(int i = 0 ; i < s.length()-1; ++ i)
        {
            if(Math.abs(s.charAt(i)-s.charAt(i+1)) > 1 || s.charAt(i) == s.charAt(i + 1))
            {
                ok = false;
                break;
            }
        }
        if(ok) System.out.println("YES");
        else System.out.println("NO");
    }
    

    public static void main(String[] args) {
        int t = sc.nextInt();

        while(t -- > 0)
        {
            solve();
        }
    }
}
