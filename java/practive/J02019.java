import java.util.Scanner;

public class J02019 {
    static int[] f = new int[1000001];
    static void init()
    {
        for (int i = 0; i < 1000000; ++ i)
        {
            f[i] = 0;
        }
        for (int i = 1; i <= 1000000; ++i)
        {
            for (int j = i * 2; j <= 1000000; j += i)
            {
                f[j] += i;
            }
            f[i] = f[i - 1] + (f[i] > i ? 1 : 0);  
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(f[b] - f[a - 1]);
    }
}
