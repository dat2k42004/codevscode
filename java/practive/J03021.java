
import java.util.Scanner;
import java.util.Vector;

public class J03021 {
    static Vector<String> v = new Vector<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        v.add("ABC");
        v.add("DEF");
        v.add("GHI");
        v.add("JKL");
        v.add("MNO");
        v.add("PQRS");
        v.add("TUV");
        v.add("WXYZ");

        int t = sc.nextInt();

        while ( t -- > 0 )
        {
            String s = sc.next();

            s = s.toUpperCase();

            boolean ok = true;

            int l = 0, r = s.length() - 1;
            while ( l < r )
            {
                for (int i = 0; i < v.size(); ++ i)
                {
                    if(v.get(i).contains(String.valueOf(s.charAt(l))) && !v.get(i).contains(String.valueOf(s.charAt(r))))
                    {
                        ok = false;
                        break;
                    }
                }
                l ++ ;
                r -- ;
            }
            if (ok)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
