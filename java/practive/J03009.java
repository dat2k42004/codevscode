
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class J03009 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        sc.nextLine();
        
        while ( t -- > 0 )
        {
            String s1 = sc.nextLine(), s2 = sc.nextLine();

            Vector<String> a = new Vector<String>();
            Vector<String> v = new Vector<String>();
            StringTokenizer ss;
            ss = new StringTokenizer(s1);

            while (ss.hasMoreTokens())
            {
                a.add(ss.nextToken());
            }
            
            Map<String, Integer> m = new HashMap<String, Integer>();

            ss = new StringTokenizer(s2);

            while (ss.hasMoreTokens())
            {
                String s = ss.nextToken();
                m.put(s, 1);
            }

            for (int i = 0; i < a.size(); ++ i)
            {
                if (m.get(a.get(i)) == null )
                {
                    v.add(a.get(i));
                    m.put(a.get(i), 1);
                }
            }
            Collections.sort(v);
            for (String x : v)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
