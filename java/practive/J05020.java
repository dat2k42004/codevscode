import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05020 {
    static class student implements Comparable<student> {
        String id, name, clas, email;
        void in(Scanner sc)
        {
            id = sc.nextLine();
            name = sc.nextLine();
            clas = sc.nextLine();
            email = sc.nextLine();
        }

        @Override
        public int compareTo(student a)
        {
            if(clas.compareTo(a.clas) == 0)
                return id.compareTo(a.id);
            return clas.compareTo(a.clas);
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

        Collections.sort(a);
        for (student x : a)
            x.out();
    }
}
