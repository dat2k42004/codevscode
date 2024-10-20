import java.util.Scanner;
public class J06001 {
    static class clothes {
        String id, name;
        int cost1, cost2;
        
        clothes (String x, String y, int a, int b) {
            id = x;
            name = y;
            cost1 = a;
            cost2 = b;
        }
    }
    static class bill {
        String id, name;
        int extra, sum;
        bill (String x, int y, int i) {
            id = x + String.format("-%03d", i);
            name = "";
            sum = y;
            extra = 0;
        }
        @Override 
        public String toString() {
            return id + " " + name + " " + extra + " " + sum; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        clothes[] a = new clothes[n];
        for (int i = 0; i < n; ++ i){
            sc.nextLine();
            a[i] = new clothes(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        int m = sc.nextInt();
        bill[] b = new bill[m];
        for (int i = 0; i < m; ++ i) {
            String s = sc.next();
            int fee = sc.nextInt();
            b[i] = new bill(s, fee, i + 1);
            for (int j = 0; j < n; ++ j) {
                if (s.startsWith(a[j].id)) {
                    b[i].name = a[j].name;
                    if (s.charAt(2) == '1') 
                        b[i].sum *= a[j].cost1;
                    else 
                        b[i].sum *= a[j].cost2;
                    if (fee >= 150) 
                        b[i].extra = (int) b[i].sum / 2;
                    else if (fee >= 100) 
                        b[i].extra = (int) b[i].sum * 3 / 10;
                    else if (fee >= 50)
                        b[i].extra = (int) b[i].sum * 15 / 100;
                    b[i].sum -= b[i].extra;
                    break;
                }
            }
        }
        for (bill bill : b) {
            System.out.println(bill);
        }
    }
}
