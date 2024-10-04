import java.util.Scanner;

public class J03023 {

    static char[] c = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    static int[] a = {1, 5, 10, 50, 100, 500, 1000};
    public static int find(char x)
    {
        for (int i = 0; i < 7; ++ i)
        {
            if (c[i] == x) 
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while ( t -- > 0 ) 
        {
            String s = sc.next();

            long res = a[find(s.charAt(s.length() - 1))];
            for(int i = s.length() - 2; i >= 0; -- i)
            {
                if (find(s.charAt(i)) < find(s.charAt(i + 1))) 
                {
                    res -= a[find(s.charAt(i))];
                }
                else 
                {
                    res += a[find(s.charAt(i))];
                }
            }
            System.out.println(res);
        }
    }
}
