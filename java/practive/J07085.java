
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07085 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) os.readObject();
        for (String x : a)
        {
            String res = "";
            int cnt = 0;
            for (int i = 0; i < x.length(); ++ i)
            {
                if(x.charAt(i) >= '0' && x.charAt(i) <= '9')
                {
                    if (x.charAt(i) == '0' && res == "")
                        continue;
                    res += x.charAt(i);
                    cnt += x.charAt(i) - '0';
                }
            }
            System.out.println(res + " " + cnt);
        }
    }    
}
