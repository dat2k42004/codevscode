
import java.util.Scanner;

public class J01010 {
    public static void solve(String s)
    {
        boolean ok = false;
        String res = "";
        for(int i = 0; i < s.length(); ++ i)
        {
            if(s.charAt(i) == '1') res += "1";
            else if(s.charAt(i) == '8' || s.charAt(i) == '0' || s.charAt(i) == '9') res += "0";
            else
            {
                ok = true;
                break;
            }
        }
        if (ok) System.out.println("INVALID");
        else
        {
            int tmp = 0;
            boolean ok1 = false;
            for(int i = 0; i < res.length(); ++ i)
            {
                if(res.charAt(i) != '0')
                {
                    tmp = i;
                    ok1 = true;
                    break;
                }
            }
            if(  !ok1 ) 
                System.out.print("INVALID");
            else 
                for(int i = tmp; i < res.length(); ++ i) System.out.print(res.charAt(i));
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while( t > 0)
        {
            String s = sc.next();

            solve(s);
            -- t;
        }
    }
    
}
