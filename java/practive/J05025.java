import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05025 {
    
    static class teacher implements Comparable<teacher> {
        String name, id, subject;

        teacher(String n, String s, int t)
        {
            name = n;
            subject = "";
            String[] res = s.split("\\s+");
            for (String x : res)
                subject += x.substring(0, 1).toUpperCase();
            id = String.format("GV%02d", t);
        }   
        @Override
        public int compareTo(teacher a)
        {
            String x1 = name.substring(name.lastIndexOf(" ") + 1);
            String x2 = a.name.substring(a.name.lastIndexOf(" ") + 1);
            if (x1.compareTo(x2) == 0)
                return id.compareTo(a.id);
            return x1.compareTo(x2);
        }
        @Override
        public String toString()
        {
            return id + " " + name + " " + subject;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<teacher> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            String m = sc.nextLine();
            String s = sc.nextLine();
            a.add(new teacher(m, s, i + 1));
        }
        Collections.sort(a);
        for (teacher x : a)
            System.out.println(x);
    }
}
