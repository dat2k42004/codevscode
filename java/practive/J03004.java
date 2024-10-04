import java.util.Scanner;
import java.util.Vector;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t -- > 0)
        {
            
            String s = sc.nextLine();

            Vector<String> v = new Vector<String>();

            s = s.toLowerCase() + " ";
            String x = "";
            for(int i = 0; i < s.length(); ++ i)
            {
                if(s.charAt(i) == ' ')
                {
                    if(x != "")
                    {
                        v.add(x);
                        x = "";
                    }
                }
                else
                {
                    x += s.charAt(i);
                }
            }
            for(int i = 0; i < v.size(); ++ i)
            {
                String c = v.get(i);
                System.out.print(c.substring(0, 1).toUpperCase() + c.substring(1) + " ");
            }
            System.out.println();
        }
    }
}
