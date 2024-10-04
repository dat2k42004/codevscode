
import java.util.Scanner;

public class J02023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if(n * 9 < k || (n > 1 && k == 0))
        {
            System.out.println(-1 + " " + -1);
        }
        else
        {
            int m;
            if(k % 9 == 0) 
            {
                m = (k - 9) / 9;
                k = 9;
            }
            else
            {
                m = k / 9;
                k = k % 9;
            }
            String s = "", res = "";
            for(int i = 0; i < m; ++ i)
            {
                s += "9";
            }
            for (int i = 0 ; i < n - m - 2; ++ i)
            {
                res += "0";
            }
            if(n > m + 1)
            {
                System.out.print("1" + res + (k - 1) + s + " " + s + k + res + "0");
            }
            else
            {
                System.out.print(k + s + " " + s + k);
            }
        }
    }
}
