import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>) os.readObject();

        HashMap<String, Integer> m = new HashMap<>();

        for (String x : a)
        {
            String[] res = x.trim().toLowerCase().split("\\s+");
            for(int i = 0; i < res.length; ++ i)
            {
                m.put(res[i], 1);
            }
        }

        os.close();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            String[] res = s.trim().toLowerCase().split("\\s+");
            for (int i = 0; i < res.length; ++ i)
            {
                lhm.put(res[i], 1);
            }
        }
        for(String x : lhm.keySet())
        {
            if(m.containsKey(x))
                System.out.println(x);
        }
    }
}
