
import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[][] = new int[n][3];
        int cnt = 0;
        for(int i = 0; i < n; ++ i)
        {
            int ans = 0;
            for(int j = 0; j < 3; ++ j)
            {
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1) ans ++ ;
            }
            if(ans >= 2) cnt ++ ;
        }
        System.out.print(cnt);
    }
}
