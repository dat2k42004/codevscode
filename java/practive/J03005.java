
import java.util.Scanner;
import java.util.Vector;

public class J03005
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t -- > 0)
        {
            String s = sc.nextLine();

            Vector<String> v = new Vector<String>();

            String x = "";
            s = s.toLowerCase() + " ";
            for(int i = 0; i < s.length(); ++ i)
            {
                if(s.charAt(i) == ' ')
                {
                    if(x != "")
                    {
                        v.add(x);
                        x =  "";
                    }
                }
                else
                {
                    x += s.charAt(i);
                }
            }
            for(int i = 1; i < v.size(); ++ i)
            {
                String u = v.get(i);
                System.out.print(u.substring(0, 1).toUpperCase() + u.substring(1));
                if (i != v.size() - 1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println(", " + v.get(0).toUpperCase());
        }
    }
}