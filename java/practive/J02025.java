import java.util.*;
public class J02025 {

    static boolean check(int n)
    {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); ++ i)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    static void next(int[] a, int n, String s, int sum)
    {
        if(check(sum)) 
            System.out.println(s);
        for(int i = 0; i < n; ++ i)
            next(a, i, s + a[i] + " ", sum + a[i]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; ++ i)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            next(a, n, "", 0);
        }
    }
}