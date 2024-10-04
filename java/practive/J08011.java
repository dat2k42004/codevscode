
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J08011 {
    static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; ++i) {
            if (s.charAt(i) > s.charAt(i + 1))
                return false;
        }
        return true;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> m = new LinkedHashMap<>();

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String res[] = s.trim().split("\\s+");
            for (int i = 0; i < res.length; ++i) {
                if (check(res[i])) {
                    if (m.containsKey(res[i]))
                        m.put(res[i], m.get(res[i]) + 1);
                    else
                        m.put(res[i], 1);
                }
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (String x : m.keySet())
            a.add(m.get(x));
        Collections.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 >= o2 ? -1 : 1;
            }
        });
        for (Integer x : a)
        {
            for (String y : m.keySet())
            {
                if (m.get(y) == x)
                {
                    System.out.println(y + " " + x);
                    m.remove(y);
                    break;
                }
            }
        }
    }
}
