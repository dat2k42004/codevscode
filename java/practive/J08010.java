
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J08010 {
    static boolean check(String s)
    {
        int l = 0, r = s.length() - 1;
        while (l < r)
        {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l ++ ;
            r -- ;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> m = new LinkedHashMap<>();

        while (sc.hasNext())
        {
            String s = sc.next();
            if(check(s))
            {
                if (m.containsKey(s))
                    m.put(s, m.get(s) + 1);
                else
                    m.put(s, 1);
            }
        }
        int res = 0;
        for (String x : m.keySet())
            res = Math.max(res, x.length());
        for (String x : m.keySet())
        {
            if (x.length() == res)
                System.out.println(x + " " + m.get(x));
        }
    }
}
