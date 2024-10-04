
import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int k = 1; k <= t; ++ k)
        {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] f = new int[100001];

            for(int i = 0; i < n; ++i)
            {
                a[i] = sc.nextInt();
                f[a[i]] ++ ;
            }
            System.out.println("Test " + k + ":");
            for(int i = 0; i < n; ++ i)
            {
                if(f[a[i]] > 0)
                {
                    System.out.println(a[i] + " xuat hien " + f[a[i]] + " lan");
                    f[a[i]] = 0;
                }
            }
        }
    }
    
}
