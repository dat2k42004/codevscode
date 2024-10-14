import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;




public class J07038 {

    static String solve(String s) {
        String[] res = s.trim().toLowerCase().split("\\s+");
        s = "";
        for (String x : res) {
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";   
        }
        return s.trim();
    }
    public static class student implements Comparable<student> {

        String id, name, email, clas, business;

        student(String x, String y, String z, String t) {
            id = x;
            name = solve(y);
            email = t;
            clas = z;
        }

        @Override 
        public int compareTo(student o) {
            return id.compareTo(o.id);
        }
        @Override 
        public String toString() {
            return id + " " + name + " " + clas;
        }
    }
    public static class company {
        String id, name;
        int num;
        company(String x, String y, int z) {
            id = x;
            name = y;
            num = z;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        
        int n = sc.nextInt();
        student[] a = new student[n];
        sc.nextLine();
        for (int i = 0; i < n; ++ i) {
            a[i] = new student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        sc.close();
        sc = new Scanner(new File("DN.in"));

        int m = sc.nextInt();
        company[] b = new company[m];
        for (int i = 0; i < m; ++ i) {
            sc.nextLine();
            b[i] = new company(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        sc.close();
        sc = new Scanner(new File("THUCTAP.in"));
        int t = sc.nextInt();
        sc.nextLine();
        while (t -- > 0) {
            String[] res = sc.nextLine().split("\\s+");
            for (int i = 0; i < n; ++ i) {
                if (a[i].id.equals(res[0]))
                    a[i].business = res[1];
            }
        }
        t = sc.nextInt();
        while (t -- > 0) {
            String s = sc.next();
            int cnt = 0;
            for (int i = 0; i < m; ++ i) {
                if(s.equals(b[i].id)) {
                    System.out.println("DANH SACH THUC TAP TAI " + b[i].name + ":");
                    cnt = b[i].num;
                    break;
                }
            }
            for (int i = 0; i < n; ++ i) {
                if (s.equals(a[i].business) && cnt > 0) {
                    System.out.println(a[i]);
                    cnt -- ;
                }
            }
        }
        sc.close();
    }
}
