import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J07004 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));

        Map<Integer, Integer> m = new HashMap<>();

        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (m.containsKey(x))
            {
                m.put(x, m.get(x) + 1);
            }
            else m.put(x, 1);
        }
        Set<Integer> s = m.keySet();
        for (Integer x : s)
        {
            System.out.println(x + " " + m.get(x));
        }
    }
}