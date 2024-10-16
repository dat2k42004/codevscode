
import java.util.Arrays;
import java.util.Scanner;

public class J05073 {
    static class product implements Comparable<product> {
        String id;
        double sum;
        product (String s, int x, int y) {
            id = s;
            sum = 1.0 * x * y;
            double tax = sum, ship = sum;
            switch (s.charAt(0)) {
                case 'T':
                    tax *= 0.29;
                    ship *= 0.04;
                    break;
                case 'C' :
                    tax *= 0.1;
                    ship *= 0.03;
                    break;
                case 'D' :
                    tax *= 0.08;
                    ship *= 0.025;
                    break;
                case 'M' :
                    tax *= 0.02;
                    ship *= 0.005;
                    break;
                default:
                    throw new AssertionError();
            }
            if (s.endsWith("C"))
                tax *= 0.95;
            sum += tax + ship;
            sum *= 1.2;
            sum = Math.round(sum * 100.0 / y) / 100.0;
        }
        @Override
        public int compareTo(product o) {
            return sum > o.sum ? -1 : 1;
        }
        @Override
        public String toString() {
            return id + " " + String.format("%.2f", sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        product[] a = new product[n];
        for (int i = 0; i < n; ++ i) {
            a[i] = new product(sc.next(), sc.nextInt(), sc.nextInt());
        }
        // Arrays.sort(a);
        for (product product : a) {
            System.out.println(product);
        }
    }
}
