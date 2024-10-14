
import java.util.Arrays;
import java.util.Scanner;


public class J05079 {
    public static class subject implements Comparable<subject>{
        String id, name, group, teacher;

        public subject(String x, String y, String z, String t) {
            id = x;
            name = y;
            group = z;
            teacher = t;
        }
        
        @Override
        public int compareTo(subject o) {
            return group.compareTo(o.group);
        }
        
        @Override
        public String toString() {
            return group + " " + teacher;
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
        while (t -- > 0) {
            String s = sc.next();
            boolean ok = true;
            for (int i = 0; i < n; ++ i) {
                if (s.equals(a[i].id)) {
                    if (ok) {
                        System.out.println("Danh sach nhom lop mon " + a[i].name + ":");
                        ok = false;
                    }
                    System.out.println(a[i]);
                }
            }
        }
    }
}
