import java.util.ArrayList;
import java.util.Scanner;

public class J03030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>();
        int i = 0; 
        while (i < s.length())
        {
            int j = i + 1;
            while (j < s.length() && s.charAt(j) == s.charAt(i))
                j ++ ;
            a.add(s.charAt(i) - 'A');
            f.add(j - i);
            i = j;
        }
        int n = a.size();
        boolean ok = true;
        int res = 0;
        for (i = n - 1; i >= 0; -- i)
        {
            if(a.get(i) == 1 && ok)
            {
                res ++ ;
                if (f.get(i) > 1)
                {
                    ok = false; 
                }
            }
            else if (a.get(i) == 0 && !ok)
            {
                res ++ ;
                if (f.get(i) > 1)
                    ok = true;
            }
        }
        System.out.println(res);
    }
}
