
import java.util.Arrays;
import java.util.Scanner;

public class J05012 {
    static class product implements Comparable<product> {
        String id, name;
        long num, base, discount, fee;
        product(String x, String y, long a, long b, long c) {
            id = x;
            name = y;
            num = a;
            base = b;
            discount = c;
            fee = num * base - discount;
        }
        @Override 
        public int compareTo(product o) {
            return fee > o.fee ? -1 : 1;
        }
        @Override 
        public String toString() {
            return id + " " + name + " " + num + " " + base + " " + discount + " " + fee;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        product[] a = new product[n];

        for (int i = 0; i < n; ++ i) {
            a[i] = new product(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
        }
        Arrays.sort(a);
        for (product x : a) {
            System.out.println(x);
        }
    }
}

