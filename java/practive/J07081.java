import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07081 {

    public static class student implements Comparable<student> {
        String id, name, phone, email;

        void input(Scanner sc)
        {
            id = sc.nextLine();
            name = sc.nextLine();
            phone = sc.nextLine();
            email = sc.nextLine();
        }

        @Override
        public int compareTo(student a)
        {
            String l_n1 = name.substring(name.lastIndexOf(" ") + 1);
            String f_n1 = name.substring(0, name.lastIndexOf(" "));
            String l_n2 = a.name.substring(a.name.lastIndexOf(" ") + 1);
            String f_n2 = a.name.substring(0, a.name.lastIndexOf(" "));
            if (l_n1.compareTo(l_n2) == 0)
            {
                if (f_n1.compareTo(f_n2) == 0)
                    return id.compareTo(a.id);
                else
                    return f_n1.compareTo(f_n2);
            }
            return l_n1.compareTo(l_n2);
        }
         
        void output()
        {
            System.out.printf("%s %s %s %s\n", id, name, phone, email);
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<student> a = new ArrayList<>();

        for (int i = 0; i < n; ++ i)
        {
            student x = new student();
            x.input(sc);
            a.add(x);
        }
        Collections.sort(a);

        for(student x : a)
            x.output();

    }
}
