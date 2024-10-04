import java.util.ArrayList;
import java.util.Scanner;

public class J05023 {
    static class student {
        String id, name, clas, email;

        void in(Scanner sc)
        {
            id = sc.nextLine();
            name = sc.nextLine();
            clas = sc.nextLine();
            email = sc.nextLine();
        }
        void out()
        {
            System.out.printf("%s %s %s %s\n", id, name, clas, email);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<student> a = new ArrayList<>();
        for (int i = 0; i < n; ++i)
        {
            student x = new student();
            x.in(sc);
            a.add(x);
        }

        int k = sc.nextInt();
        while (k -- > 0 )
        {
            String s = sc.next();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", s);
            for (student x : a)
            {
                if (x.clas.substring(1, 3).compareTo(s.substring(2)) == 0)
                    x.out();
            }
        }
    }
}
