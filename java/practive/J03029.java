import java.util.ArrayList;
import java.util.Scanner;

public class J03029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = ".!?";
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNextLine())
        {
            String s = sc.nextLine().trim().toLowerCase();
            if (tmp.indexOf(s.substring(s.length() - 1)) == -1)
                s = s + ".";
            a.add(s);
        }
        for (String x : a)
        {
            x = x.substring(0, 1).toUpperCase() + x.substring(1);
            String[] res = x.split("\\s+");
            int n = res.length;
            if (res[n - 1].length() == 1 && tmp.contains(res[n - 1]))
            {
                if(n > 1)
                {
                    res[n - 2] += res[n - 1];
                    n --;
                }
            }
            int i = 0;
            while(i < n)
            {
                System.out.printf("%s ", res[i]);
                i ++ ;
            }
            System.out.println();
        }
    }
}
