import java.util.Scanner;

public class J020356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        if (s == 0 || n * 9 < s) 
            System.out.print("-1 -1");
        else
        {
            int res, mod;
            if (s % 9 == 0)
            {
                res = s / 9 - 1;
                mod = 9;
            }
            else 
            {
                res = s / 9;
                mod = s % 9;
            }
            String tmp = "";
            for (int i = 0; i < res ; ++ i)
                tmp += "9";
            int cnt = n - res - 1;
            String tmp1 = "";
            for(int i = 0; i < cnt; ++ i)
                tmp1 += "0";
            if (tmp1 == "")
                System.out.print(Integer.toString(mod) + tmp1 + tmp + " " + tmp + Integer.toString(mod) + tmp1);
            else
            {
                tmp1 = tmp1.substring(1);
                System.out.print("1" + tmp1 + Integer.toString(mod - 1) + tmp + " " + tmp + Integer.toString(mod) + tmp1 + "0");
            }
        }
    }
}
