import java.util.Scanner;

public class J05078 {
    static int n, m;
    static int[] g = {1, 4, 9, 16};
    static int[][] f = {{0, 10, 12, 14, 20},
            {1, 10, 11, 13, 16},
            {2, 9, 10, 12, 14},
            {3, 8, 9, 11, 13}};
    public static class position {
        String id, name;

        position (String s) {
            String[] res = s.split("\\s+");
            id = res[0];
            name = "";
            for (int i = 1; i < res.length; i++) {
                name += res[i] + " ";
            }
            name = name.trim();
        }

    }
    static position[] a1;
    public static class staff {
        String id, name, pos;
        int base, unit, sum;

        staff(String x, String y, int a, int b) {
            id = x;
            name = y;
            base = a;
            unit = b;
            int res = Integer.parseInt(x.substring(1, 3));
            for (int i = 0; i < 4; ++ i) {
                if (x.charAt(0) - 'A' == f[i][0]) {
                    for (int j = 3; j >=0; -- j) {
                        if (res >= g[j]) {
                            sum = f[i][j + 1];
                            break;
                        }
                    }
                    break;
                }
            }
            sum *= (base * unit * 1000);
            for (int i = 0; i < n; ++ i) {
                if (x.substring(3).equals(a1[i].id)) {
                    pos = a1[i].name;
                }
            }
        }

        @Override
        public String toString() {
            return id + " " + name + " " + sum;
        }
    }

    static staff[] a2;




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a1 = new position[n];
        sc.nextLine();
        for (int i = 0; i < n; ++i) {
            a1[i] = new position(sc.nextLine());
        }
        m = sc.nextInt();
        a2 = new staff[m];
        for (int i = 0; i < m; ++ i) {
            sc.nextLine();
            a2[i] = new staff(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        sc.nextLine();
        String s = sc.next();
        for (int i = 0; i < n; ++ i) {
            if (s.equals(a1[i].id)) {
                System.out.println("Bang luong phong " + a1[i].name + ":");
                for (int j = 0; j < m; ++ j) {
                    if (a2[j].pos.equals(a1[i].name)) {
                        System.out.println(a2[j]);
                    }
                }
            }
        }
    }
}
