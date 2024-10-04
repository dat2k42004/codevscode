
import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t -- > 0)
        {
            int n = sc.nextInt();

            int[] a = new int[n], pre_sum = new int[n];

            for(int i = 0; i < n; ++ i)
            {
                a[i] = sc.nextInt();
                if(i == 0) pre_sum[i] = a[i];
                else pre_sum[i] = a[i] + pre_sum[i - 1];
            }
            boolean ok = false;

            for(int i = 0; i < n; ++ i)
            {
                if(pre_sum[i] - a[i] == pre_sum[n - 1] - pre_sum[i])
                {
                    System.out.println(i + 1);
                    ok = true;
                    break;
                }
            }
            if(! ok) System.out.println(- 1);
        }
    }
    
}
