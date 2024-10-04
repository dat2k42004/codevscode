
import java.util.Scanner;

public class J01016 
{
    public static int check(String s)
    {
        int res = 0;
        for(int i = 0; i < s.length(); ++ i)
        {
            if(s.charAt(i) == '4' || s.charAt(i) == '7') res ++;
        }
        if(res == 4 || res == 7) return 1;
        return 0;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if(check(s) == 1) 
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
