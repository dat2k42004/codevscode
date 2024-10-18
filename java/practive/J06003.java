import java.util.Scanner;

public class J06003 {
    static class team_work {
        String id, name, phone;
        int group;
        team_work(String x, String y, String z, int t) {
            id = x;
            name = y;
            phone = z;
            group = t;
        }
        @Override
        public String toString() {
            return id + " " + name + " " + phone;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        team_work[] a = new team_work[n];
        for (int i = 0; i < n; ++ i) {
            sc.nextLine();
            a[i] = new team_work(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        sc.nextLine();
        String[] b = new String[m];
        for (int i = 0; i < m; ++ i) {
            b[i] = sc.nextLine();
        }
        int t = sc.nextInt();
        while (t -- > 0) {
            int cnt = sc.nextInt();
            System.out.println("DANH SACH NHOM " + cnt + ":");
            for (int i = 0; i < n; ++ i) {
                if (a[i].group == cnt) {
                    System.out.println(a[i]);
                }
            }
            System.out.println("Bai tap dang ky: " + b[cnt - 1]);
        }
    }
}

