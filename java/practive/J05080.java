import java.util.Arrays;
import java.util.Scanner;

public class J05080 {
    public static class subject implements Comparable<subject> {
        String id, name, group, teacher;
        subject(String x, String y, String z, String t) {
            id = x;
            name = y;
            group = z;
            teacher = t;
        }

        @Override
        public int compareTo(J05080.subject o) {
            if (id.equals(o.id)) {
                return group.compareTo(o.group);
            }
            return id.compareTo(o.id);
        }
        @Override 
        public String toString() {
            return id + " " + name + " " + group;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        subject[] a = new subject[n];
        for (int i = 0; i < n; ++ i) {
            a[i] = new subject(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        int t = sc.nextInt();
        sc.nextLine();
        while (t -- > 0) {
            String s = sc.nextLine();
            boolean ok = true;
            for (int i = 0; i < n; ++ i) {
                if (s.equals(a[i].teacher)) {
                    if (ok) {
                        System.out.println("Danh sach cho giang vien " + s + ":");
                        ok = false;
                    }
                    System.out.println(a[i]);
                }
            }
        }
    }
}

