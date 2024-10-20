import java.util.Scanner;
public class J06008 {
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
    }
    static teacher[] t;
    static class course {
        String id_sub, id_teach, name_sub;
        double unit;

        course (String x, String y, double z) {
            unit = z;
            id_teach = x;
            id_sub = y;
            for (int i = 0; i < n; ++ i) {
                if (y.equals(s[i].id)) {
                    name_sub = s[i].name;
                }
            }
        }
        @Override
        public String toString(){
            return name_sub + " " + unit;
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
        String s = sc.next();
        for (int i = 0; i < m; ++ i) {
            if (s.equals(t[i].id)) {
                System.out.println("Giang vien: " + t[i].name);
                for (int j = 0; j < k; ++ j) {
                    if (t[i].id.equals(c[j].id_teach)) {
                        System.out.println(c[j]);   
                        t[i].sum += c[j].unit;
                    }
                }
                System.out.println("Tong: " +  String.format("%.02f", t[i].sum));
            }
        }
        
    }
}

