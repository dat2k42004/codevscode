import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class J05007 {
    static int t;
    static class staff implements Comparable<staff> {
        String id, name, gender, birthday, address, tax, day;

        void in(Scanner sc)
        {
            t ++ ;
            id = String.format("%05d", t);
            name = sc.nextLine();
            gender = sc.nextLine();
            birthday = sc.nextLine();
            address = sc.nextLine();
            tax = sc.nextLine();
            day = sc.nextLine();
        }
        @Override
        public int compareTo(staff a)
        {
            String x1 = birthday.substring(6) + birthday.substring(3, 5) + birthday.substring(0, 2);
            String x2 = a.birthday.substring(6) + a.birthday.substring(3, 5) + a.birthday.substring(0, 2);
            return x1.compareTo(x2);
        }
        void out()
        {
            System.out.printf("%s %s %s %s %s %s %s\n", id, name, gender, birthday, address, tax, day);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<staff> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            staff x = new staff();
            x.in(sc);
            a.add(x);
        }
        Collections.sort(a);
        for (staff x : a)
            x.out();
    }
}
