import java.util.ArrayList;
import java.util.Scanner;

public class J05022 {
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
        for (int i = 0; i < n; ++ i)
        {
            student x = new student();
            x.in(sc);
            a.add(x);
        }
        int k = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < k; ++ i)
        {
            String x = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + x + ":");
            for (student j : a)
                if (j.clas.equals(x))
                    j.out();
        }
    }
}
