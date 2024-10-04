import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("DATA.in"));
        while (true)
        {
            String s = sc.nextLine();
            if(s.equals("END")) 
                break;
            Vector<String> v = new Vector<>();
            String tmp = "";

            s = s.toLowerCase() + " ";
            for (int i = 0; i < s.length(); ++ i)
            {
                if (s.charAt(i) == ' ')
                {
                    if(tmp != "")
                    {
                        v.add(tmp);
                        tmp = "";
                    }
                }
                else 
                    tmp += s.charAt(i);
            }
            for (String x : v)
                System.out.printf("%s ", x.substring(0, 1).toUpperCase() + x.substring(1));
            System.out.println();
        }
    }
}
