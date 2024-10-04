import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05009 {
    static int t;
    static class student implements Comparable<student> {
        String name, birthday, score;
        int id;
        void in(Scanner sc)
        {
            id = ++t;
            sc.nextLine();
            name = sc.nextLine();
            birthday = sc.nextLine();
            double d = sc.nextDouble() + sc.nextDouble() + sc.nextDouble();
            score = String.format("%.1f", d);
        }

        @Override
        public int compareTo(student a)
        {
            if (score.compareTo(a.score) == 0) 
                return id - a.id;
            return -score.compareTo(a.score);
        }
        
        void out()
        {
            System.out.printf("%d %s %s %s\n", id, name, birthday, score);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = 0;
        int n = sc.nextInt();
        ArrayList<student> a = new ArrayList<>();
        for (int i = 0; i < n; ++ i)
        {
            student x = new student();
            x.in(sc);
            a.add(x);
        }
        Collections.sort(a);
        String s = a.get(0).score;
        for (student x : a)
        {
            if (x.score.equals(s))
                x.out();
        }
    }
}
