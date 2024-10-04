
import java.util.Scanner;

public class J01012 
{
    public static void solve(int n)
    {
        if (n % 2 == 0)
        {
            int res =  0;
            while(n % 2 == 0) 
            {
                res ++;
                n /= 2;
            }
            int tmp = 1;
            for(int i = 3; i <= Math.sqrt(n); ++i)
            {
                if(n % i == 0 )
                {
                    int cnt = 0;
                    while( n % i == 0)
                    {
                        cnt++;
                        n /= i;
                    }
                    tmp *= (cnt + 1);
                }
            }
            if(n > 1) tmp *= 2;
            System.out.println(tmp*res);
        }
        else{
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t > 0)
        {
            -- t;
            int n = sc.nextInt();
            
            solve(n);
        }
    }
    
}
