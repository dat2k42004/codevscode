import java.util.Scanner;
public class J03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int res = 0;
        int[] a = new int[26], b = new int[26], vs = new int[26];

        for (int i = 0; i < s.length(); ++ i)
        {
            int x = s.charAt(i) - 'A';
            if ( vs[x] == 0 )
            {
                a[x] = i;
                vs[x] = 1;
            }
            else
                b[x] = i;
        }
        int cnt = 0;
        for (int i = 0; i < 26; ++ i)
        {
            for (int j = 0; j < 26; ++ j)
            {
                if (a[i] < a[j] && a[j] < b[i] && b[i] < b[j]) 
                    cnt ++ ;
            }
        }
        System.out.print(cnt);
    }
}
