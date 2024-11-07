import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class J07020 {
    static class guess {
        String id, name, gender, birthday, address;
        guess(String name, String gender, String birthday, String address, int i) {
            id = String.format("KH%03d", i);
            this.name = name;
            this.gender = gender;
            this.birthday = birthday;
            this.address = address;
        }

    }
    static class product {
        String id, name, unit;
        int buy, sell;
        product(String name, String unit, int buy, int sell, int i) {
            id = String.format("MH%03d", i);
            this.name = name;
            this.unit = unit;
            this.buy = buy;
            this.sell = sell;
        }
    }
    static int n, m, k;
    static guess[] g;
    static product[] p;
    static class bill {
        String id, guess, address, product, unit;
        int buy, sell, num, sum;
        bill(String x, String y, int z, int t) {
            id = String.format("HD%03d", t);
            for (int i = 0; i < n; ++ i) {
                if (g[i].id.equals(x)) {
                    guess = g[i].name;
                    address = g[i].address;
                    break;
                }
            }
            for (int i = 0; i < m; ++ i) {
                if (p[i].id.equals(y)) {
                    product = p[i].name;
                    unit = p[i].unit;
                    buy = p[i].buy;
                    sell = p[i].sell;
                }
            }
            num = z;
            sum = num * sell;
        }
        @Override 
        public String toString () {
            return id + " " + guess + " " + address + " " + product + " " + unit + " " + buy + " " + sell + " " + num + " " + sum;
        }
    }
    static bill[] b;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KH.in"));
        n = Integer.parseInt(sc.nextLine());
        g = new guess[n];
        for (int i = 0; i < n; ++ i) {
            g[i] = new guess(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), i + 1);
        }
        sc.close();
        sc = new Scanner(new File("MH.in"));
        m = sc.nextInt();
        p = new product[m];
        for (int i = 0; i < m; ++ i) {
            sc.nextLine();
            p[i] = new product(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), i + 1);
        }
        sc.close();
        sc = new Scanner(new File("HD.in"));
        k = sc.nextInt();
        b = new bill[k];
        for (int i = 0; i < k; ++ i) {
            b[i] = new bill(sc.next(), sc.next(), sc.nextInt(), i + 1);
        }
        for (bill x : b) {
            System.out.println(x);
        }
    }
}