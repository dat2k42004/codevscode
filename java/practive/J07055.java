import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
public class J07055 {
    public static String change(String s)
    {
        s = s.toLowerCase() + " ";
        ArrayList<String> a = new ArrayList<>();
        String tmp = "";
        for(int i = 0; i < s.length(); ++ i)
        {
            if(s.charAt(i) == ' ')
            {
                if(tmp != "")
                {
                    a.add(tmp);
                    tmp = "";
                }
            }
            else
                tmp += s.charAt(i);
        }
        s = "";
        for(String x : a)
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        return s.substring(0, s.length());
    }
    static int t;
    public static class score implements Comparable<score> {
        String name, id, medium_score, status;
        double m_s;
        void input(String name, double a, double b, double c)
        {
            this.name = change(name);
            m_s = a * 0.25 + b * 0.35 + c * 0.4;
            if(m_s >= 8) 
                status = "GIOI";
            else if (m_s >= 6.5)
                status = "KHA";
            else if(m_s >= 5)
                status = "TRUNG BINH";
            else 
                status = "KEM";
            
            id = String.format("SV%02d", ++t);
            medium_score = String.format("%.2f", m_s);
        }
        @Override
        public int compareTo(score a)
        {
            return -medium_score.compareTo(a.medium_score);
        }
        void output()
        {
            System.out.printf("%s %s %s %s\n", id, name, medium_score, status);
        }
    }
    public static void main(String[] args) throws IOException  {
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
        for(score x : v)
            x.output();
    }
}
