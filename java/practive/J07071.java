import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07071 {
    static boolean check(String s, String x)
    {
        String[] res = x.split("\\s+");
        x = "";
        for(int i = 0; i < res.length; ++ i)
            x += res[i].substring(0, 1) + ".";
        s = s + ".";
        int n = s.length();
        int cnt = 0;
        if(s.length() != x.length())
            return false;
        for (int i = 0; i < n; ++ i)
        {
            if(s.charAt(i) != x.charAt(i))
                cnt ++;
            if(cnt > 1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = sc.nextInt();
        ArrayList<String> a = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; ++ i)
        {
            a.add(sc.nextLine().trim());
        }
        Collections.sort(a, new Comparator<String>()
        {
            @Override
            public int compare(String a, String b)
            {
                String x1 = a.substring(a.lastIndexOf(" ") + 1);
                String x2 = b.substring(b.lastIndexOf(" ") + 1);
                String y1 = a.substring(0, a.lastIndexOf(" "));
                String y2 = b.substring(0, b.lastIndexOf(" "));
                if (x1.compareTo(x2) == 0)
                    return y1.compareTo(y2);
                return x1.compareTo(x2);
            }
        });
        int t = sc.nextInt();
        sc.nextLine();
        while (t -- > 0)
        {
            String s = sc.nextLine().trim();
            for(String x : a)
                if(check(s, x))
                    System.out.println(x);
        }
    }
}
