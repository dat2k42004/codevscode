
import java.util.Scanner;
public class J01005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0)
        {
            int n = sc.nextInt();
            int h = sc.nextInt();

            for(int i = 1; i <= n-1; ++ i)
            {
                System.out.printf("%.6f ", (1.0 * h * (1.0 * Math.sqrt(1.0 * i / n))));
            }
            System.out.println();
            -- t;
        }
    }
}
