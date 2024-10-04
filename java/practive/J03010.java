
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class J03010 {
    
    public static void devide(String s, Vector<String> v)
    {
        StringTokenizer ss = new StringTokenizer(s);

        while (ss.hasMoreElements()) {
            v.add(ss.nextToken());
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        sc.nextLine();
        Map<String, Integer> m = new HashMap<String, Integer>();
        while ( t -- > 0 )
        {
            String s = sc.nextLine();
            s = s.toLowerCase();
            Vector<String> v = new Vector<String>();

            devide(s, v);

            String res = v.get(v.size() - 1);
            for (int i = 0; i < v.size() - 1; ++ i)
            {
                res += v.get(i).substring(0, 1);
            }
            if (m.containsKey(res))
            {
                int cnt = m.get(res) + 1;
                System.out.println(res + cnt + "@ptit.edu.vn");
                m.put(res, cnt);
            }
            else
            {
                System.out.println(res + "@ptit.edu.vn");
                m.put(res, 1);
            }
        }
    }
}
