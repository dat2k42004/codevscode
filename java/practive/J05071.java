import java.util.Scanner;

public class J05071 {
    public static class city {
        String id, name;
        int fee;
        city(String x, String y, int z) {
            id = x;
            name = y;
            fee = z;
        }
    }
    static int n, m;
    static city[] a;

    public static class phone {

        String id, status;
        int unit, sum;

        phone(String s) {
            String[] res = s.split("\\s+");
            id = res[0];
            int munite = Integer.parseInt(res[2].substring(3)) - Integer.parseInt(res[1].substring(3));
            int hour = Integer.parseInt(res[2].substring(0, 2)) - Integer.parseInt(res[1].substring(0, 2));
            if (munite < 0) {
                hour -- ;
                munite += 60;
            }
            munite = hour * 60 + munite;
            if (!id.startsWith("0")) {
                munite = (int) Math.ceil((double) munite / 3);
                sum = munite * 800;
                status = "Noi mang";
            }
            else {
                String x = id.substring(1, 3);
                for(int i = 0; i < n; ++ i) {
                    if (x.equals(a[i].id)) {
                        status = a[i].name;
                        sum = munite * a[i].fee;
                        break;
                    }
                }
            }
            unit = munite;
        }

        @Override 
        public String toString () {
            return id + " " + status + " " + unit + " " + sum;
        }
    }
    static phone[] b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = new city[n];
        for (int i = 0; i < n; ++ i) {
            sc.nextLine();
            a[i] = new city(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        sc.nextLine();
        m = sc.nextInt();
        sc.nextLine();
        b = new phone[m];
        for (int i = 0; i < m; ++ i) {
            b[i] = new phone(sc.nextLine());
        }
        for (phone x : b) {
            System.out.println(x);
        }
    }
}
