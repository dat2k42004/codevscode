
import java.util.Scanner;

public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, x, y, z, t;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        t = sc.nextInt();

        int res1 = Math.max(Math.max(c - a, z - x), Math.max(c - x, z - a));
        int res2 = Math.max(Math.max(d - b, t - y), Math.max(d - y, t - b));
        int res = Math.max(res1, res2);
        System.out.println(res * res);
    }
}
