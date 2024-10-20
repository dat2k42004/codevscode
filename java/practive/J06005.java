import java.util.Scanner;

public class J06005 {
    static int n, m, k;
    static class guess {
        String id, name, gender, address, birthday;
        guess (String x, String y, String z, String t, int i) {
            id = String.format("KH%03d", i);
            name = x;
            gender = y;
            birthday = z;
            address = t;
        }
    }
    static guess[] g;
    static class product {
        String id, name, unit;
        int buy, sell;
        product (String x, String y, int b, int s, int i) {
            id = String.format("MH%03d", i);
            name = x;
            unit = y;
            buy = b;
            sell = s;
        }
    }
    static product[] p;
    static class bill {
        String id, customer, address, item, unit;
        int buy, sell, num, fee;
        bill (String x, String y, int t, int i) {
            id = String.format("HD%03d", i);
            for (int j = 0; j < n; ++ j) {
                if (x.equals(g[j].id)) {
                    customer = g[j].name;
                    address = g[j].address;
                    break;
                }
            }
            for (int j = 0; j < m; ++ j) {
                if (y.equals(p[j].id)) {
                    item = p[j].name;
                    unit = p[j].unit;
                    buy = p[j].buy;
                    sell = p[j].sell;
                    break;
                }
            }
            num = t;
            fee = sell * t;
        } 
        @Override 
        public String toString() {
            return id + " " + customer + " " + address + " " + item + " " + unit + " " + buy + " " + sell + " " + num + " " + fee; 
        }
    }
    static bill[] b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        g = new guess[n];
        for (int i = 0; i < n; ++ i) {
            g[i] = new guess(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), i + 1);
        }
        m = sc.nextInt();
        p = new product[m];
        for (int i = 0; i < m; ++ i) {
            sc.nextLine();
            p[i] = new product(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt(), i + 1);
        }
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