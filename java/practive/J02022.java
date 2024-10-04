
import java.util.Scanner;

public class J02022 {
    static int n;
    static int check[] = new int[11];

    public static void next(String s)
    {
        int k = s.length();
        if(k == n)
            System.out.println(s);

        for(int i = 1; i <= n; ++ i)
        {
            if(k == 0 || (check[i] == 0 && Math.abs(s.charAt(k - 1) - '0' - i) != 1))
            {
                check[i] = 1;
                next(s + Integer.toString(i));
                check[i] = 0;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t -- > 0)
        {
            n = sc.nextInt();
            next("");
        }
    }
}
