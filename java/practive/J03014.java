
import java.math.BigInteger;
import java.util.Scanner;

public class J03014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a, b;
        a = sc.nextBigInteger();

        b = sc.nextBigInteger();

        System.out.print(a.add(b));
    }
}
