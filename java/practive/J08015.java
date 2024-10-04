
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while ( t -- > 0 )
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            Map<Long, Long> m = new HashMap<>();
            for (int i = 0; i < n; ++ i)
            {
                long x = sc.nextInt();
                if(m.containsKey(x))
                    m.put(x, m.get(x) + 1);
                else 
                    m.put(x, 1l);
            }
            sc.nextLine();
            long res = 0;
            ArrayList<Long> a = new ArrayList<>();
            for (Long x : m.keySet())
            {
                if(m.containsKey(k - x) && !a.contains(k - x))
                {
                    if (x != k - x)
                    {
                        res += m.get(x) * m.get(k - x);
                        a.add(x);
                        a.add(k - x);
                    }
                    else
                    {
                        long tmp = m.get(x);
                        res += tmp * (tmp - 1) / 2;
                        a.add(x);
                    }
                }
            }
            System.out.println(res);
        }
    }    
}
