import java.math.BigInteger;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class J01020 {
    static boolean check(int[] a)
    {
        for (int i = 0; i < a.length; ++ i)
            if (a[i] == 0) 
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0)
        {
            long n = sc.nextLong();
            if (n == 0)
            {
                System.out.println("Impossible");
                continue;
            }
            int[] a = new int[10];
            
            int i = 1;
            while (true)
            {
                String s = String.valueOf(n * i);
                for (int j = 0; j < s.length() ; ++ j)
                    a[s.charAt(j) - '0'] ++;
                if (check(a))
                {
                    System.out.println(s);
                    break;
                }
                i ++ ;
            }
        }
    }
}
