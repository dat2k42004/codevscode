import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J05054 {
    static class student
    {
        String id, name, status;
        double score;

        student (String x, double y, int t)
        {
            id = String.format("HS%02d", t);
            name = x;
            score = y;
            if (y >= 9.0)
                status = "Gioi";
            else if (y >= 7.0)
                status = "Kha";
            else if (y >= 5.0)
                status = "Trung Binh";
            else 
                status = "Yeu";
        }
        @Override
        public String toString()
        {
            return String.format("%s %s %.1f %s", id, name, score, status);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<student> a = new ArrayList<>();
        Map<Double, Integer> m = new TreeMap<>(Collections.reverseOrder());
        for (int i = 1; i <= n; ++ i)
        {
            sc.nextLine();
            String x = sc.nextLine();
            double y = sc.nextDouble();
            a.add(new student(x, y, i));
            if (m.containsKey(y))
                m.put(y, m.get(y) + 1);
            else 
                m.put(y, 1);
        }
        int cnt = 1;
        for (Double x : m.keySet())
        {
            int t = m.get(x);
            m.put(x, cnt);
            cnt += t;
        }
        for (student x : a)
        {
            System.out.println(x + " " + m.get(x.score));
        }
    }
}


