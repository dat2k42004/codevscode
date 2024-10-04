
import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int tmp = 1; tmp <= t; ++ tmp)
        {
            int n = sc.nextInt(), m = sc.nextInt();

            int a[][] = new int[n][m];
            for(int i = 0; i < n ; ++ i)
            {
                for(int j = 0; j < m; ++ j) 
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Test " + tmp + ":");
            for(int i = 0; i < n; ++ i)
            {
                for(int j = 0; j < n; ++ j)
                {
                    long res = 0;
                    for(int k = 0; k < m; ++ k)
                    {
                        res += 1L * a[i][k] * a[j][k];
                    }
                    System.out.print(res + " ");
                }
                System.out.println();
            }
        }
    }
    
}
