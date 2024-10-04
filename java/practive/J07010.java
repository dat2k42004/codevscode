import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class J07010 {

    static int t;
    public static class student {
        String name, id, clas, birthday;
        double gpa;

        public void set(Scanner sc)
        {
            sc.nextLine();
            name = sc.nextLine();
            clas = sc.nextLine();
            birthday = sc.nextLine();
            gpa = sc.nextDouble();

            t ++ ;
            String s = Integer.toString(t);
            while(s.length() < 3)
                s = "0" + s;
            id = "B20DCCN" + s;
            if (birthday.charAt(1) == '/')
                birthday = "0" + birthday;
            if (birthday.charAt(4) == '/')
                birthday = birthday.substring(0, 3) + "0" + birthday.substring(3);
        }

        public void get()
        {
            System.out.printf("%s %s %s %s % .2f\n", id, name, clas, birthday, gpa);
        }

        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));

        int n = sc.nextInt();
        t = 0;
        Vector<student> v = new Vector<>();
        for (int i = 0; i < n; ++ i)
        {
            student a = new student();
            a.set(sc);
            v.add(a);
        }
        for (student a : v)
            a.get();

    }
}
