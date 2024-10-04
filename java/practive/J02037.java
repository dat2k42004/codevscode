
// import java.net.Inet4Address;
import java.util.Scanner;
import java.util.StringTokenizer;

public class  J02037{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        sc.nextLine();

        while ( t-- > 0 )
        {
            String s = sc.nextLine();

            StringTokenizer ss = new StringTokenizer(s);

            int odd = 0, sum = 0;

            while ( ss.hasMoreTokens() )
            {
                sum ++ ;
                int x = Integer.parseInt(ss.nextToken());

                if(x % 2 == 1) odd ++;
            }

            if (sum % 2 == 1 && odd > sum - odd) 
            {
                System.out.println("YES");
            }
            else if ( sum % 2 == 0 && odd < sum - odd)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }   
}