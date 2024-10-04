
import java.util.Scanner;

public class J01021 
{
    static long mod = 1000000007L;
    static Scanner sc = new Scanner(System.in);
    public static long Mod (long a, long b)
    {
        if(b == 0) return 1L;

        long res = Mod(a, b / 2);
        
        res = (res * res) % mod;
        if(b % 2 == 0)
        {
            return res;
        }
        else
        {
            return (res * a) % mod;
        }
    }
    

    public static void main(String[] args) {
        long a, b;
        while(true)
        {
            a = sc.nextLong();
            b = sc.nextLong();

            if(a == 0 && b == 0) break;

            System.out.println(Mod(a, b));
        }
    }
}
