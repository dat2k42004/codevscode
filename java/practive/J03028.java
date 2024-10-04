import java.util.Scanner;
public class J03028 {
    static String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String solve(String s)
    {
        int cnt = 0;
        for (int i = 0; i < s.length(); ++ i)
        {
            cnt += s.charAt(i) - 'A';
        }
        String res = "";
        
        for (int i = 0; i < s.length(); ++ i)
        {
            int j = s.charAt(i) - 'A' + cnt;
            res += a.charAt(j % 26);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while ( t -- > 0 )
        {
            String s = sc.next();

            String s1, s2;
            s1 = solve(s.substring(0, s.length() / 2));
            s2 = solve(s.substring(s.length() / 2));

            // System.out.println(s1 + " " + s2);
            String res = "";
            for (int i = 0; i < s1.length(); ++ i)
            {
                res += a.charAt((s1.charAt(i) - 'A' + s2.charAt(i) - 'A') % 26);
            }
            System.out.println(res);
        }
    }
}
