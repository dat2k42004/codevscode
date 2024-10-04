import java.util.Scanner;
import java.util.*;
public class J03020 {

    public static boolean check(String s)
    {
        int l = 0, r = s.length() - 1;

        while ( l < r )
        {
            if ( s.charAt(l) != s.charAt(r) )
                return false;

            l ++ ;
            r -- ;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Integer> m = new LinkedHashMap<>();

        while ( sc.hasNextLine() )
        {
            String[] s = sc.nextLine().split("\\s+");
            for (String x : s)
                if ( check(x))
                {
                    if ( m.containsKey(x))
                    {
                        m.put(x, m.get(x) + 1);
                    }
                    else 
                        m.put(x, 1);
                }
        }
        int cnt = 0;
        for (String x : m.keySet())
        {
            cnt = Math.max(cnt, x.length());
        }

        for (String x : m.keySet())
        {
            if (cnt == x.length()) 
                System.out.println(x + " " + m.get(x));
        }
        
    }
}

