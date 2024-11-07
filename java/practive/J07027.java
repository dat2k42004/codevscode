import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.util.Arrays;

public class J07027 {
    static class student implements Comparable<student> {
        String id, name, phone, work;
        int num;
        student (String x, String y, String z) {
            id = x;
            name = y;
            phone = z;
            work = "";
            num = 0;
        }
        @Override
        public int compareTo(student o) {
            return id.compareTo(o.id);
        }
        @Override
        public String toString() {
            return id + " " + name + " " + phone + " " + num + " " + work;  
        }
    }
    static class job {
        int id;
        String name;
        job(String x, int i) {
            id = i + 1;
            name = x;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        student[] a = new student[n];
        for (int i = 0; i < n; ++ i) {
            a[i] = new student(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        sc.close();
        sc = new Scanner(new File("BAITAP.in"));
        int m = Integer.parseInt(sc.nextLine());
        job[] b = new job[m];
        for(int i = 0; i < m; ++ i) {
            b[i] = new job(sc.nextLine(), i + 1);
        }
        sc.close();
        sc = new Scanner(new File("NHOM.in"));
        for (int i = 0; i < n; ++ i) {
            String x = sc.next();
            int stt = sc.nextInt();
            for (int j = 0; j < n; ++ j) {
                if (a[j].id.equals(x)) {
                    a[j].num = stt;
                    a[j].work = b[stt - 1].name;
                    break;
                }
            }
        }
        sc.close();
        for (student x : a) {
            System.out.println(x);
        }
    }
}
