import java.util.Scanner;
public class J06007 {
    static int n, m, k;
    static class subject {
        String id, name;
        subject (String s) {
            String[] res = s.split(" ", 2);
            id = res[0];
            name = res[1];
        }
    }
    static subject[] s ;

    static class teacher {
        String id, name;
        double sum;
        teacher (String s) {
            String[] res = s.split(" ", 2);
            id = res[0];
            name = res[1];
            sum = 0.0;
        }
        @Override
        public String toString() {
            return name + " " + String.format("%.02f", sum);
        }
    }
    static teacher[] t;
    static class course {
        String id_sub, id_teach;
        double unit;

        course (String x, String y, double z) {
            unit = z;
            id_teach = x;
            id_sub = y;
        }
        
    }
    static course[] c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        s = new subject[n];
        for (int i = 0; i < n; ++ i) {
            s[i] = new subject(sc.nextLine());
        }
        m = sc.nextInt();
        t = new teacher[m];
        sc.nextLine();
        for (int i = 0; i < m; ++ i) {
            t[i] = new teacher(sc.nextLine());
        }
        k = sc.nextInt();
        c = new course[k];
        for (int i = 0; i < k; ++ i) {
            c[i] = new course(sc.next(), sc.next(), sc.nextDouble());
        }
        for (int i = 0; i < m; ++ i) {
            for (int j = 0; j < k; ++ j) {
                if (t[i].id.equals(c[j].id_teach)) {
                    t[i].sum += c[j].unit;
                }
            }
            System.out.println(t[i]);
        }
    }
}