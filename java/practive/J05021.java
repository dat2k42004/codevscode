import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05021 {
    static class student {
        String id, name, clas, email;
        student (String i, String n, String c, String e)
        {
            id = i;
            name = n;
            clas = c;
            email = e;
        }
        void out()
        {
            System.out.printf("%s %s %s %s\n", id, name, clas, email);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> a = new ArrayList<>();
        while (sc.hasNextLine())
        {
            String i = sc.nextLine();
            String n = sc.nextLine();
            String c = sc.nextLine();
            String e = sc.nextLine();
            a.add(new student(i, n, c, e));
        }
        Collections.sort(a, new Comparator<student>() {
            @Override
            public int compare(student a, student b)
            {
                return a.id.compareTo(b.id);
            }
        });
        for (student x : a)
            x.out();
    }
}
