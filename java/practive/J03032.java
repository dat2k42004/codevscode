
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        sc.nextLine();

        while ( t -- > 0 )
        {
            String s = sc.nextLine();

            Vector<String> v = new Vector<String>();

            StringTokenizer ss = new StringTokenizer(s);

            while ( ss.hasMoreTokens() )
            {
                v.add( ss.nextToken() );
            }
            for (int i = 0; i < v.size(); ++ i)
            {
                StringBuffer k = new StringBuffer(v.get(i));
                System.out.print(k.reverse() + " ");
            }
            System.out.println();
        }
    }
}
