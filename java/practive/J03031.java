
import java.util.Scanner;
public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t -- > 0)
        {
            String s = sc.next();

            int n = sc.nextInt();

            int[] a = new int[26];
            for (int i = 0; i < s.length(); ++ i)
            {
                a[s.charAt(i) - 'a'] ++ ;
            }
            for (int i = 0; i < 26; ++ i)
            {
                if (a[i] == 0)
                {
                    n -- ;
                }
            }
            System.out.println(n >= 0 ? "YES" : "NO");  
        }
    }
}
