import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class J07054 {
    public static String change(String s)
    {
        s = s.toLowerCase() + " ";
        Vector<String> v = new Vector<>();
        String tmp = "";
        for(int i = 0; i < s.length(); ++ i)
        {
            if(s.charAt(i) == ' ')
            {
                if(tmp != "")
                {
                    v.add(tmp);
                    tmp = "";
                }
            }
            else 
                tmp += s.charAt(i);
        }
        s = "";
        for(String x : v)
        {
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        }
        return s.substring(0, s.length());
    }
    static int t;
    public static class score implements Comparable<score> {
        String name, id, medium_score;

        void input(String name, double d1, double d2, double d3)
        {
            this.name = change(name);
            medium_score = String.format("%.2f", (d1 * 3 + d2 * 3 + d3 * 2) / 8);
            t ++ ;
            id = String.format("SV%02d", t);
        }
         
        @Override
        public int compareTo(score a)
        {
            if(medium_score.compareTo(a.medium_score) == 0)
                return id.compareTo(a.id);
            return -medium_score.compareTo(a.medium_score);
        }
        
        void output()
        {
            System.out.printf("%s %s %s ", id, name, medium_score);
        }
        
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        t = 0;
        Vector<score> v = new Vector<>();
        for(int i = 0; i < n; ++ i)
        {
            score x = new score();
            sc.nextLine();
            x.input(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            v.add(x);
        }
        Collections.sort(v);
        int cnt = 1;
        for(int i = 0; i < n; ++ i)
        {
            v.get(i).output();
            if(i > 0 && v.get(i).medium_score.compareTo(v.get(i - 1).medium_score) != 0)
                cnt = i + 1;
            System.out.println(cnt);
        }
    }
}
